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

    private static WebDriver driver;
    private Scenario scenario;

    @BeforeAll
    public static void setUp() {
        //this.scenario = scenario;
        System.setProperty("webdriver.chrome.driver", "/Users/aitorsolano/Downloads/chromedriver");
        driver = new ChromeDriver();
    }

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("Vamos a la página de inicio")
    public void yoVoyPaginaPrincipal() {
        driver.get("https://demoqa.com/text-box");
    }

    @Then("Deberia ver un apartado {string}")
    public void yoDeberiaVerApartado(String element) {

        if (element.equals("Elements")){
            By byXPath = By.xpath(".//div[contains(text(),'"+element+"')]");
            boolean present = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(present);
        }
    }

    @When("Deberia escribir {string}")
    public void yoEscribo(String texto) {
        if (texto.equals("Aitor")){
            WebElement elemento = driver.findElement(By.id("userName"));
            elemento.sendKeys(texto);
            Assertions.assertTrue(elemento.getAttribute("value").contains("Aitor"));
        }
        if (texto.equals("aitor@aitor.com")){
            WebElement elemento = driver.findElement(By.id("userEmail"));
            elemento.sendKeys(texto);
            Assertions.assertTrue(elemento.getAttribute("value").contains("aitor@aitor.com"));
        }

    }

    @Then("Borro {string}")
    public void yoBorroLoEscrito(String borro) {

        if (borro.equals("email")){
        WebElement elemento = driver.findElement(By.id("userEmail"));
        elemento.click();
        }
    }

    @Then("Hago click en el siguiente apartado")
    public void yoClicoSiguienteApartado() {
        WebElement boton = driver.findElement(By.id("userEmail"));
        boton.click();
    }

    @And("Hago una captura de pantalla con el filename {string}")
    public void yoHagoScreenshotConFileName(String filename) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "filename");
    }

    @AfterAll()
    public static void tearDown() {
        driver.quit();
    }

}
