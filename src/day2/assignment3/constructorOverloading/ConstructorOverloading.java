package day2.assignment3.constructorOverloading;

public class ConstructorOverloading {

	String name;
	int age;
	char section;
	char gender;
	int subject1 = 0;
	int subject2 = 0;
	int subject3 = 0;
	int total;
	float percentage = 0;
	
	ConstructorOverloading(String name1, int age1, char section1, char gender1, int s1, int s2, int s3) {
		name = name1;
		age = age1;
		section = section1;
		gender = gender1;
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
		total = s1 + s2 + s3;
		percentage = total * 100 / 300;
	}
	
	ConstructorOverloading(String name1, int age1, char section1, char gender1, int s2, int s3) {
		name = name1;
		age = age1;
		section = section1;
		gender = gender1;
		subject2 = s2;
		subject3 = s3;
		total = s2 + s3;	
		percentage = total * 100 / 300;
	}
	
	public void displayName() {
		System.out.println("Name is " + name + " subject " + subject1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading s1 = new ConstructorOverloading("a", 22, 'a', 'm', 50, 50, 50);
		ConstructorOverloading s2 = new ConstructorOverloading("b", 22, 'a', 'm', 40, 40);
		ConstructorOverloading s3 = new ConstructorOverloading("c", 22, 'a', 'm', 30, 30);
		ConstructorOverloading s4 = new ConstructorOverloading("d", 22, 'a', 'm', 70, 70, 70);
		
		System.out.println("Percentage is " + s1.percentage + " Total is - " + s1.total);
		System.out.println("Percentage is " + s2.percentage + " Total is - " + s2.total);
		System.out.println("Percentage is " + s3.percentage + " Total is - " + s3.total);
		System.out.println("Percentage is " + s4.percentage + " Total is - " + s4.total);
		
		// s1.displayName();
		// s2.displayName();
	}
	
	

}
