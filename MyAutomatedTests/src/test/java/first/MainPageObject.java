package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObject {
    private WebDriver driver;

    public MainPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[2]/span")
    WebElement userName;


    public void ViewAccountOptions() {
      //  WebElement userName = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span"));
        userName.click();
    }








}
