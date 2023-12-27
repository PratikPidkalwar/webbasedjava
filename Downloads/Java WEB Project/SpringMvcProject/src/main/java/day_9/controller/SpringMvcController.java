package day_9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMvcController {

	@RequestMapping("/showIndex")
	public String getIndexPage()
	{
		return "index";
	}
}
