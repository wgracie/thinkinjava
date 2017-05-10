package exceptions;

class MyExceptions2 extends Exception {
	private int x;
	public MyExceptions2() {}
	public MyExceptions2(String msg) { super(msg); }
	public MyExceptions2(String msg, int x) {
		super(msg);
		this.x = x;
	}
	
	public int val() { return x; }
	public String getMessage() {
		return "Detail Message: " + x + " " + super.getMessage();
	}
}

public class ExtraFeatures {
	public static void f() throws MyExceptions2 {
		System.out.println("Throwing MyExceptions2 from f()");
		throw new MyExceptions2();
	}
	
	public static void g() throws MyExceptions2 {
		System.out.println("Throwing MyExceptions2 from g()");
		throw new MyExceptions2("Originated in h()");
	}
	
	public static void h() throws MyExceptions2 {
		System.out.println("Throwing MyExceptions from h()");
		throw new MyExceptions2("Originated in h()", 47);
	}
	
	public static void main(String[] args) {
		try {
			f();
		} catch(MyExceptions2 e) {
			e.printStackTrace(System.out);
		}
		
		try {
			h();			
		} catch(MyExceptions2 e) {
			e.printStackTrace(System.out);
		}
		
		try {
			h();			
		} catch(MyExceptions2 e) {
			e.printStackTrace(System.out);
			System.out.println("e.val() = " + e.val());
		}
	}
	

}
