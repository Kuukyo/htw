import java.io.*;

public class test {
	 public static void main(String[] args) throws IOException {
		 	simplereadwrite();
		 	advanced_reading();
	    }
	 
	 
	 public static void simplereadwrite() throws IOException {
		 OutputStream os = new FileOutputStream("test.txt");
		 	os.write("Test".getBytes());
		 	os.close();
		 	InputStream is = new FileInputStream("test.txt");
		 	int text = is.read();
		 	System.out.println(text);
	 }
	 
	 
	 public static void advanced_reading() throws IOException {
		 InputStream is = new FileInputStream("test2.txt");
		 InputStreamReader isr = new InputStreamReader(is);
		 BufferedReader br = new BufferedReader(isr);
		 String line = br.readLine();
		 while (line != null) {
			 System.out.println(line);
			 line = br.readLine();
		 }		 
	 }
}
