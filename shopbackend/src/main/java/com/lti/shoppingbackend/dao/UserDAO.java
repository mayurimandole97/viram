package com.lti.shoppingbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.shoppingbackend.dto.User;
@Repository
public interface UserDAO {

	// user related operation
	User getByEmail(String email);
	User get(int id);

	boolean addUser(User u);
	
	// adding and updating a new address
	//Address getAddress(int addressId);
//	boolean addAddress(Address address);
//	boolean updateAddress(Address address);
//	Address getBillingAddress(int userId);
//	List<Address> listShippingAddresses(int userId);
	

	
}