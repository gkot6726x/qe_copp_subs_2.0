package com.sysco.qe.subs.tests;

import com.sysco.qe.subs.util.RequestUtil;
import com.sysco.qe.subs.util.TestBase;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.testng.annotations.Test;

import java.io.IOException;

public class AuthenticationTest extends TestBase {

    @Test(alwaysRun = true, description = "RMPI-2350", priority = 2)
    public void testVerifyApigeeTokenReturned() throws OAuthProblemException, OAuthSystemException, IOException {
        RequestUtil.getApigeeToken();

    }

}

