package day4.assignment1.nestedExceptionHandling;

public class nestedExceptionHandling {
	
	public static int a[]= new int[5];
	
	public static void main(String[] args) {
		  
         try {
        	 checkArrayIndexOutOfBoundsException();
        	 a[3]=30/0;	
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException " + e);
		}
        
	}
	
	public static void checkArrayIndexOutOfBoundsException() {
        try {
       	 	a[5]=9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException" + e);
		}
	}
	
}
