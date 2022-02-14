package tests.us0008;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelManagerPage;
import pages.LoginPage;
import utilities.Driver;

public class US0008_test {
    @Test
    public void test(){
        LoginPage loginPage=new LoginPage();
        HotelManagerPage hotelManagerPage=new HotelManagerPage();

        loginPage.login();
        hotelManagerPage.createHotelRoomReservation();

        String actualAlertText =hotelManagerPage.alertTextWebElement.getText();
        String expectedAlertText ="RoomReservation was inserted successfully";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualAlertText,expectedAlertText);
        softAssert.assertAll();
        hotelManagerPage.alertButtonWebElement.click();
        Driver.closeDriver();
    }
}
