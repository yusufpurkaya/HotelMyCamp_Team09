package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //ilk sayfa login butonu
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkSayfaLoginButtonWebElement;

    //username textbox
    @FindBy(id = "UserName")
    public  WebElement usernameWebElement;

    //password textbox
    @FindBy(id = "Password")
    public  WebElement passwordWebElement;

    //AccountLogin butonu
    @FindBy(id = "btnSubmit")
    public WebElement accountLoginWebElement;

    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkSayfaLoginButtonWebElement.click();
        usernameWebElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordWebElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        accountLoginWebElement.click();
    }
}
