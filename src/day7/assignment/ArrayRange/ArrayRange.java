package day7.assignment.ArrayRange;

import java.util.Scanner;

public class ArrayRange {

	public static void main(String[] args) {
		int [] arr = {8, 90, 10, 14, 30, 20, 13};
		
		for(int i=0; i< arr.length; i++) {
			System.out.println(i + " " + arr[i]);
		}	     
	   
		Scanner input = new Scanner(System.in);
		System.out.println("Input L : ");
		int l = input.nextInt();
		
		System.out.println("Input R : ");
		int r = input.nextInt();
		
		int sum = 0;
		
		for(int i=l; i <= r; i++) {
			sum += arr[i];		   
		}
		
		System.out.println("Sum is " + sum);
		
		input.close();
		
		
		
	}

}
