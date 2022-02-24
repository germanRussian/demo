package collection;

import java.util.*;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("신용권", 95);
//		System.out.println("총 Entry 수 : " + map.size());  //키값이 동일하면 새로운 값으로 수정되어, 3개만 표시됨
		
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.print(key);
			System.out.print(" : ");
			System.out.println(map.get(key));//주이진 키의 Value 값을 가져온다.
			
		}
		System.out.println(map.get("홍길동"));//홍길동의 값을 가져온다.
		
	}

}
