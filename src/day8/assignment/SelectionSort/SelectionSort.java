package day8.assignment.SelectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {29, 72, 98, 13, 87, 66, 52, 51, 36};
		
		selectionSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);			
		}
	}

	
	public static void selectionSort(int[] arr){
		for( int i=0; i < arr.length; i++) {
			
			int smallIndex = 0;
			for( int j= i+1; j < arr.length; j++) {
				if(arr[j] < arr[smallIndex]) {
					
				}
			}
			
		}
	}
}
