package cn.edu.ccut.controller;
 
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/blog")
public class BlogController {
 
 
	@RequestMapping("/test")
	public String test1(HttpServletRequest request){
	    request.setAttribute("username","垃圾");
	    request.setAttribute("password","李某某");
	    System.out.println("我是controller方法");
	    return "/index";
	}
}