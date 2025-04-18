package test;

public class Parameter {
	String name;
	int rollno;
	
	Parameter(int r,String n){
		name=n;
		rollno=r;
	}

	public static void main(String[] args) {
		 Parameter obj = new  Parameter(32,"Shivam");
		System.out.println("The name is :"+obj.name);
		System.out.println("Roll no is :"+obj.rollno);
		
		// TODO Auto-generated method stub

	}

}
