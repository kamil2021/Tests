package buyProductInMyStoreApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoopingCartObj {
private WebDriver driver;

ShoopingCartObj(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);

}
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    WebElement procccedTocheckoutButton;




}
