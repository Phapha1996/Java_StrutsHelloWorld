package actionTest2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.User;

public class UserAction_2 extends ActionSupport implements ModelDriven<User>{

	public String execute(){
		return null;
	}
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
