package collections;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set_Demo {

	public static void main(String[] args) {
		Set myset=new HashSet();
		
		myset.add("dil");
		myset.add("dil");
		myset.add(10);
		myset.add(22);
		myset.add(null);
		myset.add(20.32);
		System.out.println(myset); //[null, 20.32, dil, 22, 10]
		System.out.println(myset.size());
		myset.add(25);
		System.out.println("Afteradded 25 " +myset);
		//myset.add(2,"2000");
		myset.remove("dil");
		
	}
}
