package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CartProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer cpId;
	Integer quantity;
	@ManyToOne(fetch = FetchType.EAGER)
	Product product;

	@Override
	public String toString() {
		return "CartProduct [cpId=" + cpId + ", quantity=" + quantity + ", product=" + product.toString() + "]";
	}


	
}
