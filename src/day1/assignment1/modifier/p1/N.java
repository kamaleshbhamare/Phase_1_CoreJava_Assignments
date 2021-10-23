package day1.assignment1.modifier.p1;

public class N {

	protected long l = 1234; 
	public int i = 200;
	double d = 5678;
	
	public void methodPublic() {
		System.out.println("Class N: methodPublic");
	}
	
	void mothodDefault() {
		System.out.println("Class N: methodDefault");	
	}
	
	private void methodPrivate() {
		System.out.println("Class N: methodPrivate");
	}
	
	protected void methodProtected() {
		System.out.println("Class N: methodProtected");
	}
	
}
