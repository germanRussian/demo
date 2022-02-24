package collection;

public class Member {
	private String name;
	private int age;
	
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) &&(member.age == age);
		}else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() +age;
	}
	
	
	
	
	
}
