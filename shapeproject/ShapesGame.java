package shapeproject;

import java.util.Scanner;

public class ShapesGame {
	public Shapes pressButton() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 get circle or 2 get squre and 3 get Rectangle");
		int key = sc.nextInt();
		// it is defind globally
		double area;
		double  parimeter;
		switch(key) {

		case 1:
			System.out.println("Enter the radius of circle:");
			area = sc.nextInt();
			System.out.println("your get Area of circle :"+3.14*area*area);
			System.out.println(area);
			System.out.println("Enter the Paramete of circle: ");
			parimeter= sc.nextInt();
			System.out.println("your get Area of Paremeter :"+2*3.14*area);
			System.out.println(parimeter);
			Circle c = new Circle();
			return c;	
		case 2:

			System.out.println("Enter Area of squre");
			float squres = sc.nextFloat();

			System.out.println("\nArea ="+squres*squres +"sq.cm.");

			System.out.println("Enter perimeter of squre");
			parimeter = sc.nextFloat();
			parimeter = 4*squres;
			System.out.println("\n Perimeter = "+parimeter +"cm.");
			Squre sq = new Squre();
			return sq;
		case 3:
			System.out.println("Calculet and All Details Rectangle :");
			System.out.println("Enter the width");
			double width = sc.nextDouble();
			System.out.println("Enter the Hight");
			double hight = sc.nextDouble();
			area = width*hight;
			System.out.println("Your Rectangle Area is"+area+"sq.unit");

			System.out.println("Parimeter of Rectangle");
			System.out.println("Enter the width");
			width = sc.nextDouble();
			System.out.println("Enter the Hight");
			parimeter = sc.nextDouble();
			parimeter = 2*(width+hight);
			System.out.println("your parimeter  is:"+parimeter+"cm");
			Rectangle rectangle = new  Rectangle();
			return rectangle;

		default:
			System.out.println("invalid number");
			return pressButton();

		}
	}

}

