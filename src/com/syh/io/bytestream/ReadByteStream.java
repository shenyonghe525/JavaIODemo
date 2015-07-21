package com.syh.io.bytestream;

import java.io.FileInputStream;

public class ReadByteStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("text.txt");
			byte[] input = new byte[1024];
			fis.read(input);
			String inpString = new String(input, "utf-8");
			System.out.println(inpString);
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
