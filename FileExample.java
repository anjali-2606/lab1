package lab6;
import java.io.*;
import java.io.IOException;
public class FileExample {

	public static void main(String[] args) {
		File file=new File("Balki.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File created:"+file.getName());
			}
			else {
				System.out.println("File already exists");
			}
		}
			catch(IOException e) {
				System.out.println("An error occurred");
				e.printStackTrace();
			}
		File file2=new File("anjali.txt");
		try {
			if(file2.createNewFile()) {
				System.out.println("File created:"+file2.getName());
			}
			else {
				System.out.println("File already exists");
			}
		}
			catch(IOException e) {
				System.out.println("An error occurred");
				e.printStackTrace();
			}
		}

	}


