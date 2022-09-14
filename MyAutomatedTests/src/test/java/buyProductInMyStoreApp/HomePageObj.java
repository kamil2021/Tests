package buyProductInMyStoreApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObj {

    private static WebDriver driver;

    public HomePageObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/section/div/article[2]/div/div[1]/h3/a")
    WebElement HummingbirdSweater;

}
