package api;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ClassExam ce = new ClassExam();
		System.out.println(ce.getClass());
		System.out.println(ce.getClass().getName());
		Class Clazz = Class.forName("api.Counter");
		System.out.println(Clazz.getName());
	}

}
