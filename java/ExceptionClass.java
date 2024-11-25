import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionClass {
     public void writeToFile(String text) throws IOException{
    	 PrintWriter out=new PrintWriter(new FileWriter("output-file.txt"));
    	 out.println(text);
    	 
    	 out.close();
     }
     public void readFromFile() throws FileNotFoundException,IOException
     {
    	 BufferedReader br=new BufferedReader(new FileReader("output-file.txt"));
     }
     public static void main(String[] args) throws IOException {
    	 ExceptionClass ec=new ExceptionClass();
		String[] arr= {"hello", "welcome", "thankyou"};
		try {
		for(int i=0;i<=2; i++)
		{
			ec.writeToFile(arr[i]);
		}
	}
		catch (IOException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
}
}