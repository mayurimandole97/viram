package com.lti.shoppingbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.shoppingbackend.dao.UserDAO;
import com.lti.shoppingbackend.dto.User;
@Service
public class UserServiceImpl implements UserService{
	
	
		private UserDAO userDAO;
	//setter method for personDao
		@Autowired
		public void setUserDao(UserDAO userDAO) {
			this.userDAO = userDAO;
		}
		@Override
		@Transactional
		public void addUser(User u) {
			this.userDAO.addUser(u);
		}
	


}
