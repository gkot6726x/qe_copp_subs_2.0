package com.sysco.qe.subs.util;

import com.syscolab.qe.core.common.LoggerUtil;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class EncryptData {
    public static final String ENCRYPTION_KEY = "8fKpZB21s/VIGLI/rhfwKA==";
    public static final String NOTHING_TO_ENCRYPT_MESSAGE = "Please pass in text to encrypt in the following format: -Dexec.args='textToEncrypt'";
    protected static final byte[] INITIALIZATION_VECTOR_BYTES = new byte[]{87, -77, 121, 71, 39, -7, -78, 32, 51, -27, 37, -27, 60, 113, -23, -20};
    private static final String CHARACTER_ENCODING = "UTF-8";
    private static final String CIPHER_TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final String AES_ENCRYPTION_ALGORITHM = "AES";

    private EncryptData() {
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        LoggerUtil.logINFO(encrypt(""));
    }

    static String execute(String plainText) throws UnsupportedEncodingException {
        if ("default".equals(plainText)) {
            return NOTHING_TO_ENCRYPT_MESSAGE;
        }

        String encryptedText = encrypt(plainText);

        return "Encrypted text: " + encryptedText + "\n" +
                "Decrypted text: " + decrypt(encryptedText);

    }

    public static String encrypt(String plainText) throws UnsupportedEncodingException {

        IvParameterSpec initializationVectorSpec = new IvParameterSpec(INITIALIZATION_VECTOR_BYTES);
        byte[] cypheredBytes = getEncryptedBytes(plainText.getBytes(), initializationVectorSpec);
        byte[] joinedBytes = join(initializationVectorSpec, cypheredBytes);
        byte[] encodedBytes = Base64.encodeBase64(joinedBytes);

        return new String(encodedBytes, CHARACTER_ENCODING);
    }

    public static String decrypt(String encryptedText) throws UnsupportedEncodingException {

        byte[] encryptedTextBytes = Base64.decodeBase64(encryptedText.getBytes());

        byte[] initialVector = Arrays.copyOfRange(encryptedTextBytes, 0, 16);
        byte[] trimmedCipherText = Arrays.copyOfRange(encryptedTextBytes, 16, encryptedTextBytes.length);
        byte[] decryptedTextBytes = getDecryptedBytes(trimmedCipherText, new IvParameterSpec(initialVector));

        return new String(decryptedTextBytes, CHARACTER_ENCODING);
    }

    private static byte[] join(IvParameterSpec initializationVectorSpec, byte[] cypheredBytes) {
        int ivSpecLength = initializationVectorSpec.getIV().length;
        byte[] putTogether = new byte[ivSpecLength + cypheredBytes.length];
        System.arraycopy(initializationVectorSpec.getIV(), 0, putTogether, 0, ivSpecLength);
        System.arraycopy(cypheredBytes, 0, putTogether, ivSpecLength, cypheredBytes.length);
        return putTogether;
    }

    private static Cipher getCipher() {
        try {
            return Cipher.getInstance(CIPHER_TRANSFORMATION);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Unable to getCipher", e);
        }
    }

    private static SecretKey createSecretKey() {
        byte[] encryptionKeyBytes = Base64.decodeBase64(ENCRYPTION_KEY.getBytes());
        return new SecretKeySpec(encryptionKeyBytes, AES_ENCRYPTION_ALGORITHM);
    }

    private static byte[] getEncryptedBytes(byte[] plainTextBytes, IvParameterSpec initializationVectorSpec) {
        return getBytesWith(Cipher.ENCRYPT_MODE, plainTextBytes, initializationVectorSpec);
    }

    private static byte[] getDecryptedBytes(byte[] trimmedCipherText, IvParameterSpec initializationVectorSpec) {
        return getBytesWith(Cipher.DECRYPT_MODE, trimmedCipherText, initializationVectorSpec);
    }

    private static byte[] getBytesWith(int encryptMode, byte[] textBytes, IvParameterSpec initializationVectorSpec) {
        Cipher cipher = getCipher();
        byte[] bytes;

        try {
            cipher.init(encryptMode, createSecretKey(), initializationVectorSpec);
            bytes = cipher.doFinal(textBytes);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Unable to encrypt", e);
        }

        return bytes;
    }
}
