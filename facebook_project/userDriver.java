package facebook_project;

public class userDriver {

	public static void main(String[] args) {
		//UserDetails details =  new UserDetails( "M1234", "Qspider", "non", 30)
		facebook fc = new facebook("mrityunjaysingh898@gmail.com", "9971409023");
		System.out.println("=======================userEmail========================");
		System.out.println("user Email is:"+fc.getuser_Email());
		fc.setuser_Email("satyam@99gmail.com");
		System.out.println("Email Uptodate: " +fc.getuser_Email());

		System.out.println("========================userPhoneNumber=================");
		System.out.println("user phone number is:"+fc.getuser_phoneNumber());
		fc.setuser_phoneNumber("8448774560");
		System.out.println("phone Uptodate: "+fc.getuser_phoneNumber());

		System.out.println("=============================userId======================");
		System.out.println("User id is :"+fc.details.getuser_Id());
		fc.details.setuser_Id("H1234");
		System.out.println("user id Uptodate :"+fc.details.getuser_Id());	

		System.out.println("=========================UserName========================");
		System.out.println("User name is:"+fc.details.getuser_Name());
		fc.details.setuser_Name("Mrityunjay Singh");
		System.out.println("user Uptodate name :"+fc.details.getuser_Name());

		System.out.println("=========================UserGender========================");
		System.out.println("User name is:"+fc.details.getuser_Gender());
		fc.details.setuser_Gender("Male");
		System.out.println("User Gender Uptodate :"+fc.details.getuser_Gender());

		System.out.println("==========================UserAge========================");
		System.out.println(" User age is "+fc.details.getuser_Age()); 
		fc.details.setuser_Age(23);
		System.out.println("User Uptodate age:"+fc.details.getuser_Age());

	}


}
