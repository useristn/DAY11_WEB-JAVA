package vn.iotstar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.iotstar.entity.Product;
import vn.iotstar.repository.ProductRepository;
import vn.iotstar.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Product get(Long id) {
        Optional<Product> product = repo.findById(id);
        return product.orElse(null);
    }

    @Override
    public Product save(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> listAll() {
        return repo.findAll();
    }
}
