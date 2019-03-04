package com.Signinup.service;

import com.Signinup.model.User;

/**
 * Authentication with a Database-backed UserService
 * @author ogounaya
 */
public interface UserService {
	
	public User findUserByEmail(String email); 
	public void saveUser(User user);
	
}
