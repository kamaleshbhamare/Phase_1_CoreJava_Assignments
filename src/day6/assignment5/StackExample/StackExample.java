package day6.assignment5.StackExample;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack1 = new Stack();
		
		stack1.push("s1");
		stack1.push("s2");
		stack1.push("s3");
		stack1.push("s4");
		stack1.push("s5");
		
		stack1.push(1);
		stack1.push(3);
		stack1.push(5);
		
		stack1.push(12.234f);
		stack1.push(545.767f);
		
		System.out.println("Pushed 5 strings, 3 integer and 2 float elements ");
		
		for(Object obj: stack1 ) {
			System.out.println(obj);
		}
		
		stack1.pop();
		stack1.pop();
		
		System.out.println("Removed 2 elements using pop");

		for(Object obj: stack1 ) {
			System.out.println(obj);
		}
		
		System.out.println("Peeking element : " + stack1.peek());		
		
	}

}
