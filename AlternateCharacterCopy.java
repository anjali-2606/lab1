package lab6;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class AlternateCharacterCopy {

	public static void main(String[] args) {
 try {
	 FileReader reader=new FileReader("balki.txt");
	 FileWriter writer=new FileWriter("anjali.txt");
	 int character;
	 int index=0;
	 while((character=reader.read())!=-1) {
		 if(index%2==0) {
			 writer.write(character);
			 System.out.println("Alternate characters copied sucessfully!");

			
		 }
		 index++;
	 }
	reader.close();
	writer.close();
 }
	 
	 catch(IOException e){
		 System.out.println("An error occurred"+e.getMessage());
		 e.printStackTrace();
	 }
	 
 }

	}

