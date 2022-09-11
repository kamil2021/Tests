package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

    private static WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath =" //*[@id=\"login-form\"]/section/div[1]/div[1]/input")
    WebElement emailInput ;
    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")
    WebElement passInput;
    @FindBy(id = "submit-login")
    WebElement submitButton;

    public void loginAs(String email, String password) {
         emailInput.sendKeys(email);
         passInput.sendKeys(password);
         submitButton.click();
    }
}

