package utility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Constant {
	public static final String URL = "https://www.tajawal.ae";

    public static final String Path_TestData = "E://Eman//Tajawal//";

    public static final String File_TestData = "TestData.xlsx";
    
    public static String[] myOriginArray = new String[]{"DXB","JED","TXL","BEY","YYZ"};
    public static String[] myDestinationArray = new String[]{"CAI","BCN","HKG","IST","SKG"};


    public static LocalDate DepartureDate = LocalDate.now();
    public static LocalDate ReturnDate = DepartureDate.plus(40, ChronoUnit.DAYS);
    
    public static String CabinClass = "Economy";
    public static String PassengersCount = "2 Passengers";
    
}
