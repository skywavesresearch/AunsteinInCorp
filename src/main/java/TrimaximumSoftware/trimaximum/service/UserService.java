package TrimaximumSoftware.trimaximum.service;

import TrimaximumSoftware.trimaximum.model.User;

public interface UserService {

	 public void save(User user);

	 public User findByUsername(String username);
	
}
