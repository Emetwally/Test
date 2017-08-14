package Web_Modules;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import PageObjects.TravellerDetails;

public class Traveller_Action {

	WebElement lblSelectedPrice; 
	String ListPrice_TravelPage;
	//Traveller 1 details (Adult) Required fields
	WebElement TitleAdult;
	
	//Contact details 
	WebElement Title;
	
	//function to assert that price is same in both search and traveller pages 
	public  String AssertSelectedPrice(WebDriver driver, String ListPrice_SearchRsults)
	{
		lblSelectedPrice = TravellerDetails.lbl_Price(driver);
		
		//List price in Search results page 
		System.out.println("First selected"+ListPrice_SearchRsults.toString());
		//List price in Traveller detail page
		System.out.println("Second selected"+lblSelectedPrice.getText());
		
		Assert.assertTrue(lblSelectedPrice.getText().contains(ListPrice_SearchRsults.toString()));
		ListPrice_TravelPage =lblSelectedPrice.getText().toString();
		
		return ListPrice_TravelPage;
		
	}
	
	public void Filltravelersdetails (WebDriver driver) 
	{
	
		
		//Traveller 1 details (Adult) Required fields
		 TitleAdult =TravellerDetails.Dropdown_TitleAdult(driver);
		 Select dropdown = new Select(TitleAdult);
		 dropdown.selectByIndex(2);



		 
		TravellerDetails.txt_fnameAdult(driver).sendKeys("Eman");
		TravellerDetails.txt_lnameAdult(driver).sendKeys("Ali");
		//Contact details 
		 Title =TravellerDetails.Dropdown_Title(driver);
		 TravellerDetails.txt_fname(driver).sendKeys("Mohamed");
		 TravellerDetails.txt_lname(driver).sendKeys("Aly");
		 TravellerDetails.txt_email(driver).sendKeys("emanaly88@gmail.com"); 
		
		 TravellerDetails.txt_phone(driver).sendKeys("509440983");
		//TravellerDetails.btn_payment(driver).click();
		
		
	}
	
}
