package com.thetestingacademy.tests.e2e_integration;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestIntegrationFlow2 {


    // Create Booking -> Delete it -> Verify
    // https://github.com/PramodDutta/APIAutomationFramworkATB11x/tree/main/src/test/java/com/thetestingacademy/tests/e2e_integration
    @Test(groups = "qa", priority = 1)
    @Owner("Promode")
    @Description("TC#INT1 - Step 1. Verify that the Booking can be Created")
    public void testCreateBooking(ITestContext iTestContext) {

    }

    @Test(groups = "qa", priority = 4)
    @Owner("Promode")
    @Description("TC#INT1 - Step 2. Delete the Booking by ID")
    public void testDeleteBookingById(ITestContext iTestContext) {
        Integer bookingid = (Integer) iTestContext.getAttribute("bookingid");
    }

    @Test(groups = "qa", priority = 2)
    @Owner("Promode")
    @Description("TC#INT1 - Step 3. Verify that the Booking By ID")
    public void testVerifyBookingId(ITestContext iTestContext) {
        Integer bookingid = (Integer) iTestContext.getAttribute("bookingid");

    }
}
