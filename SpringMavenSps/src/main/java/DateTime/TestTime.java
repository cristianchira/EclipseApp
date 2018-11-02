package DateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Duration duration =Duration.ofDays(1);
		
        LocalDateTime oldDate = LocalDateTime.of(2018, Month.JANUARY, 5, 10, 10, 30);
		LocalDateTime dnow = LocalDateTime.now();
		
       //Duration duration=   Duration.between(oldDate,now);
		
		
		  
	        LocalDateTime currentTime = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a");
	        String then = oldDate.format(formatter);
	        String now = currentTime.format(formatter);
		System.out.println(now);	
		
	}

}
