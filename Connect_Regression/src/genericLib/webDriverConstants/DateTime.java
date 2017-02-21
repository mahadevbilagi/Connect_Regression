package genericLib.webDriverConstants;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {
	
	public static void main(String[] args){
		
		//Current Date
				LocalDate today = LocalDate.now();
				System.out.println("Current Date="+today);
		
				//Current Time
				LocalTime time = LocalTime.now();
				System.out.println("Current Time="+time);
				
				LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
				System.out.println("Current Time in IST="+timeKolkata);
				
				//Current Date
				LocalDateTime today1 = LocalDateTime.now();
				System.out.println("Current DateTime="+today1);
				
				
		
	}
	

}
