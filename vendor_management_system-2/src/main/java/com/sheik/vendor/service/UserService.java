package com.sheik.vendor.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.sheik.vendor.model.Payment;
import com.sheik.vendor.model.Product;
import com.sheik.vendor.model.User;



public interface UserService {
public boolean adduser(User user);
public List<User> getUser();
public boolean updateuser(Long id,User user);
public boolean deleteUser(Long id);
public Page<User>getAllUser(PageRequest pageRequest);

public List<String> getFullName();
List<User>findAllUser();
public User getEmail(String email);
List<User> findAllQuery();
public int deleteUserQuery(Long id);
public int updateUserQuery(String name, Long id);
boolean addUser(User user);
boolean getuser(User user);

public Product postproduct(Product data);
public Payment postpayment(Payment data);


}