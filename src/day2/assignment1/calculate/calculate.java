package day2.assignment1.calculate;

public class calculate {

	public static void main(String[] args) {
		// add numbers
		int addition = add(1, 2);
		System.out.println(addition);
		
		// calculate rectangle area 
		int rectangleArea = calculateArea(2, 2);
		System.out.println(rectangleArea);
		
		// calculate circle area
		float areaCircle = calculateArea(20);
		System.out.println(areaCircle);
	}
	
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	} 
	
	public static float calculateArea(int radius) {
		float area = (float) Math.PI * radius * radius;
		return area; 
	}
	
	public static int calculateArea(int s1, int s2) {
		int area = s1 * s2;
		return area; 
	}
}


/*
 * 
 * Assignment 1: (function overloading)
Note **: create function name as "calculate"
create three functions in a class
1) create method of return type int
   - add two numbers
2) one of return type float
  to calculate the area of the circle
3) one of return type int 
   area of the rectangle
 * 
 * 
 * */