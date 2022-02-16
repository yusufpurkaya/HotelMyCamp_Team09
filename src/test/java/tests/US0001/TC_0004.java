package tests.US0001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;



public class TC_0004 {

    @Test
    public void ourRoomsTesti() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnasayfaPage anasayfaPage=new AnasayfaPage();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        anasayfaPage.birinciOdaButonu.click();
        String actuelResultOda1=Driver.getDriver().getCurrentUrl();
        String expectedResultOda1="260";
        Assert.assertTrue(actuelResultOda1.contains(expectedResultOda1));
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();



        anasayfaPage.ikinciOdaButonu.click();
        String actuelResultOda2=Driver.getDriver().getCurrentUrl();
        String expectedResultOda2="259";
        Assert.assertTrue(actuelResultOda2.contains(expectedResultOda2));

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();

        anasayfaPage.ucuncuOdaButonu.click();
        String actuelResultOda3=Driver.getDriver().getCurrentUrl();
        String expectedResultOda3="258";
        Assert.assertTrue(actuelResultOda3.contains(expectedResultOda3));

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();
        anasayfaPage.dorduncuOdaButonu.click();
        String actuelResultOda4=Driver.getDriver().getCurrentUrl();
        String expectedResultOda4="257";
        Assert.assertTrue(actuelResultOda4.contains(expectedResultOda4));

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();




        anasayfaPage.besinciOdaButonu.click();
        String actuelResultOda5=Driver.getDriver().getCurrentUrl();
        String expectedResultOda5="256";
        Assert.assertTrue(actuelResultOda5.contains(expectedResultOda5));
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN)
                .perform();

        anasayfaPage.altinciOdaButonu.click();
        String actuelResultOda6=Driver.getDriver().getCurrentUrl();
        String expectedResultOda6="255";
        Assert.assertTrue(actuelResultOda6.contains(expectedResultOda6));


    }


}