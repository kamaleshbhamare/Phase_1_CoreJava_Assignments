package day1.assignment1.modifier.p2;
import day1.assignment1.modifier.p1.*;

public class Y extends N {

	public static void main(String[] args) {
		// Calling methods of Class M and N
		new M().methodPublic();
		new N().methodPublic();
		
		// Calling variables of class X
		System.out.println("From Class Y: Class X: c: " + new X().c);
		System.out.println("From Class Y: Class X: f: " + new X().f);
		System.out.println("From Class Y: Class X: l: " + new X().l);
	}

}
