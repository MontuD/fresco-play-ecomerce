package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Product;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;

import jakarta.websocket.server.PathParam;

@RestController
public class AppController {
	
	@Autowired
	AppService appService;

	@GetMapping("/addrole")
	public Role addRole(@RequestBody Role roles){
		return this.appService.saveRole(roles);
	}
	
	@GetMapping("/getcartitems")
	public List<Cart> getCartitems(){
		return this.appService.getCartItems();
	}
	
	@GetMapping("/getproduct")
	public List<Product> getproduct(){
		return this.appService.getproduct();
	}
	
	@GetMapping("/getCartItemById/{id}")
	public Cart getCartItemById(@PathVariable Integer id) {
		return this.appService.getCartItemById(id);
	}

	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable Integer id) {
		return this.appService.getUserById(id);
	}


	@GetMapping("/getUserRolesById/{id}")
	public List<Role> getUserRolesById(@PathVariable Integer id) {
		return this.appService.getUserRolesById(id);
	}
		
	@GetMapping("/user")
	public List<User> addRole(){
		return this.appService.getUser();
	}

	@GetMapping("/role")
	public List<Role> getRoles(){
		return this.appService.getRoles();
	}
	
	
	
	@GetMapping("/adduser")
	public User addRole(@RequestBody User user){
		return this.appService.saveUser(user);
	}
	
	
}
