package tests.us0002;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelManagerPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;


public class Us_0002 extends TestBaseRapor {
HotelManagerPage hotelManagerPage=new HotelManagerPage();
LoginPage loginPage=new LoginPage();

@Test
public void testCase01 () throws IOException {
	//Kullanıcı https://www.hotelmycamp.com adresine erişebilmeli
	
	extentTest=extentReports.createTest("US0002 Rapor","HotelMyCamp websayfası'na gidildiği test edildi");
	Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
	extentTest.pass("HMC sayfasına gidildi");
	
}

@Test
public void testCase02 (){
	//Kullanıcı menüde bulunan Log in butonuna tıklayabilmeli
	//Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
	loginPage.ilkSayfaLoginButtonWebElement.click();
	extentTest.pass("Menüdeki Log in butonuna tıklandı");
	
}
@Test
public void testCase03 (){
	//Kullanıcı log in sayfasında doğru username girebilmeli
	loginPage.ilkSayfaLoginButtonWebElement.click();
	loginPage.usernameWebElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
	extentTest.pass("Doğru username girildi");
	
	
}
@Test
public void testCase04 (){
	//Kullanıcı log in sayfasında doğru password girebilmeli
	loginPage.passwordWebElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
	extentTest.pass("Doğru password girildi");
	
	
}
@Test
public void testCase05 (){
	//Kullanıcı login butonuna tıklayabilmeli
	loginPage.accountLoginWebElement.click();
	extentTest.pass("Log in butonuna tıklandı");
	
	
}
@Test
public void testCase06 (){
	//Kullanıcı başarılı bir şekilde giriş yapabilmeli
	ReusableMethods.waitFor(4);
	Assert.assertTrue(hotelManagerPage.hotelManagerButonuWebElement.isDisplayed());
	extentTest.pass("Kullanıcı başarılı bir şekilde giriş yaptı");
	
}
}
