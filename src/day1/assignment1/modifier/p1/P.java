package day1.assignment1.modifier.p1;

public class P {

	public static void main(String[] args) {
		System.out.println("From Class P: Class M: l: " + new M().l);
		System.out.println("From Class P: Class M: f: " + new M().f);
		
		System.out.println("From Class P: Class N: l: " + new N().l);
		System.out.println("From Class P: Class N: i: " + new N().i);
		System.out.println("From Class P: Class N: d: " + new N().d);
	}
	
	public void methodPublic() {
		System.out.println("Class P: mothodPublic");
	}
	
	void mothodDefault() {
		System.out.println("Class P: mothodDefault");	
	}
	
	private void methodPrivate() {
		System.out.println("Class P: MethodPrivate");
	}
	
	protected void methodProtechted() {
		System.out.println("Class P: MethodProtected");
	}
	
}
