package com.thetestingacademy.tests.crud;

import com.thetestingacademy.base.BaseTest;
import com.thetestingacademy.endpoints.APIConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestCreateToken extends BaseTest {


    @Test(groups = "reg", priority = 1)
    @TmsLink("https://bugz.atlassian.net/browse/TS-1")
    @Owner("Promode")
    @Description("TC#2  - Create Token and Verify")
    public void testTokenPOST() {
        // Prep of Req
        requestSpecification.basePath(APIConstants.AUTH_URL);

        // Making of the Request.
        response = RestAssured.given(requestSpecification).when().body(payloadManager.setAuthPayload()).post();

        // Extraction ( JSON String response to Java Object
        String token = payloadManager.getTokenFromJSON(response.asString());
        System.out.println(token);

        // Validation of the request.
        assertActions.verifyStringKeyNotNull(token);


    }

}
