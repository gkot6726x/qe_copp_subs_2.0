package com.sysco.qe.subs.util;

import com.syscolab.qe.core.common.LoggerUtil;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    int retryLimit = 1;
    @Override
    public boolean retry(ITestResult var1) {
        if(counter < retryLimit)
        {
            counter++;
            LoggerUtil.logINFO("Starting Test Rerun ");
            return true;
        }
        return false;
    }
}
