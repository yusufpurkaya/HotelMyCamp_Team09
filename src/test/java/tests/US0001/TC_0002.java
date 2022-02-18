package tests.US0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0002 {

    @Test
    public void navbarTesti(){


        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnasayfaPage anasayfaPage=new AnasayfaPage();
        anasayfaPage.mainHomeButonu.click();
        String actuelResultHome=Driver.getDriver().getTitle();
        String expectedResultHome="Home";
        Assert.assertTrue(actuelResultHome.contains(expectedResultHome));
        anasayfaPage.mainRoomsButonu.click();
        String actuelResultRooms=Driver.getDriver().getTitle();
        String expectedResultRooms="Rooms";
        Assert.assertTrue(actuelResultRooms.contains(expectedResultRooms));
        anasayfaPage.mainRestaurantButonu.click();
        String actuelResultRestaurant=Driver.getDriver().getTitle();
        String expectedResultRestaurant="Restaurant";
        Assert.assertTrue(actuelResultRestaurant.contains(expectedResultRestaurant));

        anasayfaPage.mainAboutButonu.click();
        String actuelResultAbout=Driver.getDriver().getTitle();
        String expectedResultAbout="About";
        Assert.assertTrue(actuelResultAbout.contains(expectedResultAbout));

        anasayfaPage.mainBlogButonu.click();
        String actuelResultBlog=Driver.getDriver().getTitle();
        String expectedResultBlog="Blog";
        Assert.assertTrue(actuelResultBlog.contains(expectedResultBlog));

        anasayfaPage.mainContactButonu.click();
        String actuelResultContact=Driver.getDriver().getTitle();
        String expectedResultContact="Contact";
        Assert.assertTrue(actuelResultContact.contains(expectedResultContact));

        anasayfaPage.mainLoginButonu.click();
        //String actuelResultLogin=Driver.getDriver().getTitle();
        String expectedResultLogin="Log in";
        Assert.assertTrue(anasayfaPage.loginSayfasiBasariliGiris.isDisplayed());



    }


}
