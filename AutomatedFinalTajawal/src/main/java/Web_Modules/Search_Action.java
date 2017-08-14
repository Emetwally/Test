package Web_Modules;

import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import PageObjects.HomePage;
import PageObjects.SearchSummary;


public class Search_Action {

	String RandomOrign; 
	String RandomDestination; 
	String CabnClass;
	
	WebElement cabnClassSearch;
	WebElement lbl_OrignSearch;
	WebElement lbl_DepartureSearch;
	WebElement checkbox_Airlines;
	WebElement Hyprlnk_Only;
	WebElement RandomVal1_SelAirlines;
	WebElement RandomVal2_SelAirlines;
	WebElement btn_selFlight;
	String Val_ListPrice;
	
	public  void Execute(WebDriver driver) throws Exception{

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // //dd LLLL yyyy

		RandomOrign = getRandomValue(utility.Constant.myOriginArray); 
		RandomDestination = getRandomValue(utility.Constant.myDestinationArray); 
		CabnClass = utility.Constant.CabinClass;
		
		HomePage.txt_Origin(driver).sendKeys(RandomOrign);
		HomePage.txt_Destination(driver).sendKeys(RandomDestination);
		
		HomePage.datetime_Departure(driver).sendKeys(utility.Constant.DepartureDate.format(formatter));
		HomePage.datetime_ReturnDate(driver).sendKeys(utility.Constant.ReturnDate.format(formatter));

		HomePage.Dropdown_Cabin(driver).sendKeys(CabnClass);
		HomePage.Dropdown_Passenger(driver).sendKeys(utility.Constant.PassengersCount);
		
		HomePage.button_Search(driver).click();
		 driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		  
		 
		 
		 
		/* Version 2 Advanced to get the test data from Excel sheet	
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method		
		String sOrgin = ExcelUtils.getCellData(1, 1);
		String sDestination = ExcelUtils.getCellData(1, 2);
		HomePage.txt_Origin(driver).sendKeys(sOrgin);
		HomePage.txt_Destination(driver).sendKeys(sDestination);
		*/
	
    }
	
	//Assert Cabin class value
	public void AssertCabinSearchResults(WebDriver driver){
	 
		
		cabnClassSearch = SearchSummary.lbl_Cabin(driver);

		//Cabin class "Economy" Assertion
		System.out.println("Homepage cabin class" + CabnClass);
		System.out.println("Search results page cabin class" + cabnClassSearch.getText());
		
		System.out.println("Assertion for Cabin Class field");
		Assert.assertTrue(CabnClass.equals(cabnClassSearch.getText()));
		
		}
	
	//Assert Origin value
	public void AssertOriginSearchResults(WebDriver driver){
		 

		lbl_OrignSearch = SearchSummary.lbl_Orign(driver);
		

		//"Orign" Assertion
		System.out.print("Homepage Orign" +RandomOrign);
		
		
		System.out.println("Search results page Orign" + lbl_OrignSearch.getText());
		System.out.print("Homepage Orign" +lbl_OrignSearch.isDisplayed() );
		Assert.assertTrue(RandomOrign.equals(lbl_OrignSearch.getText()));
		
		
		
		

	}
	
	//Assert Destination value
	public void AssertDestinationSearchResults(WebDriver driver){
		 

		lbl_DepartureSearch = SearchSummary.lbl_Departure(driver);

		//"Destination" Assertion
		System.out.print("Homepage Destination" +RandomDestination);
		System.out.println("Search results page Departure" + lbl_DepartureSearch.getText());		
		
		Assert.assertTrue(RandomDestination.equals(lbl_DepartureSearch.getText()));
	}
	

	//Assumption EK: Emirates if exists will be the first Airline in the list
	public void SelectAirline(WebDriver driver)
	{
		checkbox_Airlines = SearchSummary.check_Airlines(driver);
		//Workaround to keep "Only" hyperlink visible
		checkbox_Airlines.click();
		checkbox_Airlines.click();
		
		//Get hyperlink element and press click
		Hyprlnk_Only =SearchSummary.Hyperlink_OnlyAirlines(driver);
		
		
		
		//Selected Airline
		System.out.println("Search results selected Airline Only" + Hyprlnk_Only.getText());

		if (checkbox_Airlines.getText() == "EK: Emirates")
		{
			System.out.println("Emirates Airline only selected");
			Hyprlnk_Only.click();
		}
		else
		{
			Hyprlnk_Only.click();
		}
		
		System.out.println("Search results EMirites checkbox " + checkbox_Airlines.getText());
	
	}
	
	
	public void AssertSelectedAirline(WebDriver driver)
	{
		RandomVal1_SelAirlines = SearchSummary.RandomVal1_SelectedAirlines(driver);
		RandomVal2_SelAirlines = SearchSummary.RandomVal2_SelectedAirlines(driver);
		
		//Assert.assertTrue(RandomDestination.equals(lbl_DepartureSearch.getText()));
		//RandomVal1_SelAirlines 
		//checkbox_Airlines.getText()
		
		/*if (checkbox_Airlines.getText().contains(RandomVal1_SelAirlines.getText()))
				System.out.println("value 1 true");

		if(checkbox_Airlines.getText().contains(RandomVal1_SelAirlines.getText()))
			System.out.println("value 2 true");*/
		
		
		Assert.assertTrue(checkbox_Airlines.getText().contains(RandomVal1_SelAirlines.getText()));
		Assert.assertTrue(checkbox_Airlines.getText().contains(RandomVal1_SelAirlines.getText()));
		
	}
	
	
	//Select random flight
	public String SelectFlight(WebDriver driver)
	{
		btn_selFlight = SearchSummary.btn_selectFlight(driver);
		btn_selFlight.click();
		Val_ListPrice = SearchSummary.lbl_ListingPrice(driver).getText();
		System.out.println("lbl_ListPrice old"+ Val_ListPrice.toString());
		return Val_ListPrice;
		
		
	}
	
	public static String getRandomValue(String[] array) {
		 int rnd = new Random().nextInt(array.length);
		 return array[rnd];
	}
	
	
}
