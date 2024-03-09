package com.example.demo3.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.entity.Product;
import com.example.demo3.payload.AppConstants;
import com.example.demo3.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/create")
	public Product createProuct(@RequestBody Product product)
	{
		//System.out.println(product.getPname());
		Product createProduct=productService.createProduct(product);
		return createProduct;
		
	}
	//view Product
	@GetMapping("/View")
	public List<Product>viewAllProduct()
	{
		 List<Product> viewAll=productService.viewAll();
		 
		 return viewAll;
	}
	
		//view ProductBy id
	@GetMapping("view/{pid}")
	public Product  viewProuctById(@PathVariable long pid )
	{
		Product viewProuctById =(Product) productService.viewProductById(pid);
		return viewProuctById;
	}
	
	//delete Product
	@DeleteMapping("del/{pid}")
	public void deleteProduct(@PathVariable long pid)
	{
		productService.deleteProduct(pid);
	}
	
	//update product
	
	@PutMapping("/update/{pid}")
	public Product updateProduct(@PathVariable long pid, @ RequestBody Product newproduct)
	{
	Product updateProduct=productService.updateProduct(pid,newproduct);
	
	return updateProduct;
		
		
		
	
	}
	
	
	
	
}
