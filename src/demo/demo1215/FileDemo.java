package demo.demo1215;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
		}
//		Path filePath = Paths.get("test.txt");
//		List<String> text = Files.readAllLines(filePath);
//		System.out.println(text);
//		File mewFile = Files.getFile  
//		FileInputStream fileInputStream = new FileInputStream(file);
//		int code;
//		while ((code=fileInputStream.read())!=-1) {
//			System.out.println((char)code);
//		}
//		fileInputStream.close();
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(97);
		fos.close();

//		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//		int result = 0;
//		while ((result = br.read()) != -1) {
//			System.out.println((char)result);
//		}
//		br.close();

//		Writer out = ;
//		BufferedWriter bWriter = new BufferedWriter(out );
	}

}
