package domain;

public class User {
	private String username;
	private String password;
	private String nickname;

	public User(){
		super();
	}
	
	public User(UserDTO userdto){
		username = userdto.getUsername();
		password = userdto.getPassword();
		nickname = userdto.getNickname();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
