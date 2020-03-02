package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;
/**
 * 实现dao接口中的方法的一个操作类
 * @author 苏杭
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		// 创建一个集合来保存集合信息
		List<User> list = new ArrayList<User>();
		list.add(user);
		for (User user2 : list) {
			System.out.println(user2.getName()+"\n"+user2.getAge());
		}
	}

	@Override
	public void updata(User user) {
		System.out.println("執行修改用戶信息的操作");
	}


}
