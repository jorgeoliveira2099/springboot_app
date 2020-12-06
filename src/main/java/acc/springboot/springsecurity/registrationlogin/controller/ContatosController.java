package acc.springboot.springsecurity.registrationlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import acc.springboot.springsecurity.registrationlogin.model.Contato;
import acc.springboot.springsecurity.registrationlogin.repository.Contatos;

@Controller
@RequestMapping("/contatos")
public class ContatosController {
	
	@Autowired
	private Contatos contatos;
	
	@GetMapping
	public ModelAndView listar() {
		List<Contato> lista = contatos.findAll();
		
		ModelAndView modelAndView = new ModelAndView("contatos");		
		modelAndView.addObject("contatos", lista);
		
		return modelAndView;
	}
	
	@RequestMapping("/novo")
	public String showNewProductPage(Model model) {
		Contato contato = new Contato();
		model.addAttribute("contato", contato);
		
		return "novocontato";
	}
	
	@PostMapping
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("contato") Contato contato) {
		contatos.save(contato);
		
		return "redirect:/contatos";
	}
	
	
	@RequestMapping("edit/{id}")
	public ModelAndView editarContato(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("editar_contato");
		Contato contato = contatos.getOne((long) id);
		mav.addObject("contato", contato);
		
		return mav;
		//return "redirect:/contatos";
	}
	
	@RequestMapping("delete/{id}")
	public String removerContato(@PathVariable(name = "id") int id) {
		contatos.deleteById((long) id);
		return "redirect:/contatos";		
	}
	
}
