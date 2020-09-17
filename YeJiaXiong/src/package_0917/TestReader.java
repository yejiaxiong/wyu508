package package_0917;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReader {
	public static void main(String[] args) throws IOException {
		File file = new File("./A.txt");
		Reader reader = new FileReader(file);
		char []c = new char[(int)file.length()];
		int len = reader.read(c);
		reader.close();
		System.out.println(new String(c,0,len));
	}
}
