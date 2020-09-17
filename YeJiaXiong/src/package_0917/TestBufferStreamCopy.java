package package_0917;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferStreamCopy {
	public static void main(String[] args) throws IOException {
		File f = new File("./myfile.txt");
		System.out.println(f.createNewFile());
		copyFile("./myfile.txt", "./myfile_copy2.txt");
	}

	public static void copyFile(String src, String dst) {

		File fileIN = new File(src);
		File fileOUT = new File(dst);
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			FileInputStream fis = new FileInputStream(fileIN);
			FileOutputStream fos = new FileOutputStream(fileOUT);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			byte[] b = new byte[1024];
			int len;
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
				bos.flush();
			}

		} catch (IOException e) {
			System.out.println("出错了");
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (Exception e) {
				System.out.println("出错了");
			}
		}
	}
}
