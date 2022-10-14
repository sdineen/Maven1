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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByRetailPriceLessThanEqual(double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
