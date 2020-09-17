package package_0917;

import java.io.File;

public class TestFileList{
	public static void main(String[] args) {
		File f = new File("../YeJiaXiong");
		read(f, 0);
	}
	public static void read(File file,int depth) {
		File[] f = file.listFiles();
		if(f != null) {
			for(File ft:f) {
				if(ft.exists()) {
					if(ft.isFile()) {
						for(int i=0;i<depth;i++) {
							System.out.print('-');
						}
						System.out.println(ft.getName());
					}else if(ft.isDirectory()) {
						System.out.println(ft.getName());
						read(ft,++depth);
					}
				}
			}
		}
	}
}
