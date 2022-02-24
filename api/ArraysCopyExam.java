package api;

import java.util.Arrays;

public class ArraysCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1 = { 'j', 'a', 'v', 'a' };

		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));

		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));

		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int a = 0; a<arr4.length; a++) {
			System.out.println("arr4[ "+a+" ] =" +arr4[a]);
		}
	
	}

}
