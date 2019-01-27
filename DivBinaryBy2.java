import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DivBinaryBy2 {

	public static void main(String[] args) {
		try{
		  byte[] fileContent = Files.readAllBytes(Paths.get("./double"));
		  for (int i= 0; i < fileContent.length; i++){
			  fileContent[i] /= 2;
		  }
		  
		  FileOutputStream half = new FileOutputStream("./half");
		  half.write(fileContent);
		  half.close();
		  
		}catch(Exception e){
			System.out.println("You shouldnt be here!");
		}
	}

}
