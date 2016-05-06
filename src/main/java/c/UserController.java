package c;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import d.SqlHelper;

@Controller
public class UserController {
	@RequestMapping(value="users/login.html")
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
	@RequestMapping(value="users/userManage.html")
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
