package facebook_project;

public class User {
	private String name;
	private int age;
	private String gender;
	private String uid;
	private int pwd;
	User()
	{
		
	}
	User(String name, int age, String gender, String uid, int pwd) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.uid = uid;
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
}
