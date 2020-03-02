package service;

import java.util.List;


import dao.StuDao;
import entity.student;


public class StuService {
	private StuDao sd =new StuDao();
	public List<student> getAll() {
	List<student> stu = sd.getAll();
	if(stu !=null) {
		return stu;
	}else {
		return null;
	}
}
}
