package acc.springboot.springsecurity.registrationlogin.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import acc.springboot.springsecurity.registrationlogin.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

