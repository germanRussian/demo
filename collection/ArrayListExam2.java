package collection;

import java.util.*;

public class ArrayListExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		
		list.remove(1);
		list.remove(1);
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		System.out.println();
		System.out.println(list.isEmpty());
		System.out.println();
		System.out.println("총 객체수 : " + list.size());
		


		
		
		
		
		
	}

}
