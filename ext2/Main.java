package ext2;

public class Main {

	public static void main(String[] args) {
		
		//String name, int age, int height, int weight, String studentID, int grade, double gPA
		Student student1 = new Student("홍길동", 10, 170, 70, "20220300", 1, 4.5);
		Student student2 = new Student("이순신", 20, 168, 80, "20220400", 1, 4.0);
		Teacher teacher1 = new Teacher("박아무게", 50, 190, 70, "2525252534");
		
		System.out.println(student1.toString());
		System.out.println(student2);
		System.out.println(teacher1);
	}

}
