package shapeproject;

import java.util.Scanner;

public class KidDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x;
		ShapesGame a = new ShapesGame();
		do {
		Shapes s = a.pressButton();
		s.FindArea();
		s.FindParimeter();
		System.out.println("do you want to change the shape");
		System.out.println("Press Y/y to change ");
		x=sc.next().charAt(0);
		}while(x=='Y'||x=='y');
		sc.close();
	}
}
