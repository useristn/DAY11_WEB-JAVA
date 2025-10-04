package vn.iotstar.service;

import java.util.List;

import vn.iotstar.entity.Product;

public interface ProductService {
	void delete(Long id);
	Product get(Long id);
	Product save(Product product);
	List<Product> listAll();
}
