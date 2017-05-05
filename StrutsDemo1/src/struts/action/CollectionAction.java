package struts.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.User;

public class CollectionAction extends ActionSupport{
	private List<User> strs;
	private Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
	
	public List<User> getStrs() {
		return strs;
	}

	public void setStrs(List<User> strs) {
		this.strs = strs;
	}

	public String execute(){
		User user  =  (User) request.get("user");
		
		/*for(User str:strs){
			System.out.println(str.getUsername()+str.getPassword());
		}*/
		return "success";
	}
	
}
