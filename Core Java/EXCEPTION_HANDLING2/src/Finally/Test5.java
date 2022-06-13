package Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//why finally is used for closing the file or connection

public class Test5 {
	
	public static void main(String[] args)  {
		
		FileInputStream fis = null;
		
		try
		{
			fis  = new FileInputStream("d:/abc.txt");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe);
		}
		finally
		{
			//cleanup code
			if(fis!=null)
			{
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("File closed");
		}
	}
}

