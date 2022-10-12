package com.sysco.qe.subs.util;

import com.sysco.qe.subs.data.EndPoints;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;
import io.restassured.response.Response;

public class DecisionUpdateUtil {

    private DecisionUpdateUtil(){
    }

    public static Response callDecisionUpdate(String accessToken, String requestBody) {
        return RestUtil.send(
                Headers.getGenericAPIHeaderForBE(accessToken),
                requestBody,
                EndPoints.DECISION_UPDATE,
                RequestMethods.POST.toString());
    }
}
