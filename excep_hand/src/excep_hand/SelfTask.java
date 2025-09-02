package excep_hand;
import java.io.*;

public class SelfTask {

	public static void main(String[] args) throws IOException{
		File f1 = new File("TaskFolder");
		Boolean FolderStatus = f1.mkdir();
		System.out.println("FolderStatus: "+FolderStatus);
		System.out.println("Folder Created");
		
		File f2 = new File(f1,"taskFile.txt");
		Boolean FileStatus = f2.createNewFile();
		System.out.println("FileStatus: "+FileStatus);
		System.out.println("File Created");
		
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("my task first line");
		bw.newLine();
		bw.write("my task second line");
		bw.close();
		System.out.println("Text written in file");
		
		FileReader fr = new FileReader(f2);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		System.out.println("text read successfully from file to console");
	}

}
