package com.cg.onlineshop.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.onlineshop.entities.Product;
import com.cg.onlineshop.services.ProductService;

@RestController
public class ProductController {
	
		@Autowired
		private ProductService productService;

		@GetMapping("/hello")
		public ResponseEntity<String>  seyHello(){
			ResponseEntity<String> responseEntity = new ResponseEntity<>("Hello To All Welcome to Restfull Servives",HttpStatus.OK);
			return responseEntity;	
		}
		/*
		@PostMapping(value =  "/addProduct", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
		public ResponseEntity<Product> acceptProductDetails(@ModelAttribute Product product){
			product = productService.acceptProductDetails(product);
			return new ResponseEntity<Product>(product,HttpStatus.CREATED);
		}*/
		
		@PostMapping(value =  "/addProduct")
		public ResponseEntity<Product> acceptProductDetails(@RequestBody Product product){
			product = productService.acceptProductDetails(product);
			return new ResponseEntity<Product>(product,HttpStatus.CREATED);
		}
}