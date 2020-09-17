package package_0917;

import java.io.File;

public class TestOutputEmp {
	public static void main(String[] args) {
		File[] files = null;
		getFile(new File("src/../"), files);
	}

	public static void getFile(File file, File[] files) {
		File[] f = file.listFiles();
		if (f != null) {
			for (File ft : f) {
				if (ft.exists()) {
					if (ft.isFile()) {
						int lastIndexOf = ft.getName().lastIndexOf(".");
						String suffix = ft.getName().substring(lastIndexOf);
//						System.out.println(ft.getName());
//						System.out.println(suffix);
						if (suffix.equals(".obj")) {
//							System.out.println(ft.getName());

						}
					} else if (ft.isDirectory()) {
//						System.out.println(ft.getName());
						getFile(ft);
					}
				}
			}
		}
	}
}
