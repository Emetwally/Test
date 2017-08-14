package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravellerDetails {

	 private static WebElement element = null;


	 //Price Label
	    public static WebElement lbl_Price(WebDriver driver){
	    	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/traveller-details/div/div[2]/div/div/div[1]/div/div[3]/cart-total/div/div/ul/li/span[2]"));
	    	System.out.println("element travell" + element.getText());
	    	 return element;	

       }
	    // Traveller 1 details (Adult) Required fields

	    //--Title Adult
	    public static WebElement Dropdown_TitleAdult(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-title-0"));
	    	 return element;	
       }
	    
	    //--First Name Adult
	    public static WebElement txt_fnameAdult(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-first-name-0"));
	    	 return element;	
       }
	    
	    //--Last Name Adult
	    public static WebElement txt_lnameAdult(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-last-name-0"));
	    	 return element;	
       }
	    // End of Traveller 1 details (Adult) Required fields

	    
	    
	    // Contact details Required fields
	    //--Title
	    public static WebElement Dropdown_Title(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-contact-title"));
	    	 return element;	
       }
	    
	    //--First Name
	    public static WebElement txt_fname(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-contact-fname"));
	    	 return element;	
       }
	    
	    //--Last Name
	    public static WebElement txt_lname(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-contact-lname"));
	    	 return element;	
       }
	    
	    //--Email
	    public static WebElement txt_email(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-contact-email"));
	    	 return element;	
       }
	    
	    
	    //--Contact-countryid
	    public static WebElement dropdown_cntCountryID(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-contact-countryid"));
	    	 return element;	
       }
	    
	    //--Contact phone
	    public static WebElement txt_phone(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-travelers-form-contact-phone"));
	    	 return element;	
       }
	    
	    //--payment button
	    public static WebElement btn_payment(WebDriver driver){
	    	element = driver.findElement(By.id("flights-summary-go-to-payment-cta"));
	    	 return element;	
       }
	    
	    //end of contact detail section
}
