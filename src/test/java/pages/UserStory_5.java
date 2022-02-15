package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class UserStory_5 extends TestBase {

    /*
     1- Yonetici; https://www.hotelmycamp.com/ URL adresine giris yapabilmeli.
    2- "Hotel Management'' sonra "Hotel List" menüsüne tıklanalabilmeli ve "List of Hotel" yazısı görülmeli.
    3- "Details" butonuna tıklayabilmeli ve cikan sayfada "Edit hotel" yazisi kontrol edilmeli
    4- "Code,Name,Adress,Phone,Email,Group" secenekleri güncellenebilmeli "Save" butonuna tıklanabilmeli.
    5- "Hotel was updated successfully" yazısı görülebilmeli ve "Ok" Butonu tıklanılabilmeli.
    6- "Delete" butonuna tıklanılabilmeli "Would you like to continue?" yazısının görünürlüğü test edilmeli.
    7- "Ok" butonu tiklanabilir olmali ve otel bilgisi silinebilmeli.
     */


    @Test
    public void userStory5() throws InterruptedException {
        //1- Yonetici; https://www.hotelmycamp.com/ URL adresine giris yapabilmeli.
        driver.navigate().to("https://www.hotelmycamp.com/");

        WebElement loginButonu = driver.findElement(By.xpath("(//a[@class='nav-link'])[7]"));
        loginButonu.click();

        WebElement usernameButonu = driver.findElement(By.xpath("//input[@id='UserName']"));
        usernameButonu.sendKeys("manager", Keys.ENTER);

        WebElement passwordButonu = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordButonu.sendKeys("Manager1!", Keys.ENTER);

        //  2- "Hotel Management'' sonra "Hotel List" menüsüne tıklanalabilmeli ve "List of Hotel" yazısı görülmeli.

        WebElement hotelManagementButonu = driver.findElement(By.id("menuHotels"));
        hotelManagementButonu.click();

        WebElement hotelListButonu = driver.findElement(By.xpath("(//a[@href='/admin/HotelAdmin'])[1]"));
        hotelListButonu.click();

        String listOfHotelYazisi = driver.findElement(By.xpath("(//a[@href='#'])[1]")).getText();
        System.out.println(" Hotels > " + listOfHotelYazisi);

        //   3- "Details" butonuna tıklayabilmeli ve cikan sayfada "Edit hotel" yazisi kontrol edilmeli

        WebElement detailsButonu = driver.findElement(By.xpath("(//a[@class='btn btn-xs default'])[1]"));
        detailsButonu.click();

        // "Edit hotel" yazisi kontrol edilmeli.

        WebElement editHotelButonu = driver.findElement(By.xpath("(//a[@href=\"#\"])[1]"));
        editHotelButonu.click();

        // 4- "Code,Name,Adress,Phone,Email,Group" secenekleri güncellenebilmeli "Save" butonuna tıklanabilmeli.
    }
}