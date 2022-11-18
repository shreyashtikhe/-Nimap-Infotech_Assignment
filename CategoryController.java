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

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private  CategoryRepository re;

	@PostMapping("categories/s")
	public Category save(@RequestBody Category category ) {
		return re.save(category);		
	}
	@DeleteMapping("categories/delete/{id}")
	public void delete(@PathVariable long id) {
			re.deleteById(id);
			}
	@PutMapping("categories/put/{id}")
	  public Category update(@RequestBody Category category ,@PathVariable("id") Long Id)
	    {
	        return re.save(category);
	    }
	@GetMapping("categories/get/{id}")
	 public Optional < Category > findById(Long id) {
        return re.findById(id);
    }
	@GetMapping("categories/all")
	public List<Category> listall() {
		return re.findAll();
		
	}
	
}

