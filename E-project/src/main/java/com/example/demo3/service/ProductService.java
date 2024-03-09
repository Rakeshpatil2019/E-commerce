package com.example.demo3.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo3.entity.Product;
import com.example.demo3.payload.ProductDto;
import com.example.demo3.payload.ProductResponse;
import com.example.demo3.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product createProduct(Product product)
	{
		
		Product save=productRepository.save(product);
		
		return save;
	}
	
	
	public List<Product>viewAll()
	{
//		Sort sort=null;
//
//		if(sortDir.trim().toLowerCase().equals("asc"))
//		{
//			sort =Sort.by(sortBy).ascending();
//			System.out.println(sort);
//		}
//		else
//		{
//			sort=Sort.by(sortBy).descending();
//		}
//		
//		Pageable pageable=PageRequest.of(pageNumber, pageSize,sort);
//		 Page<Product> page= this.productRepository.findAll(pageable);
//		   List<Product> pageProduct=page.getContent();
//		  List<Product> product=pageProduct.stream().filter(p->p.isLive()).collect(Collectors.toList());
//          
		//  List<ProductDto> productDto=product.stream().map(p->this.toDto(p)).collect(Collectors.toList());
		  
	
		 
		 
		  
		//ProductDto to Product
		List<Product> findAll=productRepository.findAll();
		return findAll;
	}
	
	
	
	private Object toDto(Product p) {
		// TODO Auto-generated method stub
		return null;
	}


	public Product viewProductById(long pid)
	{
	    Product findbyid=productRepository.findById(pid);
		return findbyid;
	}
	
	public void deleteProduct(long pid)
	{
		productRepository.deleteById(pid);
		
	}
	
	public Product updateProduct(long pid,Product newproduct)
	{
		Product oldproduct=productRepository.findById(pid);
		
		oldproduct.setPname(newproduct.getPname());
		oldproduct.setPprice(newproduct.getPprice());
		oldproduct.setPquantity(newproduct.getPquantity());
	    Product save= productRepository.save(oldproduct);
		return save
				;
	}
	
	
	
	
	
	
	
}
