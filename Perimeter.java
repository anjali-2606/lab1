package test;
import java.util.Scanner;

public class Perimeter {
	double perimeter;
	Perimeter(double r)
	{
		perimeter=2*3.14*r;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the radius:");
		double rad = s.nextDouble();
		Perimeter p = new Perimeter(rad);
		System.out.println("the perimeter is :"+ p.perimeter);
		
		// TODO Auto-generated method stub
	}
}


