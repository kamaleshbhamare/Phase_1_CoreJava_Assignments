package day2.array;

public class ArrayAssignment1 {
	
	public static void main(String[] args) {
		
		int[][] a = {{15, 25, 35}, {45, 55, 65}};
		int[][] b = {{12, 22, 32}, {55, 25, 85}};
		
		int[][] c = new int[2][3];
		
		for (int i=0; i< a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j]; 
			}
		}
		
		for (int i=0; i< c.length; i++) {
			for(int j=0; j < c[i].length; j++) {
				System.out.println("c[ " + i + " ][ " + j + " ]  - "+c[i][j]); 
			}
		}
	}
	
}
