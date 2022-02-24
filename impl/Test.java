package impl;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * 캐스팅
 * 
 * @author smart17
 *
 */
public class Test {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("HI");
		al.add("java");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			//it.next(); 아래와 동일, 아래는 캐스팅 활용한 것.
			String str = (String)it.next();
			System.out.println(str);
		}
		
	}

}
