package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPageObj {
    private static WebDriver driver;

    public FormPageObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input")
    WebElement aliasInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input")
    WebElement addressInput;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input")
    WebElement cityInput;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input")
    WebElement zipInput;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select")
    WebElement countryInput;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input")
    WebElement phoneInput;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    WebElement saveButton;


    public void setAlias(String alias) {
        aliasInput.sendKeys(alias);
    }
    public void setAddress(String address) {
        addressInput.sendKeys(address);
    }

    public void setCity(String city) {
        cityInput.sendKeys(city);
    }
    public void setZipcode(String zip){
        zipInput.sendKeys(zip);
    }
    public void setPhone(String phone) {
        phoneInput.sendKeys(phone);
    }
    public void clickCountry(){
        countryInput.click();
    }
    public void choseCountry(String country){
        countryInput.sendKeys(country);
    }
    public void clickSaveButton() {
        saveButton.click();
    }
}
