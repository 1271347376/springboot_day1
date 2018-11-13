package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserDao {
	public void save(User user);
	public User login(User user);
}
