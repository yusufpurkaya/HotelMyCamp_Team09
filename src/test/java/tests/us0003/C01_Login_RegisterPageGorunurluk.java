package tests.us0003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelManagerPage;
import pages.HotelProjePage04;
import pages.HotelUserRegisterPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_Login_RegisterPageGorunurluk {

    @Test
    public void C01_Baslangic(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelProjePage04 hotelProjePage04=new HotelProjePage04();
        hotelProjePage04.hotelLoginButton.click();

        HotelUserRegisterPage hotelUserRegisterPage=new HotelUserRegisterPage();
        hotelUserRegisterPage.createANewAccountBox.click();

    }

}
