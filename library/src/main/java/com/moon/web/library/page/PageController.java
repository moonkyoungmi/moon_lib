package com.moon.web.library.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	// 메인 페이지
	@GetMapping("/") 
	public String home() { 
		return "main/index";
	}
}
