import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileinput {
	public static void main(String[] args) {
		String fileName = "a_example.in";
		String line = null;
		int lineCount = 0;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =  new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
          
            
            String firstLine = new String();
            firstLine = bufferedReader.readLine(); 	//reading first line
            System.out.println("first line: " + firstLine);
            String i = firstLine.substring(0,1);
            System.out.println(i +"ioj");
            
            while((line = bufferedReader.readLine()) != null) {
            	
            	
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	}
}
