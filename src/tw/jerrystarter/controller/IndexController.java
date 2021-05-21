package tw.jerrystarter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping
	public String toLoginPage() {
		return "login";
	}
	
	@GetMapping
	public String toAdminPage() {
		return "admin-index";
	}
	
	@GetMapping
	public String toShopPage() {
		return "shop";
	}
	
	
}
