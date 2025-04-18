package test;

public class Nullpointer {

	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println("null itself is a keyword");
		}
		// TODO Auto-generated method stub

	}

}
