package servletAPIAction;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

import domain.User;

public class ServletAPIAction_1 extends ActionSupport implements ServletRequestAware{
	private User user;
	private HttpServletRequest request;
	
	
	//��ע��ķ�ʽ���servletAPI
	public String login(){
		
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		session.setAttribute("user", user);
		return "success";
	}
	
	
	//IOCע��
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
}
