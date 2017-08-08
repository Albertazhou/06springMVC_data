package can.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import can.vo.User;

@Controller
public class contro {
	public contro() {
		// TODO Auto-generated constructor stub
		System.out.println("contro");
	}
	@RequestMapping("/hello")
	/*
	 * @RequestParam("uname") uname是提交的域的名称
	 */
	public String hello(@RequestParam("uname")String name,ModelMap m) {
		m.addAttribute("name", name);
		System.out.println(name);
		return "index.jsp";
	}
	
	@RequestMapping("/user")
	public String user(User user) {
		System.out.println(user);
		return "index.jsp";
	}

}
