package struts.action;

import com.opensymphony.xwork2.ActionSupport;

import domain.User;



public class Login extends ActionSupport {
	
//	private String username;
//	private String password;
//	
//	
//	public String getUsername() {
//		return username;
//	}
//
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public String execute() throws Exception{
		
		System.out.println(user.getUsername()+"\n"+user.getPassword());
		return "success";
	}
	
	
	
}
