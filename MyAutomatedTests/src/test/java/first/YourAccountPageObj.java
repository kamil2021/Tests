package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPageObj {
    private WebDriver driver;

    public YourAccountPageObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"addresses-link\"]/span")
    WebElement newAddressesButton;
    @FindBy(css = "#notifications > div > article > ul > li")
    WebElement addressSuccessfullyAdded;
    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]")
     WebElement deleteButton;
    @FindBy(xpath = "//*[@id=\"notifications\"]/div/article/ul/li")
    WebElement phraseSucceffulyDeleted;

    public void clickOnAddressesButton() {
        newAddressesButton.click();
    }


}
