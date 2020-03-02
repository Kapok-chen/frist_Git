package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
/**
 * ���������û���Ϣ��servlet
 * @author �պ�
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;
//���÷���URL��Ϣ�������ע��
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//������������ʽ
		req.setCharacterEncoding("UTF-8");
		
		//��servlet��ȥ����service��
		UserService us = new UserServiceImpl();
		
		//���ҳ���ϵ�����
		String name  = req.getParameter("name");
		//��Ϊҳ������������ݶ���String����  ������Ҫǿת(��װ��)
		int age =  Integer.parseInt(req.getParameter("age"));
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setName("����");
		
		us.save(user);
	}

}
