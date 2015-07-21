package com.syh.io.randoomaccessfile;

import java.io.File;
import java.io.RandomAccessFile;

public class MultiWriteFile {

	static File file = new File("random.txt");

	public static void main(String[] args) {
//		if (file.exists()) {
//			file.delete();
//		}
		// new WriteFile(file, 1).start();
		// new WriteFile(file, 2).start();
		// new WriteFile(file, 3).start();
		// new WriteFile(file, 4).start();
		// new WriteFile(file, 5).start();

		try {
			//适合多线程传输的数据
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			//第4块的数据
			raf.seek(300);
			byte bytes[] = new byte[20];
			raf.read(bytes);
			String in = new String(bytes);
			System.out.println(in);
			
			raf.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
