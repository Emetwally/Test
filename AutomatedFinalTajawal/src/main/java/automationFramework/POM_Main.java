package automationFramework;



public class POM_Main {
	
	//private static WebDriver driver = null;
	//static Search_Action ObjSearch_Action = new Search_Action();
	
	public static void main(String[] args)  throws Exception{


		/*Version 2 Main

		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);
       // Search_Action.Execute(driver);
        ObjSearch_Action.Execute(driver);
      driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
    
        ObjSearch_Action.AssertSearchResults(driver);
        System.out.println("HI 3");
        //driver.quit();
         */
		/* Version 2 Advanced to get the test data from Excel sheet		
		 //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);
        Search_Action.Execute(driver);
        driver.quit(); */

		/* Version 1 Main
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tajawal.ae");
		
		HomePage.txt_Origin(driver).sendKeys("DXB");
		HomePage.txt_Destination(driver).sendKeys("CAI");
		HomePage.datetime_Departure(driver).sendKeys("25-August-2017");
		driver.quit();*/
		
		
	}


}
