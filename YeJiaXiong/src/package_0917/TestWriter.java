package package_0917;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriter {
	public static void main(String[] args) throws IOException{
		File file = new File("./A.txt");
		file.createNewFile();
		Writer writer = new FileWriter(file);
		String str = "0917ÏÂÎç×÷Òµ";
		writer.write(str);
		writer.close();
		
	}
}
