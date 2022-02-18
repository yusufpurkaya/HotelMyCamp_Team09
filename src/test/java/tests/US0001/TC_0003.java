package tests.US0001;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC_0003 {

    @Test
    public void checkInOutButonuTesti() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnasayfaPage anasayfaPage = new AnasayfaPage();
        anasayfaPage.mainCheckinDateButonu.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(anasayfaPage.checkinDateSonuc.isEnabled());
        anasayfaPage.mainCheckoutDateButonu.click();
        Assert.assertTrue(anasayfaPage.checkoutDateSonuc.isEnabled());
        anasayfaPage.anasayfaOdaTuruSecim.click();
        Select select = new Select(anasayfaPage.anasayfaOdaTuruSecim);
        select.selectByVisibleText("Single");
        String actuelSingleButonu=anasayfaPage.singleElementi.getText();

        //  String expectedResult = "Single";
        Assert.assertTrue(anasayfaPage.singleElementi.isEnabled());
        ReusableMethods.getScreenshot("foto");





        anasayfaPage.yetiskinSayisiButonu.click();
        Select select1=new Select(anasayfaPage.yetiskinSayisiButonu);
        select1.selectByIndex(5);

        Assert.assertTrue(anasayfaPage.yetiskinSayisiButonu.isDisplayed());
        ReusableMethods.getScreenshot("foto1");


    }
}
