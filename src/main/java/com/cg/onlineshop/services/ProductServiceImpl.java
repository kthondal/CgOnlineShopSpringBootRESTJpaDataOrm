package com.cg.onlineshop.services;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlineshop.entities.Product;
import com.cg.onlineshop.exceptions.ProductDetailsNotFoundException;
import com.cg.onlineshop.repository.ProductRepoitory;
@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepoitory repository;

	@Override
	public Product acceptProductDetails(Product product) {
		return repository.save(product);
	}

	@Override
	public List<Product> getAllProductDetails() {
		return repository.findAll();
	}

	@Override
	public Product getProductDetails(int id) throws ProductDetailsNotFoundException {
		Optional<Product> optProduct = repository.findById(id);
		Supplier<ProductDetailsNotFoundException>exceptionSupplier = 
				() -> new ProductDetailsNotFoundException("Product Details Not found for product id  :- "+id );
				return optProduct.orElseThrow(exceptionSupplier);
	}

	@Override
	public void acceptBulkProductsDetails(List<Product> products) {
		repository.saveAll(products);
	}

	@Override
	public boolean removeProdcutDetails(int id) {
		 repository.deleteById(id);
		 return true;
	}

}
