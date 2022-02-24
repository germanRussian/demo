import java.util.Iterator;

/**
 * 주어진 배열의 항목에서 최솟값을 구해보세요.( for문을 이용하세요) {-1,5,3,8,2} 결과값은 -1
 * 
 * @author smart9
 *
 */
public class ArrayExam16 {

	public static void main(String[] args) {
		int[][] array = { 
						{ 95, 86 }, 
						{ 83, 92, 96 }, 
						{ 78, 83, 93, 87, 88 }
						};

		int sum = 0;
		double avg = 0.0;
		
		int arrayCnt = 0;
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				sum = sum + array[i][k];
				arrayCnt++;
				// System.out.println(array[i][k]);
			}

		}
		 avg = (double)sum/arrayCnt;
	
		
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);

	}

}

//if문의 작동 방식을 생각해볼 것