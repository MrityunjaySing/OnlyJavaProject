package facebook_project;

import java.util.Scanner;

public class UserDetails {
	private int user_Password=1234;
	private String user_Id;
	private String user_Name;
	private String user_Gender;
	private  int   user_Age;


	public UserDetails() {

	}
	UserDetails( String user_id,String userName,String user_Gender,int user_Age){
		this.user_Id = user_Id;
		this.user_Name = userName;
		this.user_Gender = user_Gender;
		this.user_Age = user_Age;

	}
	//	getter() method is uses  get/access/read
	//	here is using password fatching/maching by user input

	//	===========================here is provided user Id=======================================

	public String getuser_Id() {
		Scanner id = new Scanner(System.in);
		System.out.println("Enter the user password get the id");
		int pass = id.nextInt();
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			return user_Id;
		}
		else {
			System.out.println("validation is not sucess");
			return null;
		}
	}
	//	setter is used set/write/update are using
	public void setuser_Id(String user_Id) {
		Scanner id = new Scanner(System.in);
		System.out.println("Enter the user password any changes the id");
		int pass = id.nextInt();
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			this.user_Id=user_Id;
		}
		else {
			System.out.println("validation is not success");

		}
	}
	//	==============================here is provided user name ========================

	public String getuser_Name() {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the user password to get the user name");
		int pass = name.nextInt();
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			return user_Name;

		}
		else {
			System.out.println("validation is not success");
			return null;
		}
	}
	public void setuser_Name(String user_Name) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the user password any changes the user name");
		int pass = name.nextInt();
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			this.user_Name=user_Name;
		}
		else {
			System.out.println("validation is not success");

		}
	}
	//	=========================here is provided gender================================

	public String getuser_Gender() {
		Scanner gender = new Scanner(System.in);
		System.out.println("Enter the user password to get the gender ");
		int pass = gender.nextInt();
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			return user_Gender; 
		}
		else {
			System.out.println("validation is not success");
			return null;
		}
	}
	public void setuser_Gender(String user_Gender ) {
		Scanner gender = new Scanner(System.in);
		System.out.println("Enter the user password any changes the gender Male and Female");
		int pass = gender.nextInt();
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			this.user_Gender=user_Gender;
		}
		else {
			System.out.println("validation is not success");

		}
	}

	//	=================================here is provided Age===============================

	public int getuser_Age() {
		Scanner userage = new Scanner(System.in);
		System.out.println("Enter the user password get the Age");
		int pass = userage.nextInt();
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			return user_Age;
		}
		else {
			System.out.println("validation is not success");
			return 0;
		}
	}
	public void setuser_Age(int user_Age) {
		Scanner userage = new Scanner(System.in);
		System.out.println("Enter the user password any changes the Age");
		int pass = userage.nextInt();
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			this.user_Age=user_Age;
		}
		else {
			System.out.println("validation is not success");

		}
	}
}
