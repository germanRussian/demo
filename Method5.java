/**
 * 
 * @author smart9
 *
 */
public class Method5 {
	public static void aaa(int i, char j) {

		System.out.println("aaa()함수가 호출되었습니다." + (++i));
		return; // 리턴을 만나면 중괄호를 벗어남 아래 수행문을 수행하지 않기에, 아래 수행문을 적지 않는다.
		// System.out.println();
	}

	// static은 static이다.
	private static int bbb(int i) {
		i += 1;
		i=i+1;
		i++;
		return i;
	}

	public static void main(String[] args) {
		int i = 24;
		i=bbb(i);
		System.out.println(i);
	}

}
