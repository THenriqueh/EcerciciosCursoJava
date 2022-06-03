/*
 Make a program that reads the number of an employee, his number of hours worked, the amount he receives for
hour and calculates the salary of that employee. Next, show the employee's number and salary, with two places
decimals
 */
import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employee: ");
		int employee = sc.nextInt();
		System.out.print("Now enter the worked hours by the employee: ");
		int hoursWorked = sc.nextInt();
		System.out.print("And tell me value the working hours: ");
		double workingHours = sc.nextDouble();
		double salary = hoursWorked * workingHours;
		System.out.printf("Ok, the employee number " + employee + "has a salary of: %.2f per day.%n", salary);
		
		sc.close();
	}

}
