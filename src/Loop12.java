/**
 * 피보나치 수열을 만들어보시오.
 */
public class Loop12 {
	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;
		
		for (;c<13; ) {//b=c이기때문에 13아래는 8까지만 값이 나옴
			a=b;
			b=c;
			c=a+b;
			System.out.print(" " + c);
		}
		
	}
}

//a : 0 1 1 2 3 5 = b(a)
//b : 1 1 2 3 5 8 = c(b)
//c : 1 2 3 5 8 13 = a+b(c)



// syso = System.out.println();
