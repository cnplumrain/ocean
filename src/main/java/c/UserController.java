package c;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import d.SqlHelper;
import m.User;

@Controller
public class UserController {
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView registerP( @ModelAttribute User user ,HttpServletRequest request,HttpServletResponse response){
		
		System.out.println(user);

		if(user.UserName!=null){
			System.out.println(user.UserName);

		}
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<script>alert('注册成功!')</script>");
		ModelAndView mv = new ModelAndView("/user/register");
		mv.addObject("user",11);
		return mv;
	}

	@RequestMapping(value="user/register")
	public void register(Model model){
		User user = new User();
		System.out.println(user.UserName);
		model.addAttribute("user", user);
	}
	@RequestMapping(value="user/login")
	public void login(Model model){
		String sql = "select * from Users";
		List list = null;
		try {
			 list = SqlHelper.query(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("users",list);
	}
	@RequestMapping(value="user/userManage")
	public void UserManage(Model model){
		String sql = "select * from Users";
		List list = null;
		try {
			 list = SqlHelper.query(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("users",list);
	}

	
}
