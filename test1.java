package test;

public class test1 {

	private static final int MYdouble = 0;

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		int a=5;
		float b=21.2F;
		char c='S';
		String d="bye";
		int e=4;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(a>e);
		System.out.println(a<e);
		System.out.println(a&e);
		System.out.println(a|e);
		System.out.println(a^e);
		
		if(a>e) {
			System.out.println("A is greater");
		}
		else {
			System.out.println("A is less than E");
		}
		if(a%2==0) {
			System.out.println("A is even");
		}
		else {
			System.out.println("A is odd");
		}
		System.out.println("Size of integer is :");
		System.out.println(Integer.SIZE);
		System.out.println("Size of long is:");
		System.out.println(Long.SIZE);
		
		System.out.println(Character.SIZE);
		
		int MyInt=10;
		double myDouble=MyInt;
		System.out.println(MyInt);
		System.out.println(myDouble);
		
		double MYDouble=9.2;
		int MYint=(int)MYdouble;
		System.out.println(MYdouble);
		System.out.println(MYint);
		
		int a1=82;
		int b1=83;
		char c1=(char)a1;
		char c2=(char)b1;
		System.out.println(c1);
		System.out.println(c2);
		
		char ch1='R';
		char ch2='S';
		
		int a11=(int)ch1;
		int a2=(int)ch2;
		
		System.out.println(a11);
		System.out.println(a2);
		
		int myA;
		myA=10;
		System.out.println(myA);
		myA=20;
		System.out.println(myA);
		
		
		// TODO Auto-generated method stub

	}

}
