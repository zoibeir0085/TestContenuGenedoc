package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

public class FolderCreationPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]/div/div/a")
    public WebElement btnValidation2;

    @FindBy(how = How.ID, using = "validbutton")
    public WebElement btnValidation;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/form/div/table/tbody/tr[305]/td[2]/div/div/div")
    public WebElement btnAddQuestion;



    public FolderCreationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void SelectDocument(WebDriver driver,String document){
        Select SelectedDoc=new Select(driver.findElement(By.id("SelectDocument"))) ;
        SelectedDoc.selectByVisibleText(document);
    }

    public void SelectChart(WebDriver driver,String chart){
        Select SelectedChart=new Select(driver.findElement(By.id("SelectChart"))) ;
        SelectedChart.selectByVisibleText(chart);
    }

    public void SelectRedactors(WebDriver driver,String redactor){
        Select SelectedRedactors=new Select(driver.findElement(By.id("SelectRedactors"))) ;
        SelectedRedactors.selectByVisibleText(redactor);
        SelectedRedactors.selectByVisibleText("Corbet Sophie");

    }

    public void SelectApprobator(WebDriver driver,String approbator){
        Select SelectedApprobator=new Select(driver.findElement(By.id("SelectApprobator"))) ;
        SelectedApprobator.selectByVisibleText(approbator);
    }





    public void Validate() throws InterruptedException {
        btnValidation.click();
        Thread.sleep(5000);
    }


    public void Validate2() {
        btnValidation2.click();
    }

}