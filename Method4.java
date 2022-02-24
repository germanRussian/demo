/**
 * 
 * @author smart9
 *
 */
public class Method4 {
	public static void aaa(int i, char j) {
		
		System.out.println("aaa()함수가 호출되었습니다." + (++i)+j);
		
	}    

	
	public static void main(String[] args) {
		int i = 24;
		aaa(i, 'A');
		System.out.println(i);
	}

}
