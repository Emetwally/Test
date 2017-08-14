package automationFramework;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import Web_Modules.Search_Action;
import Web_Modules.Traveller_Action;
import utility.Constant;

public class POM_TestClass {
	
	private static  WebDriver driver;
	static Search_Action ObjSearch_Action = new Search_Action();
	static Traveller_Action ObjTraveller_Action = new Traveller_Action();
	static String ListPrice_SearchRsults;
	static String ListPrice_TravelPage;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws Exception {
		//fail("Not yet implemented");

		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);
     
 
        ObjSearch_Action.Execute(driver);
	    driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);

	    //3.1 Assert that your search query data you provide is aligned with search summary module 
	    ObjSearch_Action.AssertCabinSearchResults(driver);
	    ObjSearch_Action.AssertOriginSearchResults(driver);
	    ObjSearch_Action.AssertDestinationSearchResults(driver);
	    
	    //3.2 Filter results to Emirates carrier (if found), if not found filter to any specific carrier
	    ObjSearch_Action.SelectAirline(driver);

	    //3.3 Assert listing results are only the selected carrier
	    ObjSearch_Action.AssertSelectedAirline(driver);
	    
	    //3.4- Pick random flight and related price and navigate to details page
	    ListPrice_SearchRsults= ObjSearch_Action.SelectFlight(driver);
	    
	   //4.1 - Fetch the cart price and make sure it is aligned with listing price
	    ListPrice_TravelPage= ObjTraveller_Action.AssertSelectedPrice(driver, ListPrice_SearchRsults);
	    
	    //4.2 Fill travelers details with proper entries
	    ObjTraveller_Action.Filltravelersdetails(driver);
	  
	}
	
	
}
