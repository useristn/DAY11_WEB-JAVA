package vn.iotstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.iotstar.entity.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}