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
        driver.get("https://demoqa.com/");
    }

    @When("Clicamos en {string}")
    public void clicarEn(String elementoClicado){
        if (elementoClicado.equals("Elements")) {
            WebElement boton = driver.findElement(By.className("card-up"));
            boton.click();
        }
        if (elementoClicado.equals("Text-Box")) {
            WebElement boton = driver.findElement(By.id("item-0"));
            boton.click();
        }
        if (elementoClicado.equals("Check-Box")) {
            WebElement boton = driver.findElement(By.id("item-1"));
            boton.click();
        }
        if (elementoClicado.equals("Flecha-Home")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@title='Toggle']"));
            boton.click();
        }
        if (elementoClicado.equals("Home")) {
            WebElement boton = driver.findElement(By.className("rct-checkbox"));
            boton.click();
        }
        if (elementoClicado.equals("Documents")) {
            driver.findElement(By.xpath(".//span[contains(text(),'Documents')]")).click();
        }
    }

    @Then("Deberia ver un apartado {string}")
    public void yoDeberiaVerApartado(String element) {
        if (element.equals("Elements")){
            By byXPath = By.xpath(".//h5[contains(text(),'Elements')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Forms")){
            By byXPath = By.xpath(".//h5[contains(text(),'Forms')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Alerts, Frame & Windows")){
            By byXPath = By.xpath(".//h5[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Widgets")){
            By byXPath = By.xpath(".//h5[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Interactions")){
            By byXPath = By.xpath(".//h5[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Home")){
            By byXPath = By.xpath(".//span[contains(text(),'Home')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
    }


    @Then("No debería ver {string}")
    public void yoNoDeberiaVerApartado(String element){
        if (element.equals("Documents")){
            By byXPath = By.xpath(".//span[contains(text(),'Documents')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertFalse(encontrado);
        }
    }

    @When("Yo escribo {string}")
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

    @Then("Hago click en el siguiente apartado {string}")
    public void yoClicoSiguienteApartado(String apartado) {
        if (apartado.equals("Email")){
            WebElement boton = driver.findElement(By.id("userEmail"));
            boton.click();
        }
        if (apartado.equals("Text-Box")){
            WebElement boton = driver.findElement(By.id("item-0"));
            boton.click();
        }

    }

    @And("Hago una captura de pantalla con el filename {string}")
    public void yoHagoScreenshotConFileName(String filename) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", filename);
    }

    @AfterAll()
    public static void tearDown() {
        driver.quit();
    }

}
