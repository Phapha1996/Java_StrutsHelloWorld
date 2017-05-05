package tagsActionTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

import domain.User;

public class TagSAction extends ActionSupport{
//	private String username;
//	private String password;
//	private User user;
//	private List list;
//	private Set set;
	private Map<String,Object> map;
	
public TagSAction(){
/*		list = new LinkedList();
		list.add("第一名");
		list.add("第二名");
		list.add("第三名");
		list.add("第四名");
		list.add("第五名");
		list.add("第六名");
		list.add("第七名");
*/		/*set = new HashSet();
		set.add("first");
		set.add("second");
		set.add("third");*/
	map = new HashMap<String,Object>();
	map.put("1", "第一名");
	map.put("2", "第二名");
	map.put("3", "第三名");
	map.put("4", "第四名");
	map.put("5", "第五名");
	}
	
	
	
	public String execute(){
		//this.addFieldError("myMessage", "服务器出现未知错误！！");
		return SUCCESS;
	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//



	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}


/*
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}*/
	
	
	
}
