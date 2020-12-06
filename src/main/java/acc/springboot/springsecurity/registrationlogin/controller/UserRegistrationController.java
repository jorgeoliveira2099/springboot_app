package acc.springboot.springsecurity.registrationlogin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import acc.springboot.springsecurity.registrationlogin.model.User;
import acc.springboot.springsecurity.registrationlogin.service.UserService;
import acc.springboot.springsecurity.registrationlogin.web.dto.*;

@Controller

@RequestMapping("/registration")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(Model model) {
        return "registration";
    }
    
    @PostMapping()
    //@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto, BindingResult result){

        User existing = userService.findByEmail(userDto.getEmail());
        
        
        if (existing != null){
            result.rejectValue("email", null, "There is already an account registered with that email");
        }

    //    if (result.hasErrors()){
      //  	System.out.println("Entrou aqui, com erros");
        //    return "registration";
        //}
        System.out.println("Entrou aqui, sem erros");
        
        
        
        userService.save(userDto);
        return "redirect:/registration?success";
    }

}

