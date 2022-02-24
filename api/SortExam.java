package api;

import java.util.Arrays;

public class SortExam {

	public static void main(String[] args) {
		Member m1 = new Member("ㅂㅂㅂㅂ",100);
		Member m2 = new Member("ㅇㅇㅇㅇ",50);
		Member m3 = new Member("ㅁㅁㅁㅁ",80);
		
		
		Member [] members = {m1, m2, m3};
		Arrays.sort(members);
		for(int a =0; a<members.length; a++) {
			System.out.println("Member["+a+"].name = " + members[a].name);
		}
	}

}
