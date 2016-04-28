package c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {

	@RequestMapping(value="index.html")
	public void index(Model model){
		model.addAttribute("test","Hello Ocean!");
		System.out.println("index.jsp");
	}
}
