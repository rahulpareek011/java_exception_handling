package excep_hand;
import java.io.*;

public class Excep2 {

	public static void main(String[] args) throws IOException {
		File f = new File("Myfolder");
		f.mkdir();
		
		FileWriter fw = new FileWriter("Myfolder/myfile.txt",true);
		fw.write("java by Prasoon");
		System.out.println("Data written.........");
		FileReader fr = new FileReader("Myfolder/myfile.txt")
				BufferedReader br = new BufferedReader(filereader);
				String content = br.readLine();
				System.out.println(content);
				filereader.close();
				br.close()


		fw.close();

	}

}
