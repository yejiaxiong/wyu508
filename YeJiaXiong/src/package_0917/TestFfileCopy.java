package package_0917;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件流，实现文件复制
 */
public class TestFfileCopy {
	public static void main(String[] args) throws IOException {
		File f = new File("./myfile.txt");
		System.out.println(f.createNewFile());
		copyFile("./myfile.txt", "./myfile_copy.txt");
	}

	public static void copyFile(String src, String dst) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		byte[] buffer = new byte[1024];
		int temp = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dst);
			while ((temp = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, temp);
			}
		} catch (Exception e) {

		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				System.out.println("出错了");
			}

		}
	}
}