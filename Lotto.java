import java.util.HashSet;

/**
 * 로또 만들
 * 
 * @author smart9
 *
 */
public class Lotto {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			HashSet<Integer> hs = new HashSet<Integer>();
			while (true) {
				hs.add((int) (Math.random() * 45) + 1);

				if (hs.size() == 6) {
					break;// 반복문을 빠져나간다.

				}
			}

			System.out.println(hs);

		}
	}
}
