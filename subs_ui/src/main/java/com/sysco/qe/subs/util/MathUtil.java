package com.sysco.qe.subs.util;


public class MathUtil {
    private MathUtil() {
    }

    public static String roundOffGivenValueToThreeDecimalPlacesWithTrailingZeros(Double value) {
        return String.format("%.3f", value);
    }

    public static String roundOffGivenValueToTwoDecimalPlacesWithTrailingZeros(Double value) {
        return String.format("%.2f", value);
    }

    public static String getGivenValueWithThousandSeparators(Integer value) {
        return String.format("%,d", value);
    }

}
