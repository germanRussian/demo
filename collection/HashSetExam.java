package collection;

import java.util.*;


public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> set = new HashSet<String>();//중복값 허용 안함
		List<String> set = new ArrayList<String>();//중복값 허용
		
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
//		set.add("iBATIS");
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String Data = it.next();
			System.out.println(Data);
		}
	}

}
