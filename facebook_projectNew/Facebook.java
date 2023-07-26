package facebook_project;

import java.util.Scanner;

public class Facebook {
	private User u=new User();
	Facebook()
	{
		
	}
	Facebook(User u)
	{
		this.u=u;
	}
	public void accessProfile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the user Id: ");
		String x=sc.nextLine();
		System.out.println("Enter Password: ");
		int y=sc.nextInt();
		if(u.getUid().equals(x) && u.getPwd()==y)
		{
			System.out.println("Profile access granted");
			showDetails();
			System.out.println("Write setting to access to chane any details");
			sc.nextLine();
			String se=sc.nextLine();
			if(se.equals("setting") || se.equals("Setting"))
			{
				System.out.println("You have chosen setting");
				setting();
			}
			
		}
		else
		{
			System.out.println("profile Access Denied!!");
		}
	}
	private void showDetails()
	{
		System.out.println("Name is: "+u.getName());
		System.out.println("Age is: "+u.getAge());
		System.out.println("Gender is: "+u.getGender());
	}
	private void setting()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to change name 2 to change Age");
		System.out.println("3 to change gender and 4 to change password");
		int x=sc.nextInt();
		switch(x)
		{
		case 1:
			System.out.println("ENter the new name: ");
			sc.nextLine();
			u.setName(sc.nextLine());
			System.out.println("Updated details are below: ");
			showDetails();
			break;
		case 2:
			System.out.println("ENter the new Age: ");
			u.setAge(sc.nextInt());
			System.out.println("Updated details are below: ");
			showDetails();
			break;
		case 3:
			System.out.println("ENter the new gender: ");
			sc.nextLine();
			u.setGender(sc.nextLine());
			System.out.println("Updated details are below: ");
			showDetails();
			break;
		case 4:
			System.out.println("ENter the old password: ");
			int p=sc.nextInt();
			if(u.getPwd()==p)
			{
				System.out.println("ENter the new password: ");
				u.setPwd(sc.nextInt());
				System.out.println("Please Login with the new details: ");
				accessProfile();
			}
			else
			{
				System.out.println("Your old password is Invalid");
			}
			break;
			
		}
	}
}
