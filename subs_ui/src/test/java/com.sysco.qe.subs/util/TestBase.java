package com.sysco.qe.subs.util;

import com.sysco.qe.subs.common.Constants;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolab.qe.core.reporting.SyscoLabQCenter;
import com.syscolab.qe.core.reporting.SyscoLabReporting;
import com.syscolab.qe.core.util.qcenter.QCenterUtil;
import org.json.JSONException;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.Date;

@Listeners(SyscoLabListener.class)

public class TestBase {

    public SoftAssert softAssert;
    private SyscoLabListener testListeners;
    private SyscoLabQCenter syscoLabQCenter;
    private long testSuiteDuration = 0;
    private long testSuiteStartTime = 0;

    @BeforeSuite
    public void createBuild() throws JSONException {
        QCenterUtil.generateBuild(Constants.TEST_PROJECT,Constants.TEST_ENV,Constants.TEST_RELEASE);
    }

    @BeforeClass(alwaysRun = true)
    public void init() {
        testSuiteDuration = 0;
        testSuiteStartTime = new Date().getTime();
        testListeners = new SyscoLabListener();
        syscoLabQCenter = new SyscoLabQCenter();
        if (Constants.DEBUG) {
            RestUtil.API_HOST = URL.AWS_BASE_URL;
            RestUtil.BASE_PATH = URL.AWS_BASE_PATH;
        } else {
            RestUtil.API_HOST = URL.BASE_URL;
            RestUtil.BASE_PATH = URL.BASE_PATH;
        }

    }

    @BeforeMethod(alwaysRun = true)
    public void initSoftAssert() {
        softAssert = new SoftAssert();
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("Test Running" + this.getClass().toString());
    }

    @AfterMethod(alwaysRun = true)
    public void setAutomationAttributes() {
        testSuiteDuration = new Date().getTime() - testSuiteStartTime;
        try {
            if (Constants.UPDATE_DASHBOARD)
                SyscoLabReporting.generateJsonFile(testListeners.getResults(), syscoLabQCenter, testSuiteDuration);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @AfterClass(alwaysRun = true)
    public void updateQCenter(ITestContext iTestContext) {
        try {

            if (Constants.UPDATE_DASHBOARD) {
                syscoLabQCenter.setProjectName(Constants.TEST_PROJECT);
                syscoLabQCenter.setEnvironment(Constants.TEST_ENV);
                syscoLabQCenter.setRelease(Constants.TEST_RELEASE);
                syscoLabQCenter.setModule(iTestContext.getAttribute("feature").toString());
                syscoLabQCenter.setFeature(iTestContext.getAttribute("feature").toString());
                syscoLabQCenter.setClassName(iTestContext.getClass().getName());

                SyscoLabReporting.generateJsonFile(testListeners.getResults(), syscoLabQCenter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
