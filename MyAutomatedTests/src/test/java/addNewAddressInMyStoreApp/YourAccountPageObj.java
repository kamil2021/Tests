package addNewAddressInMyStoreApp;

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
//    @FindBy(css = "#address-28712 > div.address-footer > a:nth-child(2)")
//    WebElement deleteButton;
//    @FindBy(xpath = "//*[@id=\"notifications\"]/div/article/ul/li")
//    WebElement phraseSucceffulyDeleted;

    public void clickOnAddressesButton() {
        newAddressesButton.click();
    }


}
