package interfaces;

public class InterfaceDemo_final extends InterfaceDemo implements Interface1, Interface2
{
	 public void m1() {
		System.out.println("this is from Interface1");
		System.out.println(a);
	}
	 public void m2() {
		 System.out.println("this is from Interface2");
			System.out.println(b);
		}

	public static void main(String[] args) {
		InterfaceDemo_final ab=new InterfaceDemo_final();
		ab.circle();
		ab.m1();
		ab.m2();
		//System.out.println(c);
		

	}

}
