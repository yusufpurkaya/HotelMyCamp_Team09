package tests.us0008;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelManagerPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US0008_test {
    @Test
    public void test() throws IOException {
        LoginPage loginPage=new LoginPage();
        HotelManagerPage hotelManagerPage=new HotelManagerPage();
        SoftAssert softAssert=new SoftAssert();
        loginPage.login();
        //1- https://www.hotelmycamp.com/ sitesindeki log in butonu tıklanabilir olmalı
        //String title = Driver.getDriver().getTitle();
        //softAssert.assertTrue(Driver.getDriver().getTitle().contains("Log in"),"title");
        //System.out.println(title);
        //2- Log in sayfasındaki "username","password" ve "log in" butonları tıklanabilir olmalı

        String actualAdminText=hotelManagerPage.listOfUsersWebElement.getText();
        String expectedAdminText=ConfigReader.getProperty("expectedAdminText");
        softAssert.assertEquals(actualAdminText,expectedAdminText);

        //3- Açılan sayfadaki "Hotel Management" butonu tıklanabilir olmalı
        softAssert.assertTrue(hotelManagerPage.hotelManagerButonuWebElement.isDisplayed());
        hotelManagerPage.hotelManagerButonuWebElement.click();

        //4- "Hotel Management" menüsünde "Hotel reservations" butonu tıklanabilir olmalı
        hotelManagerPage.roomReservationsWebElement.click();
        String expectedListOfReservationsText =ConfigReader.getProperty("expectedListOfReservationsText");
        String actualListOfReservationsText =hotelManagerPage.listOfReservationsWebElement.getText();
        hotelManagerPage.roomReservationsWebElement.click();
        softAssert.assertEquals(actualListOfReservationsText,expectedListOfReservationsText,"elemente ulaşılamadı");

        //5-"Hotel reservations" sayfasında "ADD ROOM RESEVATION" butonu tıklanabilir olmalı
        hotelManagerPage.addRoomReservationsWebElement.click();
        softAssert.assertTrue(hotelManagerPage.selectUserDropdownWebElement.isDisplayed(),"elemente ulasilamadi");

        //6- "Create Hotelroomreservatıon" listesindeki textboxlar ve "SAVE" butonu tıklanabilir olmalı
        hotelManagerPage.createHotelRoomReservation();
        softAssert.assertTrue(hotelManagerPage.alertTextWebElement.isDisplayed());

        //7- "RoomReservation was inserted successfully" mesajı görülebilmeli ve "OK" butonu tıklanabilir olmalı
        ReusableMethods.getScreenshot("alert_yazisi");
        hotelManagerPage.alertButtonWebElement.click();
        Driver.closeDriver();
        softAssert.assertAll();
    }
}
