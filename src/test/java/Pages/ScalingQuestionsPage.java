package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ScalingQuestionsPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"55\"]/div/div/div/img[2]")
    public WebElement btnAddBlockQuestion;

    @FindBy(how = How.XPATH, using = "//*[@id=\"N1\"]/div/div/input")
    public WebElement blocName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"N1\"]/td[1]/textarea")
    public WebElement ques1Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/td[1]/textarea")
    public WebElement ques2Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[1]/td[2]/img")
    public WebElement ques1Type;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/li[6]/img")
    public WebElement ques1SelectText;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/td[2]/img")
    public WebElement ques2Type;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/li[6]/img")
    public WebElement ques2SelectText;


    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[1]/td[6]/div/img")
    public WebElement btnAddQues2;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/div/div/img[3]")
    public WebElement btnDeleteBloc;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/div[3]/a[1]")
    public WebElement btnSaveBloc;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/th/div[1]/div/button")
    public WebElement btnListDependencies;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/th/div[1]/div/div/div/ul/li[170]/a")
    public WebElement btnChoseDependencies;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/th/div[2]/div/div/div/div")
    public WebElement btnActivateQuest1Dep;

    @FindBy(how = How.LINK_TEXT, using="Nouveau dossier")
    public WebElement btnNewFolder;



    public ScalingQuestionsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    public void addBlocQuestion(){

        btnAddBlockQuestion.click();
    }

    public void RenameBlock(String blocname){

        blocName.clear();
        blocName.sendKeys(blocname);
    }

    public void addQuestion1(String name){
        ques1Name.sendKeys(name);
        //ques1Type.click();
        //ques1SelectText.click();
        //ques1SelectText.click();

    }

    public void addQuestion2(String name){

        btnAddQues2.click();
        btnListDependencies.click();
        btnChoseDependencies.click();
        btnActivateQuest1Dep.click();
        ques2Name.sendKeys(name);
        ques2Type.click();
        ques2SelectText.click();
        ques2SelectText.click();

    }
    public void saveChanges(){
        btnSaveBloc.click();
    }

    public void deleteBlockQuestions(){
        btnDeleteBloc.click();
    }
    public void createNewFolder(){
        btnNewFolder.click();

    }

}
