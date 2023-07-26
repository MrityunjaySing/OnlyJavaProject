package facebook_project;

import java.util.Scanner;

public class userDriver {

	public static void main(String[] args) {
		//UserDetails details =  new UserDetails( "M1234", "Qspider", "non", 30)
		boolean n =  true;
		facebook fc = new facebook("mrityunjaysingh898@gmail.com", "9971409023");
		while(n) {
			Scanner sc = new Scanner(System.in);
			System.out.println("press 1 to get Email update Email ");
			System.out.println("press 2 to get Mobile number update Mobile number");
			System.out.println("press 3 to get id or udate id");
			System.out.println("press 4 to get name or update name ");
			System.out.println("press 5 to get gender or update gender ");
			System.out.println("press 6 to get age or update age ");
			System.out.println("press 7  to exit ");
			int x = sc.nextInt();

			switch (x) {
			case 1: {

				System.out.println("=======================userEmail======================");
				System.out.println("user Email is:"+fc.getuser_Email());
				fc.setuser_Email("satyam@99gmail.com");
				System.out.println("Email Uptodate: " +fc.getuser_Email());
				break;
			}
			case 2:{
				System.out.println("========================userPhoneNumber=================");
				System.out.println("user phone number is:"+fc.getuser_phoneNumber());
				fc.setuser_phoneNumber("8448774560");
				System.out.println("phone Uptodate: "+fc.getuser_phoneNumber());
				break;
			}
			case 3:{
				System.out.println("=============================userId======================");
				System.out.println("User id is :"+fc.details.getuser_Id());
				fc.details.setuser_Id("H1234");
				System.out.println("user id Uptodate :"+fc.details.getuser_Id());	
				break;
			}
			case 4:{
				System.out.println("=========================UserName========================");
				System.out.println("User name is:"+fc.details.getuser_Name());
				fc.details.setuser_Name("Mrityunjay Singh");
				System.out.println("user Uptodate name :"+fc.details.getuser_Name());
				break;
			}
			case 5:{
				System.out.println("=========================UserGender========================");
				System.out.println("User name is:"+fc.details.getuser_Gender());
				fc.details.setuser_Gender("Male");
				System.out.println("User Gender Uptodate :"+fc.details.getuser_Gender());
				break;
			}
			case 6:{
				System.out.println("==========================UserAge========================");
				System.out.println(" User age is "+fc.details.getuser_Age()); 
				fc.details.setuser_Age(23);
				System.out.println("User Uptodate age:"+fc.details.getuser_Age());
				break;
			}
			case 7:{
				n=false;
				break;

			}
			default:{
				System.out.println("Enter the valid number");
			}
			}

		}
		System.out.println("user exit ");
	}
}
