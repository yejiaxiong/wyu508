package package_0917;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class TestInputEmp {
	public static void main(String[] args) throws IOException {
		File file;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String fname = str.split(",")[0];
		file = new File("./" + fname + ".obj");
		file.createNewFile();
		Writer writer = new FileWriter(file);
		writer.write(str);
		writer.close();
	}
}
