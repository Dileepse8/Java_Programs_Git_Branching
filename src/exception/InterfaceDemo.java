package exception;

interface Shape {
	int length = 10; // FInal&Static
	int width = 5; // FInal&Static

	void circle();

	default void rectangle() { // interface accept static and default methods

		String a = "a";
		String b = "b";
		String C = a + b;
		System.out.println(C);
	}

	static void square() { // interface accept static and default methods
		int a = 10;
		int b = 10;
		int c = a * b;
		System.out.println(c);
	}
}

public class InterfaceDemo implements Shape {
	public void circle() {
		int a = 5;
		int b = 20;
		int c = b - a;
		System.out.println(c);

	}

	public static void main(String[] args) {
		//InterfaceDemo dm = new InterfaceDemo();
		Shape dm = new InterfaceDemo();
		dm.circle();
		dm.rectangle();
		Shape.square(); // Static method can directly access

	}

}
