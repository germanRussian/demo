package collection;

import java.util.*;

public class ArrayListExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> list = new Vector<String>();
//		Vector<String> list = new Vector<String>(30);
//		System.out.println("용량 :" + list.capacity());
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String Data = it.next();
			System.out.println(Data);
		}
		
		
		
		it = list.iterator();
		while(it.hasNext()) {
			String Data = it.next();
			System.out.println(Data);
		}

		
//		list.remove(1);
//		list.remove(1);
//		list.remove(1);
//		
//		for(int i =0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
		
		
		
//		System.out.println();
//		System.out.println(list.isEmpty());
//		System.out.println();
//		System.out.println("총 객체수 : " + list.size());
		


		
		
		
		
		
	}

}
