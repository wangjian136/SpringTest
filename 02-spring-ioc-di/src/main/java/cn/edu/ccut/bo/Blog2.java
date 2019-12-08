package cn.edu.ccut.bo;

public class Blog2 {

	private User user;
	
	public Blog2() {
		// TODO Auto-generated constructor stub
	}

	public Blog2(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Blog2 [user=" + user + "]";
	}
	
	
}
