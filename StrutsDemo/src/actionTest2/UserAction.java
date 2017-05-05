package actionTest2;

import com.opensymphony.xwork2.ActionSupport;

import domain.User;
import domain.UserDTO;

public class UserAction extends ActionSupport {

	private UserDTO userdto;
	
	public UserDTO getUserdto() {
		return userdto;
	}


	public void setUserdto(UserDTO userdto) {
		this.userdto = userdto;
	}


	public String execute(){
		if(!userdto.getUsername().equals("admin")||userdto.getUsername()==null){
			this.addFieldError("name", "Äã²¢²»ÊÇadmin");
			return "success";
		}
		this.addFieldError("name", "»¶Ó­admin");
//		User user = new User(userdto);
//		
//		System.out.println(user.getUsername());
//		System.out.println(user.getPassword());
//		System.out.println(user.getNickname());
		return "success";
	}

}
