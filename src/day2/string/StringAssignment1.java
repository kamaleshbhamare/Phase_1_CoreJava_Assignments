package day2.string;

public class StringAssignment1 {
	public static void main(String[] args) {
		String t= "Delhi";   
		String o = "Mumbai"; 
		String k= "delhi";   
		String y= new String ("Mumbai");   
		String l= new String ("delhi");  
		String p = new String("Hello");  
		
		/* equals and ==
		(1) o with l
		(2) y with p
		(3) t with o
		(4) k with y
		(5) p with y */
		
		System.out.println("o.equals(l) : "+ o.equals(l)); // false
		System.out.println("o == l : " + (o == l)); // false
		
		System.out.println("y.equals(p) : "+ y.equals(p)); // false
		System.out.println("y == p : "+ (y == p)); // false
		
		System.out.println("t.equals(o) : "+ t.equals(o)); // false
		System.out.println("t == o : "+ (t == o)); // false
		
		System.out.println("k.equals(y) : "+ k.equals(y)); // false 
		System.out.println("k == y : "+ (k == y)); // false 
		
		System.out.println("p.equals(y) : "+ p.equals(y)); // false 
		System.out.println("p == y : "+ (p == y));	// false
		
		System.out.println("o.equals(y) : "+ o.equals(y)); // true 
		System.out.println("o == y : "+ (o == y));	// false
		
	}
	
}
