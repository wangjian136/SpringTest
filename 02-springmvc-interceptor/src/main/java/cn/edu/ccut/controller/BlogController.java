package cn.edu.ccut.controller;
 
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/blog")
public class BlogController {
 
 
	@RequestMapping("/test")
	public String test1(HttpServletRequest request){
	    request.setAttribute("username","����");
	    request.setAttribute("password","��ĳĳ");
	    System.out.println("����controller����");
	    return "/index";
	}
}