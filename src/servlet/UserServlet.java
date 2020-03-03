package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
/**
 * 操作用户信息的servlet
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;
import service.UserServiceImpl.UserServiceIpml;
@WebServlet("/add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置一个请求数据的编码
		req.setCharacterEncoding("UTF-8");
		//在servlet中去访问service中的书局
		UserService us=new UserServiceIpml();
		User user=new User();
		//获得页面上的数据
		String name=req.getParameter("name");
		//年龄需要进行强转（包装类）
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName(name);
		//调用实体类中的setter方法为私有的属性赋值
		user.setAge(age);
		us.save(user);
	}

}
