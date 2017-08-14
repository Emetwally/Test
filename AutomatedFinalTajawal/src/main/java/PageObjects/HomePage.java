package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static WebElement element = null;
    
    //Origin textbox
    public static WebElement txt_Origin(WebDriver driver){
        element = driver.findElement(By.id("flights-search-origin-0"));
        return element;
        }

    // Destination textbox
     public static WebElement txt_Destination(WebDriver driver){
        element = driver.findElement(By.id("flights-search-destination-0"));
        return element;
        }
     
     //departureDate  RoundTrip 
     public static WebElement datetime_Departure(WebDriver driver){
         element = driver.findElement(By.id("flights-search-departureDate-RoundTrip-0"));
         return element;
         }

     
     //returnDate RoundTrip 
     public static WebElement datetime_ReturnDate(WebDriver driver){
         element = driver.findElement(By.id("flights-search-returnDate-RoundTrip-0"));
         return element;
         }

     //flights search Cabin dropdownlist
     public static WebElement Dropdown_Cabin(WebDriver driver){
         element = driver.findElement(By.id("flights-search-open-cabin-btn"));
         return element;
         }
     
     
     //flights-search number of passengers
     public static WebElement Dropdown_Passenger(WebDriver driver){
         element = driver.findElement(By.id("flights-search-open-pax-btn"));
         return element;
         }
     
     
     //flights search button
     public static WebElement button_Search(WebDriver driver){
         element = driver.findElement(By.id("flights-search-cta"));
         return element;
         }
     


}
