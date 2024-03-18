package com.example.firstweb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstweb.bean.User;
import com.example.firstweb.repository.UserRepository;
import com.example.firstweb.service.SecurityService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class MainController {

	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private UserRepository userRepository;
		
	@Autowired
	private PasswordEncoder encoder;
	
	@GetMapping({"/login"})
	public String login() {
		return "login";
		}
	
	@GetMapping({"/home"})
	public String home() {
		return "home";
		}
	
	

	
	@GetMapping({"/searchpage"})
	public String searchpage() {
		return "searchpage";
		}
	
	
	@GetMapping({"/searchWithKeyWord"})
	public String searchWithKeyWord() {
		return "searchWithKeyWord";
		}
	
	@GetMapping({"/searchWithId"})
	public String searchWithId() {
		return "searchWithId";
		}
	
	
	@GetMapping({"/searchWithEmail"})
	public String searchWithEmail() {
		return "searchWithEmail";
		}
	
	
	@GetMapping({"/searchWithFirstName"})
	public String searchWithFirstName() {
		return "searchWithFirstName";
		}
	
	@GetMapping({"/searchWithLastName"})
	public String searchWithLastName() {
		return "searchWithLastName";
		}
	
	@GetMapping({"/searchWithMobile"})
	public String searchWithMobile() {
		return "searchWithMobile";
		}
	
	
	
//	@GetMapping({"/logout"})
//	public String logoutt() {
//		return "/registration";
//		}
//	
//	@PostMapping({"/logout"})
//	public String logout() {
//		return "/registration";
//		}
	
	@PostMapping("/login")
	public String longinresponse(String email, String password,HttpServletRequest request, HttpServletResponse response) {
		boolean loginResponse = securityService.longin(email, password,request, response);

		if(loginResponse) {
			return "home";
		}
		return "login";
		
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
		}
	
	@GetMapping("/registration")
	public String registration() {
		return "registration";
		}
	
	@PostMapping("/registration")
	public String register(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
		return "login";
		}
	
	@GetMapping("/videolist")
	public String videolist() {
		return "videolist";
		}
	
	
	@GetMapping({"/contact"})
	public String contact() {
		return "contact";
		}
	
	@GetMapping({"/help"})
	public String help() {
		return "help";
		}
	
	@GetMapping({"/aboutUs"})
	public String about() {
		return "aboutUs";
		}
	
	@GetMapping("/gallery_2")
	public String gallery_2() {
		return "/gallery_2";
		}
	
	@GetMapping("/photo_gallary")
	public String photo_gallary() {
		return "photo_gallary";
		}
//    @GetMapping("/index")
//    public String add(Model model) {
//    	List<User> listuser = securityService.save(user);
//        model.addAttribute("user", new User());
//        return "index";
//    }
}
