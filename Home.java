package MVCFirst.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping ("/home")
	public String home()
	{
		System.out.println("Home Page Started");
		return "home";
	}
	
	@RequestMapping ("/contact")
	public String contact()
	{
		System.out.println("Contact Page Started");
		return "contact";
	}
	
	@RequestMapping ("/about")
	public String About()
	{
		System.out.println("About Us Page Started");
		return "about";
	}

}
