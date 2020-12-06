package acc.springboot.springsecurity.registrationlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import acc.springboot.springsecurity.registrationlogin.model.User;
import acc.springboot.springsecurity.registrationlogin.repository.UserRepository;


@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository user;
	
	@GetMapping
	public ModelAndView listar() {
	    List<User> lista =  user.findAll();
		
		ModelAndView modelAndView = new ModelAndView("users");		
		modelAndView.addObject("users", lista);
		
		return modelAndView;
	}
}
