
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.InputMismatchException;
public class file {

	public static void main(String[] args) throws IOException {
    File f=new File("C:\\Users\\Vips\\Desktop\\vipul.txt");
    
    FileReader in=null;
    try {
    	in=new FileReader(f);
      int ch;

      while((ch=in.read())>=0) {
		   System.out.print((char)ch);

	   }

    }catch(InputMismatchException e) {
    	 System.out.println("Invalid Input");
    }finally{
    	 if(in!=null)
 	   in.close();
    }
    }
}
