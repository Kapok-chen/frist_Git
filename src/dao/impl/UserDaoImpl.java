package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;
/**
 * ʵ��dao�ӿ��еķ�����һ��������
 * @author �պ�
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		// ����һ�����������漯����Ϣ
		List<User> list = new ArrayList<User>();
		list.add(user);
		for (User user2 : list) {
			System.out.println(user2.getName()+"\n"+user2.getAge());
		}
	}

	@Override
	public void updata(User user) {
		System.out.println("�����޸��Ñ���Ϣ�Ĳ���");
	}


}
