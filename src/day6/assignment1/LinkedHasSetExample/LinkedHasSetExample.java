package day6.assignment1.LinkedHasSetExample;

import java.util.*;
import java.util.Scanner;

public class LinkedHasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet L1 = new LinkedHashSet();
		
		L1.add(2);
		L1.add(3);
		
		L1.add(234.234f);
		L1.add(112.45f);
		
		L1.add('a');
		L1.add('b');
		
		L1.add(true);
		
		System.out.println(L1);
		
		LinkedHashSet<Integer> L2 = new LinkedHashSet<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int n4 = input.nextInt();
		int n5 = input.nextInt();
		int n6 = input.nextInt();
		int n7 = input.nextInt();
		int n8 = input.nextInt();
		
		L2.add(n1);
		L2.add(n2);
		L2.add(n3);
		L2.add(n4);
		L2.add(n5);
		L2.add(n6);
		L2.add(n7);
		L2.add(n8);
		
		System.out.println(L2);
		
	}

}
