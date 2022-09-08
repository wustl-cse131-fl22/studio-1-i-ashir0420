package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 0: ");
		int n1 = in.nextInt();
		System.out.print("Enter value for arg 1: ");
		int n2 = in.nextInt();
		// TODO Auto-generated method stub
		double avg = (((double)n1 + n2) / 2);
		System.out.println("The first of two integers to be averaged? " + avg);
		

	}
}
