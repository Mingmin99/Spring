package kr.ac.kopo.form;

public class MemberVO {

	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public MemberVO() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MemberVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	private String password;
}
