package Steps;

import Pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ContenuTest {
    WebDriver driver;


    public WebDriver getDriver() {
        return driver;
    }


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.out.println("Navigate login page");
        //for windows
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //for linux
        //System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        driver.navigate().to("https://aezan.genedoc.fr/Login");

    }


    @And("I click login button")
    public void iClickLoginButton() {
        // System.out.println("Click login button");

        LoginPage page = new LoginPage(driver);

        page.ClickLogin();
    }

    @Then("I should see the welcome page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see userform");
        //Assert.assertEquals("its not displayed",driver.findElement(By.className("container body-content")).isDisplayed(),true );


        //driver.findElement(By.name("generate")).click() ;


    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterUsernameAndPassword(String username, String password) throws InterruptedException {
        LoginPage page = new LoginPage(driver);
        page.Login(username, password);
        Thread.sleep(2000);
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        driver = null;
    }

    @Then("I navigate to the model page")
    public void iNavigateToTheCreationOfNewFolderPage() throws InterruptedException {
        WelcomePage page = new WelcomePage(driver);
        page.goToAdministration();
        page.goToModel();
        Thread.sleep(2000);

    }

    @Then("I enter \"([^\"]*)\"  , \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"")
    public void iEnterAnd(String Document, String CharteGraphique, String Redacteurs, String Approbateur) throws InterruptedException {
        FolderCreationPage page = new FolderCreationPage(driver);

        //select DocumentType
        page.SelectDocument(driver, Document);

        //select CharteGraphique
        page.SelectChart(driver, CharteGraphique);

        //select Redactors
        page.SelectRedactors(driver, Redacteurs);

        //select Approbator
        page.SelectApprobator(driver, Approbateur);

        //Validation
        page.Validate();
        Thread.sleep(10000);
        page.Validate2();
        Thread.sleep(10000);

    }

    @Then("I validate the report")
    public void iValidateTheReport() throws InterruptedException {
        RapportPage_TestContenu page = new RapportPage_TestContenu(driver);
        page.Validate();
        Thread.sleep(6000);

    }

    @Then("I preview the report")
    public void iPreviewTheReport() throws InterruptedException {
    	RapportPage_TestContenu page = new RapportPage_TestContenu(driver);
        page.Preview();
        Thread.sleep(8000);

    }

    @Then("I logout")
    public void iLogout() throws InterruptedException {
    	RapportPage_TestContenu page = new RapportPage_TestContenu(driver);
        page.Logout();
        Thread.sleep(2000);

    }

    @Then("I click to contenu")
    public void iClickToScalingQuestion() throws InterruptedException {
        ModelsPage page = new ModelsPage(driver);
        page.goToContenu();
        //Thread.sleep(5000);

    }


    @Then("I click New Folder Button")
    public void iClickNewFolderButton() throws InterruptedException {
        ScalingQuestionsPage page = new ScalingQuestionsPage(driver);
        page.createNewFolder();
        Thread.sleep(3000);
    }

    @Then("I add new article")
    public void iAddNewArticle() throws InterruptedException {
        ContenuPage page = new ContenuPage(driver);
        page.addNewArticle();
        Thread.sleep(3000);

    }


    @Then("I delete the section created")
    public void iDeleteTheArticleCreated() throws InterruptedException {
        ContenuPage page = new ContenuPage(driver);
        page.deleteSection();
        Thread.sleep(6000);


    }

    @Then("I verify the existence of the new section")
    public void iVerifyTheExistanceOfTheNewArticle() throws InterruptedException 
    {
    	RapportPage_TestContenu page = new RapportPage_TestContenu(driver);
        page.verifySection();
        Thread.sleep(5000);
    }

    @Then("I add new section")
    public void iAddNewSection() throws InterruptedException {
        ContenuPage page = new ContenuPage(driver);
        page.addNewSection();
        //Thread.sleep(3000);
        page.enterSectionParameters();

    }

    @Then("I add subsection of table")
    public void iAddSubsectionOfTable() throws InterruptedException {
        ContenuPage page = new ContenuPage(driver);
        page.addSubSectionTable();

    }

    @Then("I add subsection of picture")
    public void iAddSubsectionOfPicture() throws InterruptedException {
        ContenuPage page = new ContenuPage(driver);
        page.addSubSectionImage();

    }

    @Then("I add subsection of blue ball")
    public void iAddSubsectionOfBlueBall() throws InterruptedException {
        ContenuPage page = new ContenuPage(driver);
        page.addSubSectionBlueBall();

    }

}

