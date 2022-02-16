package tests.US0001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;



public class TC_0005 {


    @Test
    public  void  recentBlogTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnasayfaPage anasayfaPage=new AnasayfaPage();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        Assert.assertTrue(anasayfaPage.recentBlogYazisi.isDisplayed());

        anasayfaPage.recentblogButonu1.click();
        String actualResultblog1=Driver.getDriver().getTitle();
        String expectedResultrecentblog1="blind texts 6";
        Assert.assertTrue(actualResultblog1.contains(expectedResultrecentblog1));

        anasayfaPage.recentblogButonu2.click();
        String actualResultblog2=Driver.getDriver().getTitle();
        String expectedResultrecentblog2="blind texts 5";
        Assert.assertTrue(actualResultblog2.contains(expectedResultrecentblog2));



    }
}
