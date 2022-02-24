/**
 * 마방진 3*3
 * 
 * @author smart9
 *
 */
public class ArrayExam10 {

	public static void main(String[] args) {
		int[][] arr = { 
						{2,7,6}, 
						{9,5,1}, 
						{4,3,8} 
					  };
		//1
		int rowCntChk = 0;//--------------------------------------------------------가로값 15체크
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				//3
				rowCntChk += arr[i][j];
				
			}
		}
		if(rowCntChk != (15*3)) {
			System.out.println("오답");
			return;
		}
		int colCntChk = 0; //--------------------------------------------------------세로값 15체크
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				//3
				colCntChk += arr[j][i];
				
			}
			
		}
		if(colCntChk!=(15*3)) {
			System.out.println("오답");
			return;
		}
		int leftTop = 0;//-----------------------------------------------------------왼쪽 대각선 합
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i == j) {
					leftTop += arr[j][i];
				}				
			}
		}
		if(leftTop != 15) {
			System.out.println("오답");
			return;
		}
		int rightTop = 0;//-------------------------------------------------------------오른쪽 대각선 합
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i + j == 2) {
					rightTop += arr[j][i];
				}				
			}
		}
		if(rightTop != 15) {
			System.out.println("오답");
			return;
		}
		System.out.println("정답입니다.축하축하");
	}

}



