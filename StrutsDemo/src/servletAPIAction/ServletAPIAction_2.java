package servletAPIAction;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.User;

public class ServletAPIAction_2 extends ActionSupport {
	User user;
	
	public String login(){
		Map<String,Object> session= ActionContext.getContext().getSession();
		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		Map<String,Object> context = ActionContext.getContext().getApplication();
		request.put("message","这是一条request带来的message");
		session.put("user", user);
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
