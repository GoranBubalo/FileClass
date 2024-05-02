import java.io.File;

public class Main {

	public static void main(String[] args) {

		// file = An abstract representation of file and directory pathnames
		// pathnames can be absolute or relative 

		File file = new File("secret_message.txt");

		if (file.exists()) {
			System.out.println(" That file exist");
			//getPath() method - > what ever is listed in the constructor of the File class
			System.out.println(file.getPath());
			//Shows the location of the file , full file path
			System.out.println(file.getAbsolutePath());
			//boolean value, checks if the file is a file 
			System.out.println(file.isFile());
			//deletes the file, needs too be refreshed 
			file.delete();
		}else {
			System.out.println("the file does not exist");
		}

	}

}
