package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;


@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private  ProductRepository re;

	@PostMapping("products/s")
	public Product save(@RequestBody Product product ) {
		return re.save(product);		
	}
	@DeleteMapping("products/delete/{id}")
	public void delete(@PathVariable long id) {
			re.deleteById(id);
			}
	@PutMapping("products/put/{id}")
	  public Product update(@RequestBody Product product ,@PathVariable("id") Long Id)
	    {
	        return re.save(product);
	    }
	
	@GetMapping("products/get/{id}")
	 public Optional < Product > findById(Long id) {
        return re.findById(id);
    }
	@GetMapping("products/all")
	public List<Product> listall() {
		return re.findAll();
		
	}
}

