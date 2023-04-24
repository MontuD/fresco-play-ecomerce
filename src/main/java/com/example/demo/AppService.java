package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Product;
import com.example.demo.entity.Role;
import com.example.demo.entity.repository.CartProdcutRepo;
import com.example.demo.entity.repository.CartRepo;
import com.example.demo.entity.repository.ProductRepository;
import com.example.demo.entity.repository.RolesRepository;
import com.example.demo.entity.User;
import com.example.demo.entity.repository.UserRepository;

@Service
public class AppService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	RolesRepository rolesRepository;
	@Autowired
	CartProdcutRepo cartProdcutRepo;
	
	@Autowired
	CartRepo cartRepo;
	
	@Autowired
	ProductRepository productRepository;
	
	
	
	
	
	public Role saveRole(Role role){
		return this.rolesRepository.save(role);
	}
	
	public List<Product> getproduct() {
		return this.productRepository.findAll();
		
	}
	
	public List<Cart> getCartItems(){
		return this.cartRepo.findAll();
	}
	
	
	public Cart getCartItemById(Integer id){
		return this.cartRepo.findById(id).get();
	}

	public User getUserById(Integer id){
		return this.userRepository.findById(id).get();
	}

	public List<Role> getUserRolesById(Integer id){
		return this.userRepository.findById(id).get().getRoles();
	}


	
	
	public User saveUser(User user){
		return this.userRepository.save(user);
	}
	
	public List<User> getUser(){
		return this.userRepository.findAll();
	}
	
	public List<Role> getRoles(){
		return this.rolesRepository.findAll();
	}

}
