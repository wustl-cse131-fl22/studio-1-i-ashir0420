package studio1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter year");
	int yr = in.nextInt();
	boolean leapYear = (yr%4==0) && (yr%100!=0) || (yr%400==0);
	
	
	System.out.print( yr + " is a leap year: " + leapYear);
	

}
}