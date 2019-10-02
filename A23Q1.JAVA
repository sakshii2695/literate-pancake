import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
import java.io.BufferedReader;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;+
import java.io.InputStream;
class BufferedWriterDemo{
	private static final String FILENAME= "filename.txt ";
	public static  void main(String[] args) throws Exception
	{
		int spaces = 0, vowels = 0, letters = 0;
		BufferedWriter bw = null;
		 FileWriter fw = null;
		
		try{
				String text = "To be or not to be, that is the question \n whether this nobler in the mind to suffer \n the slings and arrows of outrageous fortune, \n r to take arms against a sea of troubles,\n and by opposing end them?";
				
				fw = new FileWriter(FILENAME);
			    bw = new BufferedWriter(fw);
				
				bw.write(text);
				for(int i=0;i<text.length();i++)
				{
					char ch=text.charAt(i);
					if(ch==' ')
						spaces++;
					else if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))
					{
						letters++;
						if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' ||ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'O')
						vowels++;
					}
				}
			
				System.out.println("The text contained vowels: " + vowels + "\n" + "consonants " + (letters - vowels) + "\n"+ "spaces: " + spaces);
				
				
				
				System.out.println("Done");
		
			
		}

				
		 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
					if( bw != null)
						bw.close();
					if (fw != null)
						fw.close();
			}
				catch(IOException ex){

						ex.printStackTrace();
				}					
		}
	}
}


class BufferedReaderDemo
{
	public static  void main(String[] args) throws Exception{
		String thisline =null;
		try{
		BufferedReader brr = new BufferedReader(new FileReader("filename.txt"));
		while((thisline = brr.readLine()) != null)
		{
		System.out.println(thisline);
		}
		
	}catch(Exception e){

		e.printStackTrace();
	}		
}
}
