package encapsulation;

public class Static_Demo {

	int a=10;
	static int b=22;
	
	void m1() {
		System.out.println("Non Static method");
	}
	static void m2() {
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		Static_Demo vv=new Static_Demo();
		System.out.println(vv.a);
		System.out.println(b);
		//m1 mm=new m1();
		vv.m1();
		m2();
	}
}
