package addNewAddressInMyStoreApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddressesPageObj {

        private WebDriver driver;

        public YourAddressesPageObj(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(css = "#content > div.addresses-footer > a > span")
        WebElement createNewAddressesButton;



        public void clickOnAddressesButton() {
            createNewAddressesButton.click();
        }

    }

