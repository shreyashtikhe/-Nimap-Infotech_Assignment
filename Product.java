package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	private Long id;

	private String product;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", nullable = false, updatable = false)
	private Category category;

	public Product(Long id, String product) {
		super();
		this.id = id;
		this.product = product;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product=" + product + "]";
	}
}

