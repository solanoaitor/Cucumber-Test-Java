package io.cucumber.skeleton;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Clase de steps utilizados para nuestros diferentes escenarios
 */
public class WebStepDefinitions {

    /**
     * Note: You must have installed chromedriver in your system
     *       https://chromedriver.chromium.org/downloads
     *       The version must match with the version of your Chrome browser
     */
    private static WebDriver driver;
    private Scenario scenario;

    /**
     * Método para definir nuestro driver
     */
    @BeforeAll
    public static void setUp() {
        //this.scenario = scenario;
        System.setProperty("webdriver.chrome.driver", "/Users/aitorsolano/Downloads/chromedriver");
        driver = new ChromeDriver();
    }

    /**
     * Método para comenzar a utilizar nuestros escenarios
     * @param scenario
     */
    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    /**
     * Método utilizado en cada escenario para empezar a utilizar la página web
     */
    @Given("Vamos a la página de inicio")
    public void yoVoyPaginaPrincipal() {
        driver.get("https://demoqa.com");
    }

    /**
     * Método para clicar el boton con un CAPTCHA y hacerlo manual, tendremos 20 segundos
     * @param boton: le pasaremos el nombre del botón
     */
    @Then("Haremos clic en el boton {string}")
    public void clicamosBoton(String boton){
        if (boton.equals("Register")) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");

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

    /**
     * Método utilizado para todo aquello que necesitemos hacer click con el ratón
     * @param elementoClicado: elemento buscado previamente y visualizado para hacer click
     */
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
                Thread.sleep(3000);
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
        if (elementoClicado.equals("Book_Store")) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            WebElement boton = driver.findElement(By.xpath(".//button[contains(text(),'Go To Book Store')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.getMessage();
            }
        }
        if (elementoClicado.equals("Git_Pocket_Guide")) {
            WebElement boton = driver.findElement(By.xpath(".//a[contains(text(),'Git Pocket Guide')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.getMessage();
            }
        }
        if (elementoClicado.equals("Add_To_Your_Collection")) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            WebElement boton = driver.findElement(By.xpath(".//button[contains(text(),'Add To Your Collection')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.getMessage();
            }
            driver.switchTo().alert().accept();
        }
        if (elementoClicado.equals("BorrarLibro")) {
            WebElement boton = driver.findElement(By.xpath(".//span[@id='delete-record-undefined']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("OK")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='closeSmallModal-ok']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.getMessage();
            }
            driver.switchTo().alert().accept();
        }
        if (elementoClicado.equals("boton alert")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='alertButton']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            driver.switchTo().alert().accept();
        }
        if (elementoClicado.equals("boton segundos")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='timerAlertButton']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            try {
                Thread.sleep(6000);
            }catch (Exception e){
                e.getMessage();
            }
            driver.switchTo().alert().accept();
        }
        if (elementoClicado.equals("boton ok")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='confirmButton']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            driver.switchTo().alert().accept();
        }
        if (elementoClicado.equals("boton box")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='promtButton']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            driver.switchTo().alert().accept();
        }
        if (elementoClicado.equals("Small modal")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='showSmallModal']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Close Small")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='closeSmallModal']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Close Large")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='closeLargeModal']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Large modal")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='showLargeModal']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("What")) {
            WebElement boton = driver.findElement(By.xpath(".//div[@id='section1Content']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Where")) {
            WebElement boton = driver.findElement(By.xpath(".//div[@id='section2Heading']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Why")) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            WebElement boton = driver.findElement(By.xpath(".//div[@id='section3Heading']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("multiple")) {
            WebElement boton = driver.findElement(By.xpath(".//input[@id='autoCompleteMultipleInput']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("sinle")) {
            WebElement boton = driver.findElement(By.xpath(".//input[@id='autoCompleteSingleInput']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Start")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='startStopButton']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.getMessage();
            }
        }
        if (elementoClicado.equals("Stop")) {
            WebElement boton = driver.findElement(By.xpath(".//button[@id='startStopButton']"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
            try {
                Thread.sleep(5000);
            }catch (Exception e){
                e.getMessage();
            }
        }
        if (elementoClicado.equals("Dapibus")) {
            WebElement boton = driver.findElement(By.xpath(".//li[contains(text(),'Dapibus ac facilisis in')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Porta")) {
            WebElement boton = driver.findElement(By.xpath(".//li[contains(text(),'Porta ac consectetur ac')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Grid")) {
            WebElement boton = driver.findElement(By.xpath(".//a[contains(text(),'Grid')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("One")) {
            WebElement boton = driver.findElement(By.xpath(".//li[contains(text(),'One')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Five")) {
            WebElement boton = driver.findElement(By.xpath(".//li[contains(text(),'Five')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Seven")) {
            WebElement boton = driver.findElement(By.xpath(".//li[contains(text(),'Seven')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Drag")) {
            Actions action = new Actions(driver);
            WebElement elemento = driver.findElement(By.xpath(".//div[@id='draggable']"));
            WebElement elemento2 = driver.findElement(By.xpath(".//div[@id='droppable']"));
            boolean botonEncontrado = elemento.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            action.dragAndDrop(elemento,elemento2).perform();
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.getMessage();
            }
        }
        if (elementoClicado.equals("Prevent Propogation")) {
            WebElement boton = driver.findElement(By.xpath(".//a[contains(text(),'Prevent Propogation')]"));
            boolean botonEncontrado = boton.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            boton.click();
        }
        if (elementoClicado.equals("Drag Me")) {
            Actions action = new Actions(driver);
            WebElement elemento = driver.findElement(By.xpath(".//div[@id='dragBox']"));
            WebElement elemento2 = driver.findElement(By.xpath(".//div[@id='notGreedyInnerDropBox']"));
            boolean botonEncontrado = elemento.isEnabled();
            Assertions.assertTrue(botonEncontrado);
            action.dragAndDrop(elemento,elemento2).perform();
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    /**
     * Método que utilizaremos para comprobar que vemos algún elemento
     * @param element
     */
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
        if (element.equals("Speaking JavaScript")){
            boolean encontrado = driver.findElements(By.xpath(".//a[contains(text(),'"+element+"')]")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Ok")){
            boolean encontrado = driver.findElements(By.xpath(".//span[@id='confirmResult']")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("DosFrames")){
            boolean primerFrame = driver.findElements(By.id("frame1")).size() > 0;
            Assertions.assertTrue(primerFrame);
            boolean segundoFrame = driver.findElements(By.id("frame2")).size() > 0;
            Assertions.assertTrue(segundoFrame);
        }
        if (element.equals("Small Modal")){
            boolean encontrado = driver.findElements(By.xpath(".//div[@id='example-modal-sizes-title-sm']")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Large Modal")){
            boolean encontrado = driver.findElements(By.xpath(".//div[@id='example-modal-sizes-title-lg']")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Lorem")){
            boolean encontrado = driver.findElements(By.xpath(".//p[contains(text(),'Lorem')]")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Contrary")){
            boolean encontrado = driver.findElements(By.xpath(".//p[contains(text(),'Contrary')]")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("English")){
            boolean encontrado = driver.findElements(By.xpath(".//p[contains(text(),'English')]")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
        if (element.equals("Drag me")){
            boolean encontrado = driver.findElements(By.xpath(".//div[contains(text(),'Drag me')]")).size() > 0;
            Assertions.assertTrue(encontrado);
        }
    }

    /**
     * Método que utilizaremos para redimensionar la pantalla
     */
    @Then("Cambio tamaño de pantalla")
    public void yoCambiotamaño(){
        Dimension dimension = new Dimension(900, 1000);
        driver.manage().window().setSize(dimension);
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.getMessage();
        }
    }

    /**
     * Método que utilizaremos siempre para cerrar sesión del usuario
     */
    @Then("Hacemos log out del usuario")
    public void yoHagoLogOut(){
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getMessage();
        }
        WebElement boton = driver.findElement(By.xpath(".//button[@id='submit']"));
        boolean botonEncontrado = boton.isEnabled();
        Assertions.assertTrue(botonEncontrado);
        boton.click();
    }

    /**
     * Método para comprobar que vemos algún elemento
     * @param element: elemento que no deberíamos ver
     */
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

    /**
     * Método que utilizaremos para realizar el cambio de páginas y poder interactuar con ella
     * @param pagina
     */
    @When("Cambiamos a la página {string}")
    public void cambioDePagina(String pagina){
        if (pagina.equals("login")){
            driver.get("https://demoqa.com/login");
        }
        if (pagina.equals("profile")){
            driver.get("https://demoqa.com/profile");
        }
        if (pagina.equals("alerts")){
            driver.get("https://demoqa.com/alerts");
        }
        if (pagina.equals("frames")){
            driver.get("https://demoqa.com/frames");
        }
        if (pagina.equals("modal-dialogs")){
            driver.get("https://demoqa.com/modal-dialogs");
        }
        if (pagina.equals("accordian")){
            driver.get("https://demoqa.com/accordian");
        }
        if (pagina.equals("auto-complete")){
            driver.get("https://demoqa.com/auto-complete");
        }
        if (pagina.equals("progress-bar")){
            driver.get("https://demoqa.com/progress-bar");
        }
        if (pagina.equals("selectable")){
            driver.get("https://demoqa.com/selectable");
        }
        if (pagina.equals("droppable")){
            driver.get("https://demoqa.com/droppable");
        }
    }

    /**
     * Método utilizado para escribir en cualquier elemento
     * @param texto: será el texto que escribiremos
     */
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
            try {
                Thread.sleep(5000);
            }catch (Exception e){
                e.getMessage();
            }
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
        if (texto.equals("Speaking JavaScript")){
            WebElement elemento = driver.findElement(By.id("searchBox"));
            elemento.sendKeys("Speaking JavaScript");
            Assertions.assertTrue(elemento.getAttribute("value").contains("Speaking JavaScript"));
        }
        if (texto.equals("R")){
            WebElement elemento = driver.findElement(By.id("autoCompleteMultipleInput"));
            elemento.sendKeys("R");
            Assertions.assertTrue(elemento.getAttribute("value").contains("R"));
            elemento.sendKeys(Keys.ENTER);
        }
        if (texto.equals("B")){
            WebElement elemento = driver.findElement(By.id("autoCompleteSingleInput"));
            elemento.sendKeys("B");
            Assertions.assertTrue(elemento.getAttribute("value").contains("B"));
            elemento.sendKeys(Keys.ENTER);
        }
    }

    /**
     * Método utilizado para borrar algun texto escrito
     * @param borro: pasaremos el elemento que queremos borrar
     */
    @Then("Borro {string}")
    public void yoBorroLoEscrito(String borro) {

        if (borro.equals("email")){
        WebElement elemento = driver.findElement(By.id("userEmail"));
        elemento.click();
        }
    }

    /**
     * Método para pulsar o clicar en un apartado que queramos
     * @param apartado: le indicaremos el apartado a seleccionar
     */
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
        if (apartado.equals("Type to search")){
            WebElement boton = driver.findElement(By.id("searchBox"));
            boton.click();
        }
    }

    /**
     * Método para realizar una captura de pantalla y comprobar que hemos hecho interacciones
     * @param filename: será el nombre del fichero de la captura
     */
    @And("Hago una captura de pantalla con el filename {string}")
    public void yoHagoScreenshotConFileName(String filename) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", filename);
    }

    /**
     * Método para cerrar el driver
     */
    @AfterAll()
    public static void tearDown() {
        driver.quit();
    }
}
