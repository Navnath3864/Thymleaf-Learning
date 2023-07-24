package com.practice.user;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	public List<User> getUserList() {

		User user = new User();
		user.id = 1;
		user.fName = "Navnath";
		user.lName = "Gutte";
		
		User user3 = new User();
		user3.id = 4;
		user3.fName = "abc";
		user3.lName = "Gutte";


		User user1 = new User();
		user1.id = 2;
		user1.fName = "abc";
		user1.lName = "xyz";

		User user2 = new User();
		user2.id = 3;
		user2.fName = "abyz";
		user2.lName = "xyyz";

		User user4 = new User();
		user4.id = 5;
		user4.fName = "mno";
		user4.lName = "pqr";

		User user5 = new User();
		user5.id = 6;
		user5.fName = "abc";
		user5.lName = "xyz";

		User user6 = new User();
		user6.id = 7;
		user6.fName = "Nav";
		user6.lName = "xyabc";

	

		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		list.add(user6);
		
		return list;

	}

}
