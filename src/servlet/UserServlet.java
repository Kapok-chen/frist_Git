package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
/**
 * 用来操作用户信息的servlet
 * @author 苏杭
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;
//设置访问URL信息，这就是注解
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码格式
		req.setCharacterEncoding("UTF-8");
		
		//在servlet中去访问service类
		UserService us = new UserServiceImpl();
		
		//获得页面上的数据
		String name  = req.getParameter("name");
		//因为页面上请求的数据都是String类型  所有需要强转(包装类)
		int age =  Integer.parseInt(req.getParameter("age"));
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setName("張三");
		
		us.save(user);
	}

}
