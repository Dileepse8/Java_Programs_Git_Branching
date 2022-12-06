package encapsulation;

public class Method_demo {

	// no p no return
	void mthd1() {
		System.out.println("no return");
	}

	// no p with return
	String mthd2() {
		return "i am no param return value";
	}

	// with p no return
	String mthd3(String name) {
		return "i am with param no return value" +name;
	}

	// with p with return
	String mthd4(String name) {
		return "i am with param with return value" +name;
	}
}
