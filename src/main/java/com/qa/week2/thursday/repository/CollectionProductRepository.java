package com.qa.week2.thursday.repository;

import java.util.ArrayList;
import java.util.List;

import com.qa.week2.thursday.domain.Product;

public class CollectionProductRepository implements ProductRepository {
	
	private ArrayList<Product> products = new ArrayList<>();

	@Override
	public long create(Product product) {
		products.add(product);
		return product.getId();
	}

	@Override
	public List<Product> selectAll() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product findById(long id) {
		for (Product product : products) {
			if(product.getId() == id)
				return product;
		}
		return null;
	}

	@Override
	public List<Product> findByNameContaining(String partOfName) {
		List<Product> productList = new ArrayList<>();
		for (Product product : products) {
			if(product.getName().equals(partOfName)) {
				productList.add(product);
			}
		}
		return productList;
	}

	@Override
	public List<Product> findByRetailPriceLessThanEqual(double max) {
		List<Product> productList = new ArrayList<>();
		for (Product product : products) {
			if(product.getRetailPrice() <= max) {
				productList.add(product);
			}
		}
		return productList;
	}

	@Override
	public boolean update(Product product) {
		for (Product p : products) {
			if(p.getId() == product.getId()) {
				products.remove(product);
				products.add(product);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(Long id) {
		for (Product p : products) {
			if(p.getId() == id) {
				products.remove(p);
				return true;
			}
		}
		return false;
	}

}
