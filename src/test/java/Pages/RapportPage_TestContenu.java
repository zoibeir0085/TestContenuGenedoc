package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RapportPage_TestContenu 
{
	
	@FindAll({ @FindBy(how = How.CLASS_NAME, using ="level_1") })
    public static List<WebElement> section;
	public static WebElement Last_section =  null;
	
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[1]/div[2]/img[2]")
    public WebElement btnValidation;

   // @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[1]/div[3]/ol/li[12]/div/span")
    public WebElement verifySection = null;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]")
    public WebElement btnPreview;

    @FindBy(how = How.LINK_TEXT, using="Se déconnecter")
    public WebElement btnLogout;

    public RapportPage_TestContenu(WebDriver driver) {
        PageFactory.initElements(driver,this);
        Last_section = section.get(section.size()-1);
        
        List<WebElement>  lstsection = Last_section.findElement(By.className("section")).findElements(By.xpath("span")) ;
            
        verifySection = lstsection.get(lstsection.size()-1) ;
    }

    public void Validate() {
        btnValidation.click();
    }

    public void Preview(){
        btnPreview.click();
    }

    public void Logout(){
        btnLogout.click();
    }

    public void verifySection(){
        verifySection.click();
        verifySection.click();

    }

}
