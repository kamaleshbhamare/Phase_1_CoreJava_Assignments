package day4.assignment2.throwClause;

import java.util.Scanner;

public class throwClause {
	
	static int compare(int num1, int num2) {
		if (num1 == num2) {
			return num1 + num2;
		}  else if (num2 > num1) {
			throw new ArithmeticException("Num 2 is greater than Num 1 hence exception is thrown");
		}  else if (num1 > num2) {
			throw new ArithmeticException("Num 1 is greater than num2 hence exception is thrown");
		} 
		return 0;
	}
	
	public static void main(String args[]) {
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter num 1 : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter num 2 : ");
		int num2 = scanner.nextInt();
		
		try {
			result = compare(num1, num2);
			System.out.println("Result is : " + result);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
	}
}
