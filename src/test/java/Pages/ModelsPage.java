package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ModelsPage 
{
   // @FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/table/tbody/tr/td[8]/table/tbody/tr/td[2]/input")
    public WebElement btnContenu;
    
    
    @FindBy(how = How.ID, using ="TEST model base")
    public static WebElement Tab_Test;

    public ModelsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
                
    }
    public void goToContenu(){
    	
    	if(Tab_Test != null)
    	{
    		btnContenu=Tab_Test.findElement(By.xpath("td[8]/table/tbody/tr/td[2]/input"));    		
    		btnContenu.click();
        }
    }


}
