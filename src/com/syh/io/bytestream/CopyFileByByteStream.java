package com.syh.io.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileByByteStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("android.gif");
			FileOutputStream fos = new FileOutputStream("android_new.gif");
			byte tmp[] = new byte[1024];
			while (fis.read(tmp) != -1) {
				fos.write(tmp);
			}
			fis.close();
			fos.close();
			System.out.println("done of copy");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
