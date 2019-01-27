import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DivHashBy2 {

	public static void main(String[] args) {
		try{
			byte[] bHash = hexStringToByteArray("2c351372b3b0b84719720efd8b7dafb4");
			byte[] bHashHalf = new byte[bHash.length];
			for (int i=0; i < bHash.length; i++) {
				bHashHalf[i] = (byte) ((byte) bHash[i]/2);
			}
	
			String output = bytesToHex(bHashHalf);
	
		  	System.out.println(output);
		}catch(Exception e){
			System.out.println("You shouldnt be here!");
		}
	}

	public static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
    	return data;
	}
	
	private final static char[] hexArray = "0123456789ABCDEF".toCharArray();
	public static String bytesToHex(byte[] bytes) {
	    char[] hexChars = new char[bytes.length * 2];
	    for ( int j = 0; j < bytes.length; j++ ) {
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}

}
