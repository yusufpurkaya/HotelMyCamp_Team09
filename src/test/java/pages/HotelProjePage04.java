package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelProjePage04 {

    public HotelProjePage04(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement hotelLoginButton;

    @FindBy(id="UserName")      ////input[@id='UserName']
    public WebElement hotelUsername;

    @FindBy(id="Password")
    public WebElement hotelPassword;

    @FindBy(id="btnSubmit")
    public WebElement hotelManagerLogin;

    @FindBy(xpath = "//span[text()='System Management']")
    public WebElement systemManagementLink;

    @FindBy(linkText = "Hotel Management")
//    @FindBy(xpath = "(//i[@class='icon-users'])[2]")
    //@FindBy(xpath = "(//span[@class='arrow'])[2]")
    public WebElement hotelManagementLink;

    @FindBy(linkText = "Hotel List")
    public WebElement hotelListLink;



}
