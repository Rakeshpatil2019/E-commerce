package com.example.demo3.payload;

import java.util.List;

import com.example.demo3.entity.Product;

public class ProductResponse {

	private List<Product> content;
	
	private int pageNumber;
	private int pageSize;
	private int totalPages;
	private int lastPage;
	public List<Product> getContent() {
		return content;
	}
	public void setContent(List<Product> content) {
		this.content = content;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getLastPage() {
		return lastPage;
	}
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	
	
	
	
}
