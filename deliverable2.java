//import necessary classes
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class deliverable2 {
	public static void main(String [] args ) {
		//declare scanner object
		Scanner sc = new Scanner(System.in);
		
		//declare all user input variables
		int date1Year = 0;
		int date1Month = 0;
		int date1Day = 0;
		int date2Year = 0;
		int date2Month = 0;
		int date2Day = 0;
		
		//get all dates from user input
		System.out.println("Please enter the year of the first date:");
		date1Year = sc.nextInt();
		System.out.println("Please enter the month of the first date:");
		date1Month = sc.nextInt();
		System.out.println("Please enter the day of the first date:");
		date1Day = sc.nextInt();
		System.out.println("Please enter the year of the second date:");
		date2Year = sc.nextInt();
		System.out.println("Please enter the month of the second date:");
		date2Month = sc.nextInt();
		System.out.println("Please enter the day of the second date:");
		date2Day = sc.nextInt();
		
		//create LocalDate objects from given user input
		LocalDate date1 = LocalDate.of(date1Year, date1Month, date1Day);
		LocalDate date2 = LocalDate.of(date2Year, date2Month, date2Day);
		
		//calcuate difference between the two given dates and return it in an understandable format
		Period difference = Period.between(date2, date1);
		System.out.print("Difference is " + difference.getYears() +  " years, " + difference.getMonths() + " months, and " + difference.getDays() + " days.");
}
}