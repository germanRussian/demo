package domain;



/**
 * 
 * 
 * VO 클래스 
 * 
 * mysql Table을 VO클래스로 만듦
 * 
 * 
 */
import java.sql.Timestamp;
import java.util.Date;

public class ExamVO {
	
	private int num;
	private String varcharTest; 
	private String charTest;
	private double doubleTest;
	private Date dateTest;  
	private Timestamp dateTimeTest;
	
	
	//디폴트 생성자
	public ExamVO() {
				
	}



	//필드를 활용하여 생성자를 작성
	public ExamVO(int num, String varcharTest, String charTest, double doubleTest, Date dateTest,
			Timestamp dateTimeTest) {
		
		this.num = num;
		this.varcharTest = varcharTest;
		this.charTest = charTest;
		this.doubleTest = doubleTest;
		this.dateTest = dateTest;
		this.dateTimeTest = dateTimeTest;
	}




	@Override
	public String toString() {
		return "ExamVO [num=" + num + ", varcharTest=" + varcharTest + ", charTest=" + charTest + ", doubleTest="
				+ doubleTest + ", dateTest=" + dateTest + ", dateTimeTest=" + dateTimeTest + "]";
	}
	
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getVarcharTest() {
		return varcharTest;
	}
	public void setVarcharTest(String varcharTest) {
		this.varcharTest = varcharTest;
	}
	public String getCharTest() {
		return charTest;
	}
	public void setCharTest(String charTest) {
		this.charTest = charTest;
	}
	public double getDoubleTest() {
		return doubleTest;
	}
	public void setDoubleTest(double doubleTest) {
		this.doubleTest = doubleTest;
	}
	public Date getDateTest() {
		return dateTest;
	}
	public void setDateTest(Date dateTest) {
		this.dateTest = dateTest;
	}
	public Timestamp getDateTimeTest() {
		return dateTimeTest;
	}
	public void setDateTimeTest(Timestamp dateTimeTest) {
		this.dateTimeTest = dateTimeTest;
	}
	  
	  

}
