package iTCbackoffice1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

	@Autowired
	private LoginPage loginpage;
	
	@PostMapping("/login")
	public LoginPage loginPageMethos(@RequestBody LoginPage loginpage)
	
	{
		
		 return loginpage;
		 
		 
	}
	
}
