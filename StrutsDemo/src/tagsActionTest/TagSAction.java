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
		list.add("��һ��");
		list.add("�ڶ���");
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
*/		/*set = new HashSet();
		set.add("first");
		set.add("second");
		set.add("third");*/
	map = new HashMap<String,Object>();
	map.put("1", "��һ��");
	map.put("2", "�ڶ���");
	map.put("3", "������");
	map.put("4", "������");
	map.put("5", "������");
	}
	
	
	
	public String execute(){
		//this.addFieldError("myMessage", "����������δ֪���󣡣�");
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
