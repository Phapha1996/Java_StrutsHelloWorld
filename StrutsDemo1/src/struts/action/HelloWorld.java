package struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport{
	private static final String MESSAGE = "Hello I am Struts2!";
	private String message;
	public String execute() throws Exception{
		//����WEB��ҵ���߼�
		setMessage(MESSAGE);
		return "success";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
