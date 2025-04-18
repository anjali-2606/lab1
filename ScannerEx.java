package test;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.print("enter a number:");
			int num=s.nextInt();
			System.out.println("the enter number is :"+num);		
		}
		catch(Exception e) {
			System.out.println("enter a valid number");
		}
		// TODO Auto-generated method stub

	}

}
