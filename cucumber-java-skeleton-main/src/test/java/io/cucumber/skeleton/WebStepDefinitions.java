package io.cucumber.skeleton;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebStepDefinitions {

    /**
     * Note: You must have installed chromedriver in your system
     *       https://chromedriver.chromium.org/downloads
     *       The version must match with the version of your Chrome browser
     */

    private WebDriver driver;
    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
        System.setProperty("webdriver.chrome.driver", "/Users/aitorsolano/Downloads/chromedriver");
        driver = new ChromeDriver();
    }

    @Given("Vamos a la página de inicio")
    public void yoVoyPaginaPrincipal() {
        driver.get("https://www.fcbarcelona.es/es/");
    }

    @Then("Deberia ver un apartado {string} button/text")
    public void yoDeberiaVerApartado(String text) {
        By byXPath = By.xpath("//div[starts-with(@class,'" + text + "')]//li[@class='middle-navigation__sub-item']");
        //By byXPath = By.xpath("//div[@class='" + text + "')]");

        boolean present = driver.findElements(byXPath).size() > 0;
        Assertions.assertTrue(present);
    }

    @Then("Deberia ver un {string} button/text")
    public void yoDeberiaVerBoton(String text) {
        By byXPath = By.xpath("//button[contains(@class,'" + text + "')]");
        boolean present = driver.findElements(byXPath).size() > 0;
        Assertions.assertTrue(present);
    }

    @When("Hago click en button")
    public void yoClicoBoton() {
        //driver.findElement(By.linkText(button_text)).click();
        driver.findElement(By.cssSelector("button[class='user-options__button js-register']")).click();
    }

    /*@And("Hago una captura de pantalla con el filename {string}")
    public void yoHagoScreenshotConFilename(String filename) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "filename");
    }*/

    @After()
    public void cierroNavegador() {
        driver.quit();
    }

}
