package day4.assignment3.customException;

public class CUstomException {
	static void checkSalary(int salary) throws SalaryException {
		if(salary < 2100) {
			throw new SalaryException("you need to work hard");
		} else if(salary >= 2100 && salary < 5000) {
			throw new SalaryException("you salary is somehow good");
		} else if(salary >= 5000 && salary < 9000) {
			throw new SalaryException("salary is very good");
		}
	}
	
	public static void main(String args[]) {
		try {
			checkSalary(4000);
		} catch(Exception m) {
			System.out.println("Exception occured : " + m.getMessage());
		}
	}
}


class SalaryException extends Exception {
	
	SalaryException(String s) {
		super(s);
	}
}