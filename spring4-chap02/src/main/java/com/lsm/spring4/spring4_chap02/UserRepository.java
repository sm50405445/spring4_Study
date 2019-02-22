package com.lsm.spring4.spring4_chap02;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {

	private Map<String, User> userMap = new HashMap<>();
	
	public User findUserById(String id) {
		
	}
	
	public void setUsers(List<User> users) {
		for(User u : users) {
			userMap.put(u.getId(), u);
		}
	}
}
