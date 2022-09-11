package second;

import first.LoginPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    private static WebDriver driver;



    @Given("User opened url https:\\/\\/mystore-testlab.coderslab.pl")
    public void userOpenedUrlHttpsMystoreTestlabCoderslabPl() {
         {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");


        }
    }

    @When("loged in on existing account")
    public void logedInOnExistingAccount() {
        LoginPageObject loginPageObject = new LoginPageObject(driver);
       loginPageObject.loginAs("alan@gmail.com", "12345");
    }
    @And("has selected Hummingbird Printed Sweater")
    public void hasSelectedHummingbirdPrintedSweater() {
        HomePageObj homePageObj = new HomePageObj(driver);
        homePageObj.HummingbirdSweater.click();
    }
    @And("has selected size")
    public void hasSelectedSize() {
        SweaterObj sweaterObj = new SweaterObj(driver);
        sweaterObj.sizeInput.click();
        sweaterObj.sizeM.click();
    }
    @And("^has selected (.*) pieces$")
    public void hasSelectedPieces(String quantity) {
    SweaterObj sweaterObj = new SweaterObj(driver);
    sweaterObj.setQuantity(quantity);
    }


    @And("added its to card")
    public void addedItsToCard() {
        SweaterObj sweaterObj = new SweaterObj(driver);
        sweaterObj.addToCartButton.click();
    }

    @And("clicked PROCEED TO CHECKOUT")
    public void  clickedPROCEEDTOCHECKOUT() {
        ProceedToCheckout proceedToCheckout = new ProceedToCheckout(driver);
        proceedToCheckout.clickProcced();

    }

    @And("confirmed Address")
    public void confirmedAddress() {
        ShoopingCartObj shoopingCartObj = new ShoopingCartObj(driver);
        shoopingCartObj.procccedTocheckoutButton.click();
        OrderStepsObj orderStepsObj = new OrderStepsObj(driver);
        orderStepsObj.continnueButton.click();
    }

    @And("chosen pick up in store method of shipping")
    public void chosenPickUpInStoreMethodOfShipping() {
        OrderStepsObj orderStepsObj = new OrderStepsObj(driver);
        orderStepsObj.shipBuyContinnueButton.click();
    }

    @And("clicked on Pay by Check option")
    public void clickedOnPayByCheckOption() {
        OrderStepsObj orderStepsObj = new OrderStepsObj(driver);
        orderStepsObj.payByCheckInput.click();
        orderStepsObj.IAgreeToTheTermsOfService.click();

    }

    @And("clicked on order with an obligation to pay option")
    public void clickedOnOrderWithAnObligationToPayOption() {
        OrderStepsObj orderStepsObj = new OrderStepsObj(driver);
        orderStepsObj.orderWithObligationToPayButton.click();

    }

    @Then("taken screenshot of confirmed order")
    public void takenScreenshotOfConfirmedOrder() throws IOException {
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":","_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "MyStorByTest"+currentDateTime+".png"));

    }



}
