package second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SweaterObj {
    private WebDriver driver;

    public SweaterObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"group_1\"]")
    WebElement sizeInput;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[2]")
    WebElement sizeM;
    @FindBy(id = "quantity_wanted")
    WebElement quantityInput;
    @FindBy(css = "#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button")
    WebElement addToCartButton;

    public void setSize(String size) {

    }

    public void setQuantity(String quantity) {
        quantityInput.clear();
        quantityInput.sendKeys(quantity);

    }



}

