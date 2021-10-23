package day1.assignment1.modifier.p1;

public class M {
	private int i = 100;
	long l = 1234;
	protected float f = 12; 
	
	public void methodPublic() {
		System.out.println("Class M: methodPublic");
	}
	
	void mothodDefault() {
		System.out.println("Class M: methodDefault");	
	}
	
	private void methodPrivate() {
		System.out.println("Class M: methodPrivate");
	}
	
	protected void methodProtechted() {
		System.out.println("Class M: methodProtected");
	}
	
}
