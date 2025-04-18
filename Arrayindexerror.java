package test;

public class Arrayindexerror {

	public static void main(String[] args) {
		try {
			int[] arr= {1,2,3,4};
			System.out.println(arr[5]);
		}
		catch(Exception e){
			System.out.println("array index out of bounds");
		}
		
		// TODO Auto-generated method stub

	}

}
