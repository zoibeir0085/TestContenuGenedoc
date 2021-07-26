package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContenuPage {

	
	@FindAll({ @FindBy(how = How.CLASS_NAME, using ="level_1") })
    public static List<WebElement> section;
	
	
    public static WebElement Last_section =  null;
	
	
	@FindBy(how = How.CLASS_NAME, using ="context-menu-list")
	public static List<WebElement> List_menu_context;
	
	//@FindBy(how = How.XPATH, using ="/html/body/div[@id='context-menu-layer']")
    public static WebElement menu_context ;
	
	
    //@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/div[1]/div[3]/ol/li[79]/div/img[4]")
    public WebElement btnAdd = null ;

    //@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/div[1]/div[3]/ol/li[82]/div/img[2]")
    public WebElement btnDeleteSection = null ;


    //@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div[2]/div[2]/ul/li[2]/img")
    public WebElement btnValidateSection= null ;

    //@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
    public WebElement btnValidateDelete;

    //@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/div[1]/div[3]/ol/li[81]/div/img[4]")
    public WebElement btnAddSection =  null ;

    //@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/div[1]/div[3]/ol/li[82]/div/img[4]")
    public WebElement btnAddArticle =  null ;

    //@FindBy(how = How.XPATH, using = "/html/body/ul[63]/li[2]")
    public WebElement btnAddNewSection = null;
    
    
    //@FindBy(how = How.XPATH, using = "/html/body/ul[61]/li[1]")
    public WebElement btnAddNewArticle =  null ;

    //@FindBy(how = How.XPATH, using = "/html/body/ul[252]/li[4]/span")
    public WebElement btnAddNewSubSection=  null ;

    //@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[1]/textarea")
    //@FindBy(how = How.CLASS_NAME, using = "tooltiptext")
    public WebElement sectionDescription;

    //@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[1]/div/table/tbody/tr/td[1]/textarea")
    //@FindBy(how = How.CLASS_NAME, using = "mainText")
    public WebElement sectionContenu;


    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[2]/textarea")
    public WebElement subSection1Reference;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/table/tbody/tr[2]/td[2]/textarea")
    public WebElement subSection1Title;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[2]/ul/li[2]/a/img")
    public WebElement subSection1Image;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[1]/input")
    public WebElement subSection1SelectImage;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[2]/div[5]/ul/li[2]/img")
    public WebElement subSection1Validate;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[2]/ul/li[4]/a/img")
    public WebElement subSection2Table;


    //@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[3]/div[2]/div/input")
    public WebElement tableLines =null;

   
    //@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[4]/div[2]/div/input")
    public WebElement tableColumns=null;

    //@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[5]/div[2]/input")
    public WebElement tableTitle=null;

    //@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div/div[1]/div[3]/ol/li[82]/ol/li[1]/div/img[5]")
    public WebElement bouleBlue =  null ;


    public String _CurrentUrl;
    
    public WebDriver _Currentdriver;
    
    List<WebElement> Items_menu_context;
    
    public ContenuPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        
        Last_section = section.get(section.size()-1);
        
        System.out.println(section.size());
        System.out.println(Last_section);
        System.out.println(Last_section.getText());
        
        
        System.out.println(Last_section.findElement(By.className("section")));
        System.out.println("btnAddSection--------------");
        
        List<WebElement>  lstadd = Last_section.findElement(By.className("section")).findElements(By.className("add")) ;
        List<WebElement>  lstsupp = Last_section.findElement(By.className("section")).findElements(By.className("supp")) ;
        List<WebElement>  lstbouleBlue = Last_section.findElement(By.className("section")).findElements(By.className("iconIsRequired")) ;
        
        btnAddArticle = lstadd.get(lstadd.size()-1) ;
        btnAddSection = lstadd.get(lstadd.size()-1) ;
        btnAdd = lstadd.get(lstadd.size()-1) ;
        btnDeleteSection = lstsupp.get(lstsupp.size()-1) ;
        bouleBlue = lstbouleBlue.get(lstbouleBlue.size()-1) ;
        
        System.out.println(lstadd.size());
        System.out.println(btnAddSection);
        System.out.println(btnAddSection.getText());
        
        System.out.println("btnAddSection-----");
        
              
        _CurrentUrl = driver.getCurrentUrl();
        
        System.out.println(_CurrentUrl);
        
        
        _Currentdriver= driver;
    }

    public void addNewSection(){
    	
    	
        btnAddSection.click();
        
        
        for (WebElement item : List_menu_context) 
        {
		 
        	 if(!item.getAttribute("style").contains("display: none;"))
        	 {
        		 System.out.println(item.getLocation());
        		 menu_context=item; 
        		 break;
        	 }
        	 else
        	 {
        		 System.out.println(item.getLocation());
        	 }
        	
        }
        
        System.out.println("menu_context------------");
        System.out.println(menu_context);
        System.out.println( menu_context.getAttribute("style"));
        System.out.println( menu_context.findElements(By.xpath("li")).size());
        
        
        Items_menu_context = menu_context.findElements(By.xpath("li"));
        
        for (WebElement ite : Items_menu_context) 
        {
		 
        	
        	System.out.println( ite.getText());
        }
        System.out.println("menu_context------------");
        
        
        btnAddNewArticle = Items_menu_context.get(0) ; // Insérer article 
        btnAddNewSection = Items_menu_context.get(1) ; // Insérer section 
        btnAddNewSubSection = Items_menu_context.get(2) ; //Ajouter sous-section dans section
        //menu_context.findElements(By.xpath("li")).get(3) ;//Ajouter article dans section
        
        
        btnAddNewSection.click();
        
        
        
        
        
        
        

    }

    public void addNewArticle(){
        btnAdd.click();
               
        btnAddNewArticle.click();
    }

    public void deleteSection() throws InterruptedException {
        btnDeleteSection.click();
        Thread.sleep(2000);
        
        
        btnValidateDelete= _Currentdriver.findElement(By.className("jconfirm-buttons")).findElement(By.xpath("button"));
        btnValidateDelete.click();
    }



    public void enterSectionParameters() throws InterruptedException 
    {
    	Thread.sleep(1000);
    	sectionDescription= _Currentdriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[2]/div[1]/textarea"));
    	
        sectionDescription.sendKeys(_CurrentUrl);
        Thread.sleep(1000);
        
        sectionContenu= _Currentdriver.findElement(By.className("mainText"));
        
        sectionContenu.sendKeys("<<test>>");
        Thread.sleep(1000);
        
        btnValidateSection= _Currentdriver.findElement(By.className("validationOfItem")).findElement(By.xpath("img"));
        
        btnValidateSection.click();

    }

    public void addSubSectionImage() throws InterruptedException {
        
    	btnAdd.click();
        Thread.sleep(1000);
        
        for (WebElement item : List_menu_context) 
        {
		 
        	 if(!item.getAttribute("style").contains("display: none;"))
        	 {
        		 System.out.println(item.getLocation());
        		 menu_context=item; 
        		 break;
        	 }
        	 else
        	 {
        		 System.out.println(item.getLocation());
        	 }
        	
        }
        
        Items_menu_context = menu_context.findElements(By.xpath("li"));
        btnAddNewSubSection = Items_menu_context.get(3) ;
        
        btnAddNewSubSection.click();
        Thread.sleep(4000);
        
        subSection1Reference.clear();
        Thread.sleep(1000);
        
        subSection1Reference.sendKeys("Article d'image");
        Thread.sleep(1000);
        
        subSection1Title.clear();
        Thread.sleep(1000);
        
        subSection1Title.sendKeys("Article d'image");
        Thread.sleep(1000);
        
        subSection1Image.click();
        Thread.sleep(1000);
        
        subSection1SelectImage.sendKeys("C:\\Users\\abensalah\\.jenkins\\workspace\\TestContenuGenedoc\\aezan.png");
        Thread.sleep(1000);
        
        subSection1Validate.click();
        Thread.sleep(1000);

    }


    public void addSubSectionTable() throws InterruptedException {
    	
    	btnAdd.click();
        Thread.sleep(1000);
        
        for (WebElement item : List_menu_context) 
        {
		 
        	 if(!item.getAttribute("style").contains("display: none;"))
        	 {
        		 System.out.println(item.getLocation());
        		 menu_context=item; 
        		 break;
        	 }
        	 else
        	 {
        		 System.out.println(item.getLocation());
        	 }
        	
        }
        
        Items_menu_context = menu_context.findElements(By.xpath("li"));
        btnAddNewSubSection = Items_menu_context.get(3) ;
        
        btnAddNewSubSection.click();
        Thread.sleep(4000);
        
        subSection1Reference.clear();
        Thread.sleep(1000);
        
        subSection1Reference.sendKeys("Article de tableau");
        Thread.sleep(1000);
        
        subSection1Title.clear();
        Thread.sleep(1000);
        
        subSection1Title.sendKeys("Article de tableau");
        Thread.sleep(1000);
        
        subSection2Table.click();
        Thread.sleep(1000);

        /*
        //@FindBy(how = How.ID_OR_NAME, using = "btn_addrow 0")
        tableLines = _Currentdriver.findElement(By.name("btn_addrow 0"));

        //@FindBy(how = How.ID_OR_NAME, using = "btn_addcol 0")
        tableColumns = _Currentdriver.findElement(By.name("btn_addcol 1"));
        //tableLines.clear();
        //tableLines.sendKeys("5");
        tableLines.click();
        tableLines.click();
        tableLines.click();
        Thread.sleep(1000);
        
       //tableColumns.clear();
        //tableColumns.sendKeys("4");
        tableColumns.click();
        */
        
        
        Thread.sleep(1000);
        
        tableTitle = _Currentdriver.findElement(By.id("tabletitle"));
        tableTitle.sendKeys("Mon tableau");
        Thread.sleep(1000);
        
        subSection1Validate.click();
        Thread.sleep(1000);

    }

    public void addSubSectionBlueBall() throws InterruptedException 
    {
    	btnAdd.click();
        Thread.sleep(1000);
        
        for (WebElement item : List_menu_context) 
        {
		 
        	 if(!item.getAttribute("style").contains("display: none;"))
        	 {
        		 System.out.println(item.getLocation());
        		 menu_context=item; 
        		 break;
        	 }
        	 else
        	 {
        		 System.out.println(item.getLocation());
        	 }
        	
        }
        
        Items_menu_context = menu_context.findElements(By.xpath("li"));
        btnAddNewSubSection = Items_menu_context.get(3) ;
        
        btnAddNewSubSection.click();
        Thread.sleep(4000);
        
        subSection1Reference.clear();
        Thread.sleep(1000);
        
        subSection1Reference.sendKeys("Article de boule blue");
        subSection1Title.clear();
        Thread.sleep(1000);
        
        subSection1Title.sendKeys("Article de boule blue");
        subSection1Validate.click();
        bouleBlue.click();
        Thread.sleep(2000);

        Thread.sleep(1000);

    }




}

