package Date_api.zensar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DateApiTest {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Date :" + localDate);
		
		localDate = localDate.of(2022, 1,26);
		System.out.println(localDate);
		System.out.println("Day: " + localDate.getDayOfMonth());
		System.out.println("Month: " + localDate.getMonthValue());
		System.out.println("Year: " + localDate.getYear());
		
		LocalTime localTime = LocalTime.now();
		System.out.println("localtime: " + localTime);
		
		localTime = LocalTime.of(10,25,35);
		System.out.println("custom localtime: " + localTime);
		
		localTime = LocalTime.parse("15:15:20");
		System.out.println(localTime);
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		localTime = LocalTime.of(6, 0);
		LocalTime localTime_2 = LocalTime.now();
		
		
		
		List<String> list = Arrays.asList("Sara", "Anand", "Ivan", "Tom", "Tom");
		
		list = list.stream().filter((name)->name.length()%2!=0).distinct().skip(1).limit(1).collect(Collectors.toList());
		System.out.println(list);
		
		
		
		
	}
}





