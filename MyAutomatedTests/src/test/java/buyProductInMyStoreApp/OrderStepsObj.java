package buyProductInMyStoreApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class OrderStepsObj {
    private static WebDriver driver;

    public OrderStepsObj(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    WebElement continnueButton;

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    WebElement shipBuyContinnueButton;
    @FindBy(xpath = "//*[@id=\"payment-option-1\"]")
    WebElement payByCheckInput;
    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    WebElement IAgreeToTheTermsOfService;
    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    WebElement orderWithObligationToPayButton;
}
