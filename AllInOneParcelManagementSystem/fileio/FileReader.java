package fileio;

import java.io.*;
import java.util.*;
import java.lang.*;

public class FileReader{

	public void readFile(String location){

		try{
			File file = new File(location);
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()){
				System.out.print(sc.nextLine());
			}
			System.out.println(" ");
		}

		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}