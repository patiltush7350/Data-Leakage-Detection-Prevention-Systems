package com.data.service;

import com.data.Model.User;

public interface UserService {
		void save(User user);
		User findByUsername(String username);
}
