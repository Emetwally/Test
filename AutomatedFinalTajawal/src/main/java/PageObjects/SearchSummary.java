package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchSummary {
	 private static WebElement element = null;

 //Cabin Class Label
    public static WebElement lbl_Cabin(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/flight-search-result/div/div[2]/div/div[2]/div[2]/div[2]/div/flight-search-summary/div[1]/div/div/div[2]/div/div[2]/div[3]/p/span"));
        return element;
        }
    
    //Orign Label
    public static WebElement lbl_Orign(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/flight-search-result/div/div[2]/div/div[2]/div[2]/div[2]/div/flight-search-summary/div[1]/div/div/div[2]/div/div[2]/div[1]/p[1]/span/airport-code"));      
        return element;
        }
 
    
     //Departure  Label
    public static WebElement lbl_Departure(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/flight-search-result/div/div[2]/div/div[2]/div[2]/div[2]/div/flight-search-summary/div[1]/div/div/div[2]/div/div[2]/div[1]/p[3]/span/airport-code"));
        return element;
        }
    
    // Emirates Airline check
    public static WebElement check_Airlines(WebDriver driver)
    {
    	 element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/flight-search-result/div/div[2]/div/div[2]/div[1]/flight-filters/div/div[7]/div/div[2]/div[1]/div[1]/div/label"));
         return element;
     }
    
    
    //Filter_Airline_only hyperlink
    public static  WebElement Hyperlink_OnlyAirlines(WebDriver driver) 
    {
    	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/flight-search-result/div/div[2]/div/div[2]/div[1]/flight-filters/div/div[7]/div/div[2]/div[1]/div[1]/div/a"));
    	 return element;	
    }

    //Selected random value Airline 1
    public static  WebElement RandomVal1_SelectedAirlines(WebDriver driver) 
    {
    	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/flight-search-result/div/div[2]/div/div[2]/div[2]/div[4]/div/search-result-react-comp/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div/p/span[1]"));
    	 return element;	
    }
    
    //Selected random value Airline 2
    public static  WebElement RandomVal2_SelectedAirlines(WebDriver driver) 
    {
    	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/flight-search-result/div/div[2]/div/div[2]/div[2]/div[4]/div/search-result-react-comp/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div[3]/div/div[1]/div/p/span[1]"));
    	 return element;	
    }
    
        
    //Selected random value Airline 2
    public static  WebElement btn_selectFlight(WebDriver driver) 
    {
    	element = driver.findElement(By.id("flights-results-select-cta-btn-desktop-0"));
    	 return element;	
    }
    
    //Listing price 
    public static  WebElement lbl_ListingPrice(WebDriver driver) 
    {
    	element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/ui-view/flight-search-result/div/div[2]/div/div[2]/div[2]/div[4]/div/search-result-react-comp/div/div[1]/div[1]/div/div/div/div[1]/div[2]/div[1]/span[2]"));
    	 return element;	
    }
    
    

}
