package datastructure;
import java.util.*;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Michael");
		alist.add("Vicky");
		alist.add("Jerry");
		alist.add("Damian");
		alist.add("Katty");
		alist.add("Johnny");
		System.out.println(alist);
		alist.add(3, "Michael");
		System.out.println(alist);

		alist.remove("Michael");
		alist.remove("Katty");
		System.out.println(alist);
		alist.remove(2);
		System.out.println(alist);
		System.out.println("Head of the list:" + UseArrayList.peek());
		System.out.println("The element at index 3 in the ArrayList is: " + alist.get(3));

		for (String str : alist)
			System.out.println(str);
	}


	private static String peek() {

		return null;
	}
}

