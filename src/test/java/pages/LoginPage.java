package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;

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
       // Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
       // ilkSayfaLoginButtonWebElement.click();
        usernameWebElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordWebElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        accountLoginWebElement.click();
    }
    //----------------us10
@FindBy(xpath = "//h1[@class='mb-4 bread']")
   public WebElement loginEkrani;
    @FindBy(xpath = "//span[@class='btn btn-primary py-3 px-5']")
public WebElement createANewAccountButton;
@FindBy(xpath = "//input[@id='UserName']")
public WebElement registrationUsername;
@FindBy(xpath = "//input[@id='Password']")
 public WebElement registrationPassword;
@FindBy(xpath = "//Select[@name='IDCountry']")
public WebElement registrationCountry;
Actions actions=new Actions(Driver.getDriver());
 Faker faker=new Faker();
    String fakername=faker.name().name();
    String fakerpassword=faker.internet().password();
    Select select=new Select(registrationCountry);
    Random rdm=new Random();
  //  int ulkeindex=rdm.nextInt(24,265);

    public void yeniHesapOlustur(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkSayfaLoginButtonWebElement.click();
        createANewAccountButton.click();

        registrationUsername.sendKeys(fakername+ Keys.TAB);
registrationPassword.sendKeys(fakerpassword+Keys.TAB);
actions.sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).
        sendKeys(fakername+faker.name().lastName()).sendKeys(Keys.TAB).
        sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).
        sendKeys("yes").sendKeys(Keys.TAB).

       perform();

    }

}
