package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import entity.student;
import utils.BaseDao;


public class StuDao extends BaseDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	public List<student> getAll() {
		List<student> stu = new ArrayList<student>();
		try {
			conn=BaseDao.getConn();
			String sql ="select sname,sex,address from studentinfo";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				student st = new student();
				st.setSname(rs.getString(1));
				st.setSex(rs.getString(2));
				st.setAddress(rs.getString(3));
				stu.add(st);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stu;
	}

}
