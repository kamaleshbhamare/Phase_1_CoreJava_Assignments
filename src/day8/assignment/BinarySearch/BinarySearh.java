package day8.assignment.BinarySearch;

import java.util.Scanner;

public class BinarySearh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 6, 8, 11, 23, 56};
		// int arr[] = {1, 2, 3, 4, 5, 6, 7};
		
		Scanner input = new Scanner(System.in);
		
		/* 
		
		System.out.println("Please enter array : ");
		
		for(int i=0; i < arr.length; i++) {
			int l = input.nextInt();
			arr[i] = l;
		}
		*/ 
		
		System.out.println("Please enter element to find : ");
		int elem = input.nextInt();
		
		findBinary(0, arr.length-1, arr, elem);
		
		input.close();
		
	}
	
	public static void findBinary(int l, int h, int[] arr, int ele) {
		System.out.println(" - ");
		if (l <= h) {
			int m = (l + h) / 2;
			System.out.println("l " + l + " m " + m + " h " + h );
			
			System.out.println("Finding " + ele +" - mid "+ arr[m]);
			
			if (ele > arr[m]) {
				System.out.println("Considering right " + (m + 1 )+" - " + h);
				findBinary(m+1, h, arr, ele);
			} else if (ele < arr[m]) {
				System.out.println("Considering left " + l +" - " + (m-1));
				findBinary(l, m-1, arr, ele);
			} else if (ele == arr[m]) {
				System.out.println("Number found at " + m);			
			}
		} else {
			System.out.println("Number not found");			
		}
	}

}
