package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppFiWrBufWr {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

		String path = "c:\\temp\\out.txt";
		
		try (FileWriter fw = new FileWriter(path, true) ; BufferedWriter bw = new BufferedWriter(fw)) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}			
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
