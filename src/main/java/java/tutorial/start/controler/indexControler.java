package java.tutorial.start.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class indexControler {
	
	
	@RequestMapping("/index")
	public String index (){
		
		return "/WEB-INF/jsp/index.jsp";
	}
	

}
