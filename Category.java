package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class Category {
private Long id;

private String category;



public Category() {
	super();
	// TODO Auto-generated constructor stub
}

public Category(Long id, String category) {
	super();
	this.id = id;
	this.category = category;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "category [id=" + id + ", category=" + category + "]";
}

}
