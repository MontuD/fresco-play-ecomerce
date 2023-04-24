package com.example.demo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cart;
import com.example.demo.entity.CartProduct;


@Repository
public interface CartProdcutRepo extends JpaRepository<CartProduct, Integer> {

}
