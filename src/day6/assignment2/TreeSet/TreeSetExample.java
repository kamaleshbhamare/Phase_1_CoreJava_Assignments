package day6.assignment2.TreeSet;

import java.util.*;
import java.util.Scanner;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> TS1 = new TreeSet<String>();
		
		TS1.add("Java");
		TS1.add("C++");
		TS1.add("Python");
		TS1.add("C#");
		TS1.add("PHP");
		TS1.add("Ruby");
		
		System.out.println(TS1);
		
		TS1.remove("Python");
		TS1.remove("PHP");
		
		System.out.println(TS1);
		
		System.out.println("Is java there? " + TS1.contains("Java"));
		
		TS1.removeAll(TS1);
				
		System.out.println(TS1);
		
	}

}
