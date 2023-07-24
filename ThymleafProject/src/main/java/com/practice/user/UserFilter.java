package com.practice.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class UserFilter {

	public List<User> filterUser(String sFirst, String sLast) {
		Map<String,String> map = new HashMap<>();
		UserService ul = new UserService();
		List<User> ls = ul.getUserList();
		List<User> result = new ArrayList<>();
		
		/*for (User u : ls) {
			if((sLast != null && sFirst != null) && (u.fName.contains(sFirst) && u.lName.contains(sLast))) { 
				result.add(u);
			}
			 else if ((sLast != null && sFirst == null) && u.lName.contains(sLast)) {
				result.add(u);
			} else if ((sFirst != null && sLast == null) && (u.fName.contains(sFirst))) {
				result.add(u);
			}

		}
		for (User ur : result) {
			System.out.println(ur.id + " " + ur.fName + " " + ur.lName);
		}
		return result;
	}
*/
		result = ls.stream().filter(s->s.fName.contains(sFirst)).collect(Collectors.toList());
		for (User ur : result) {
			System.out.println(ur.id + " " + ur.fName + " " + ur.lName);
		}
		return result;
		
	/*
	 * public List<User> streamFilter(String sFirst, String sLast) { UserService
	 * service = new UserService(); List<User> userList =
	 * service.getUserList();//pre-populated user list //create predicate based on
	 * arguments - both not null first priority Predicate<User> up = u -> { if
	 * (StringUtils.isNotBlank(sFirst) && StringUtils.isNotBlank(sLast)) { return
	 * u.getfName().contains(sFirst) && u.getlName().contains(sLast); } else if
	 * (StringUtils.isNotBlank(sFirst)) { return u.getfName().contains(sFirst); }
	 * else if (StringUtils.isNotBlank(sLast)) { return
	 * u.getlName().contains(sLast); } return true;// no matching condition - so all
	 * to be considered };
	 * 
	 * return userList.stream().filter(up).collect(Collectors.toList());
	 */
	 }
}
