package generic;

public class CompareMethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer,String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer,String> p2 = new Pair<Integer, String>(1, "사과");
		if(boolean result = Util.<Integer,String> compare(p1,p2){
			System.out.println("논리적으로 동등한 객체입니다.");
			
		}else {
			System.out.println("논리적으로 동등한 객체가 아닙니다.");
		}
	}

}
