package facebook_project;

import java.util.Scanner;

public class facebook {
 private int user_Password=1234;
	private String user_Email;
	private String phone_Number;
	UserDetails details =  new UserDetails( "M1234", "Qspider", "non", 30);
	facebook(){
		
	}
	facebook(String user_Email, String phone_Number){
		this.user_Email = user_Email;
		this.phone_Number = phone_Number;
	}
//	========================here is get the email============================
	public String getuser_Email() {
		Scanner email = new Scanner(System.in);
		System.out.println("Enter the user password get the email");
		int pass = email.nextInt();
	
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			return user_Email;
		}
		else {
			System.out.println("validation is not sucess");
			return null;
		}
	}
//	 ==========================here is set email =====================
	public void setuser_Email(String user_Email) {
		Scanner email = new Scanner(System.in);
		System.out.println("Enter the user password any update the email");
		int pass = email.nextInt();
	
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			this.user_Email = user_Email;
		}
		else {
			System.out.println("validation is not sucess");
		}
	}
//	==============================here is get phoneNumber====================================
	public String getuser_phoneNumber() {
		Scanner phoneNumber = new Scanner(System.in);
		System.out.println("Enter the user password get the phone number");
		int pass = phoneNumber.nextInt();
	
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			return phone_Number;
		}
		else {
			System.out.println("validation is not sucess");
			return null;
		}
	}
//	========================here is set PhoneNumber==============================
	public void setuser_phoneNumber(String phone_Number) {
		Scanner phoneNumber = new Scanner(System.in);
		System.out.println("Enter the user password update the phone number");
		int pass = phoneNumber.nextInt();
	
		if(user_Password == pass) {
			System.out.println("validation is sucessfully");
			this.phone_Number = phone_Number;
		}
		else {
			System.out.println("validation is not sucess");
		}
	}
}
