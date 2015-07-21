package com.syh.io.bytestream;

import java.io.FileOutputStream;

public class WriteByteStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("textw.txt");
			String outString = "写出数据:write123456";
			fos.write(outString.getBytes("utf-8"));
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
