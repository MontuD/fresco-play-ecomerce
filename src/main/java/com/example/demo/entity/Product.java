package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer productId;
	String productName;
	Double price;
	@ManyToOne(fetch = FetchType.EAGER)
	User seller;
	@ManyToOne(fetch = FetchType.EAGER)
	Category category;
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", seller="
				+ seller.toString() + ", category=" + category.toString() + "]";
	}


	
}


