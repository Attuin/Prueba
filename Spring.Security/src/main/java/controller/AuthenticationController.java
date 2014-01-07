package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {

	@RequestMapping(value="/authentication", method = RequestMethod.GET)
	public String authentication(ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - authentication()");
 
		//Spring uses InternalResourceViewResolver and return back index.jsp
		return "authentication";
 
	}
	
}
