import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args)
	{
		File inFile = new File("resource/Text.txt");
		File outFile = new File("resource/Out.txt");		
		
		try{
		FileReader read = new FileReader(inFile);
		FileWriter write = new FileWriter(outFile);
		
		Scanner in = new Scanner(new BufferedReader(read));
		
		PrintWriter out = new PrintWriter(new BufferedWriter(write));
		
		String temp = in.next();
		while(!temp.startsWith("exit"))
		{
			System.out.println(temp);
			out.println(temp);
			temp = in.next();	
		}
		in.close();
		out.close();
		}
		catch (FileNotFoundException e) 
		{  
			e.printStackTrace();
		}
		catch(IOException x)
		{
			x.printStackTrace();
		}
		
	}
}
