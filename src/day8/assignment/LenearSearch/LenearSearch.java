package day8.assignment.LenearSearch;

import java.util.Scanner;
public class LenearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter array : ");
		
		for(int i=0; i < arr.length; i++) {
			int l = input.nextInt();
			arr[i] = l;
		}

		System.out.println("Please enter element to find : ");
		int elem = input.nextInt();
		
		boolean found = false;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == elem) {
				System.out.println("Found at : " + i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Could not find ");	
		}
				
		input.close();
		
	}

}


