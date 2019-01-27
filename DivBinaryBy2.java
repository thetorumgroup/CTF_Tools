import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DivBinaryBy2 {

	public static void main(String[] args) {
		try{
		  byte[] fileContent = Files.readAllBytes(Paths.get("./double"));
		  byte[] halfContent = new byte[fileContent.length];
		  
		  for (int i= 0; i < fileContent.length; i++){
			  halfContent[i] = (byte) ((byte) fileContent[i]/2);
		  }
		  
		  FileOutputStream half = new FileOutputStream("./half");
		  half.write(halfContent);
		  half.close();
		  
		}catch(Exception e){
			System.out.println("You shouldnt be here!");
		}
	}

}
