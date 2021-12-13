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
        driver.get("https://demoqa.com");
    }

    /**
     * Método para clicar el boton con un CAPTCHA y hacerlo manual, tendremos 20 segundos
     * @param boton: le pasaremos el nombre del boton
     */
    @Then("Haremos clic en el boton {string}")
    public void clicamosBoton(String boton){
        if (boton.equals("Register")) {
            try {
                Thread.sleep(20000);
                WebElement botonBuscado = driver.findElement(By.xpath(".//button[contains(text(),'Register')]"));
                boolean botonEncontrado = botonBuscado.isEnabled();
                Assertions.assertTrue(botonEncontrado);
                botonBuscado.click();
                Thread.sleep(3000);
            }catch (Exception e){
                e.getMessage();
            }
        }
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
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
        }
        if (elementoClicado.equals("Check-Box")) {
            WebElement boton = driver.findElement(By.id("item-1"));
            boton.click();
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
        }
        if (elementoClicado.equals("Flecha-Home")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@title='Toggle']"));
            boton.click();
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
        }
        if (elementoClicado.equals("Home")) {
            WebElement boton = driver.findElement(By.className("rct-checkbox"));
            boton.click();
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
        }
        if (elementoClicado.equals("Documents")) {
            driver.findElement(By.xpath(".//span[contains(text(),'Documents')]")).click();
        }
        if (elementoClicado.equals("Yes")) {
            WebElement boton = driver.findElement(By.xpath(".//label[contains(text(),'Yes')]"));
            boton.click();
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
        }
        if (elementoClicado.equals("No")) {
            WebElement boton = driver.findElement(By.xpath(".//label[contains(text(),'No')]"));
            boton.click();
            boolean botonEncontrado = boton.isDisplayed();
            Assertions.assertTrue(botonEncontrado);
        }
        if (elementoClicado.equals("Add")) {
            WebElement boton = driver.findElement(By.xpath(".//button[contains(text(),'Add')]"));
            boton.click();
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
        }
        if (elementoClicado.equals("Editar")) {
            WebElement boton = driver.findElement(By.id("edit-record-1"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("BorrarAlden")) {
            WebElement boton = driver.findElement(By.id("delete-record-2"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("BorrarKierra")) {
            WebElement boton = driver.findElement(By.id("delete-record-3"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("New User")) {
            driver.get("https://demoqa.com/login");
            WebElement boton = driver.findElement(By.xpath(".//button[contains(text(),'New User')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Login")) {
            WebElement boton = driver.findElement(By.xpath(".//button[contains(text(),'Login')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            try {
                Thread.sleep(5000);
            }catch (Exception e){
                e.getMessage();
            }
        }
        if (elementoClicado.equals("Logout")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='submit']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
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
            By byXPath = By.xpath(".//span[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Do you like the site?")){
            By byXPath = By.xpath(".//div[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("You have selected")){
            By byXPath = By.xpath(".//p[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Yes")){
            By byXPath = By.xpath(".//span[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Pol")){
            By byXPath = By.xpath(".//div[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Pol")){
            By byXPath = By.xpath(".//div[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Alden")){
            By byXPath = By.xpath(".//div[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Kierra")){
            By byXPath = By.xpath(".//div[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("User exists!")){
            boolean encontrado = driver.findElements(By.xpath(".//p[contains(text(),'"+element+"')]")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Invalid username or password!")){
            boolean encontrado = driver.findElements(By.xpath(".//p[contains(text(),'"+element+"')]")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
    }

    @Then("No debería ver {string}")
    public void yoNoDeberiaVerApartado(String element){
        if (element.equals("Documents")){
            By byXPath = By.xpath(".//span[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertFalse(encontrado);
        }
        if (element.equals("DO YOU LIKE")){
            By byXPath = By.xpath(".//span[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertFalse(encontrado);
        }
        if (element.equals("You have selected")){
            By byXPath = By.xpath(".//p[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertFalse(encontrado);
        }
        if (element.equals("Alden")){
            By byXPath = By.xpath(".//div[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertFalse(encontrado);
        }
        if (element.equals("Kierra")){
            By byXPath = By.xpath(".//div[contains(text(),'"+element+"')]");
            boolean encontrado = driver.findElements(byXPath).size() > 0;
            Assertions.assertFalse(encontrado);
        }
    }

    @When("Cambiamos a la página {string}")
    public void cambioDePagina(String pagina){
        if (pagina.equals("login")){
            driver.get("https://demoqa.com/login");
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
        if (texto.equals("Pol")){
            WebElement elemento = driver.findElement(By.id("firstName"));
            elemento.sendKeys("Pol");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Pol"));
        }
        if (texto.equals("Lopez")){
            WebElement elemento = driver.findElement(By.id("lastName"));
            elemento.sendKeys("Lopez");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Lopez"));
        }
        if (texto.equals("p@p.com")){
            WebElement elemento = driver.findElement(By.id("userEmail"));
            elemento.sendKeys("p@p.com");
            Assertions.assertTrue(elemento.getAttribute("value").contains("p@p.com"));
        }
        if (texto.equals("22")){
            WebElement elemento = driver.findElement(By.id("age"));
            int numero = 22;
            elemento.sendKeys(numero+"");
            Assertions.assertTrue(elemento.getAttribute("value").contains("22"));
        }
        if (texto.equals("2000")){
            WebElement elemento = driver.findElement(By.id("salary"));
            int numero = 2000;
            elemento.sendKeys(numero+"");
            Assertions.assertTrue(elemento.getAttribute("value").contains("2000"));
        }
        if (texto.equals("Informática")){
            WebElement elemento = driver.findElement(By.id("department"));
            elemento.sendKeys("Informática");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Informática"));
        }
        if (texto.equals("Andres")){
            WebElement elemento = driver.findElement(By.id("firstName"));
            elemento.clear();
            elemento.sendKeys("Andres");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Andres"));
        }
        if (texto.equals("Garcia")){
            WebElement elemento = driver.findElement(By.id("lastName"));
            elemento.clear();
            elemento.sendKeys("Garcia");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Garcia"));
        }
        if (texto.equals("Tom")){
            WebElement elemento = driver.findElement(By.id("firstname"));
            elemento.sendKeys("Tom");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Tom"));
        }
        if (texto.equals("Anderson")){
            WebElement elemento = driver.findElement(By.id("lastname"));
            elemento.sendKeys("Anderson");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Anderson"));
        }
        if (texto.equals("tomanderson")){
            WebElement elemento = driver.findElement(By.id("userName"));
            elemento.sendKeys("tomanderson");
            Assertions.assertTrue(elemento.getAttribute("value").contains("tomanderson"));
        }
        if (texto.equals("Tomanderson1993*")){
            WebElement elemento = driver.findElement(By.id("password"));
            elemento.sendKeys("Tomanderson1993*");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Tomanderson1993*"));
        }
        if (texto.equals("username")){
            WebElement elemento = driver.findElement(By.id("userName"));
            elemento.sendKeys("tomanderson");
            Assertions.assertTrue(elemento.getAttribute("value").contains("tomanderson"));
        }
        if (texto.equals("usernameFalso")){
            WebElement elemento = driver.findElement(By.id("userName"));
            elemento.sendKeys("tomandersonFalso");
            Assertions.assertTrue(elemento.getAttribute("value").contains("tomandersonFalso"));
        }
        if (texto.equals("password")){
            WebElement elemento = driver.findElement(By.id("password"));
            elemento.sendKeys("Tomanderson1993*");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Tomanderson1993*"));
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
            By path = By.xpath(".//span[contains(text(),'Text Box')]");
            boolean encontrado = driver.findElements(path).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (apartado.equals("Text-Box")){
            WebElement boton = driver.findElement(By.id("item-0"));
            boton.click();
            By path = By.xpath(".//li[@id='item-0']");
            boolean encontrado = driver.findElements(path).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (apartado.equals("Radio-Button")){
            WebElement boton = driver.findElement(By.id("item-2"));
            boton.click();
            By path = By.xpath(".//li[@id='item-2']");
            boolean encontrado = driver.findElements(path).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (apartado.equals("Web Tables")){
            WebElement boton = driver.findElement(By.id("item-3"));
            boton.click();
            By path = By.xpath(".//li[@id='item-3']");
            boolean encontrado = driver.findElements(path).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (apartado.equals("Submit")){
            WebElement boton = driver.findElement(By.id("submit"));
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
