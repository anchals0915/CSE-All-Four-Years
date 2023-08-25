package IOStreams;
import java.io.*;
import javax.swing.*;

public class FileHandling {
	public static void main(String[] args) {
		String filename = JOptionPane.showInputDialog("Enter File name :");
		filename = ""+ filename;
		File f = new File(filename);
		System.out.println("File exists : "+ f.exists() );
		System.out.println("File is readable : " + f.canRead());
		System.out.println("File is writable : " + f.canWrite());
		System.out.println("Is a directory : " + f.isDirectory());
		System.out.println("Length of file : " + f.length());
		try
		{
			char ch;
			StringBuffer buff =new StringBuffer();
			FileInputStream fis  = new FileInputStream(filename);
			while(fis.available()!=0)
			{
				ch = (char)fis.read();
				buff.append(ch);
			}
			System.out.print("Contents of file are : ");
			System.out.print(buff);
		}catch(FileNotFoundException e)
		{
			System.out.print("File not Found .");
		}
		catch(IOException e)
		{
			System.out.print("Cannot read file");
		}		
	}
}
