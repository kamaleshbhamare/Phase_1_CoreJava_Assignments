package day1.assignment1.modifier.p2;
import day1.assignment1.modifier.p1.*;

public class Z extends M {

	public static void main(String[] args) {
		
		// Calling methods of M, N, P classes
		new M().methodPublic();
		new N().methodPublic();
		new P().methodPublic();

		// Calling variables of class X
		System.out.println("From Class Z: Class X: c: " + new X().c);
		System.out.println("From Class Z: Class X: f: " + new X().f);
		System.out.println("From Class Z: Class X: l: " + new X().l);
	}

}
