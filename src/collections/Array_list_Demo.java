package collections;

import java.util.ArrayList;
import java.util.List;

public class Array_list_Demo {

	public static void main(String[] args) {

		// @SuppressWarnings("rawtypes")
		// ArrayList mylist=new ArrayList();
		List mylist = new ArrayList();

		mylist.add(120);
		mylist.add("Dileep");
		mylist.add(10.20);
		mylist.add(10.20);
		mylist.add(null);
		mylist.add(null);
		System.out.println(mylist.size());
		System.out.println(mylist);//display all elements[120, Dileep, 10.2, 10.2, null, null]
		mylist.remove(5);
		System.out.println(mylist);
		System.out.println(mylist.size());
		mylist.add("jji");
		System.out.println(mylist.size());
		System.out.println(mylist);
		System.out.println(mylist.get(2));//get specific value
		mylist.add(2,"Ganji");
		System.out.println(mylist);//[120, Dileep, Ganji, 10.2, 10.2, null, jji]
		for (int i = 0; i <mylist.size(); i++) {
			System.out.println("value is : "+ mylist.get(i));
			
		}
		System.out.println("another loop");
		for(Object e:mylist)
		{
			System.out.println("value is : "+ e);
		}
		
	}
}
