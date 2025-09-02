package excep_hand;
import java.io.*;

public class Demo {

	public static void main(String[] args) throws IOException{
		File f1 = new File("file.txt");
		
		// Now read content back using BufferedReader
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine())!= null) {
        	System.out.println(line);
        }
        br.close();
	}

}
