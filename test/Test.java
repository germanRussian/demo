package test;


import java.sql.Timestamp;
import java.util.Date;

import dao.ExamDAO;
import domain.ExamVO;

//import test.dao.simple2DAO;

public class Test {

	public static void main(String[] args) {
		
//		simple2DAO dao = new simple2DAO();
//		dao.create();
//		//dao.read();
//		//dao.update();
//		//dao.delete();
		
		
		//생성자를 활용
		ExamDAO dao = new ExamDAO();
		ExamVO Createvo = new ExamVO(0, "가변폭문자열", "고정폭문자열", 0.123, new Date(), new Timestamp(System.currentTimeMillis()));
		//System.out.println(Createvo);
		dao.create(Createvo);
		
	}

}
