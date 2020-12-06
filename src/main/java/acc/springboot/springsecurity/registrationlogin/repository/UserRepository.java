package acc.springboot.springsecurity.registrationlogin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import acc.springboot.springsecurity.registrationlogin.model.User;
import acc.springboot.springsecurity.registrationlogin.web.dto.UserRegistrationDto;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findAll();
	User findByEmail(String email);
	User save(UserRegistrationDto registration);
}

