package api;

public class Member implements Comparable<Member> {
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		//return o.age - age;
		//return age - o.age;
		return name.compareTo(o.name);//이름 순으로 오름차순
	}
	
	
}
