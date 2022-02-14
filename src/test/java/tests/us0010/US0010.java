package tests.us0010;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US0010 {
   LoginPage loginPage=new LoginPage();
    SoftAssert softAssert=new SoftAssert();
    @Test
    public void testCase01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        loginPage.ilkSayfaLoginButtonWebElement.click();
        softAssert.assertTrue(loginPage.loginEkrani.isDisplayed());
        softAssert.assertAll();
    }
}
