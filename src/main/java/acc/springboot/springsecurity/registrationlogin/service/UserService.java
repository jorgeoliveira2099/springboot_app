package acc.springboot.springsecurity.registrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import acc.springboot.springsecurity.registrationlogin.model.User;
import acc.springboot.springsecurity.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	
    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}

