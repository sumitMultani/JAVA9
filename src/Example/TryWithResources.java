package Example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResources {

	public static void main(String[] args) throws FileNotFoundException {
		//A file output stream is an output stream for writing data to a File.
		FileOutputStream fileStream = new FileOutputStream("GainJavaKnowledge.txt");

		try (fileStream) {
			String message = "Welcome to Gain Java Knowledge.";
			// storing the result into a new byte array. 
			byte b[] = message.getBytes();
			//Writes b.length bytes from the specified byte array to this file output stream.
			fileStream.write(b);
			System.out.println("Done");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
