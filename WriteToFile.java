package lab6;
import java.io.*;
import java.io.IOException;
public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("balki.txt");
			writer.write("Hwllo,this is a file handlling example in java !");
			writer.close();
			System.out.println("Successfully wrote to the file.");
			
		}
		catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
			
		}

	}

}
