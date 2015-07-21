package com.syh.io.charstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RAndWCharStream {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("ReadMe.txt");
			FileOutputStream fos = new FileOutputStream("ReadMe_new.txt");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			char input[] = new char[100];
			int l = 0;
			while((l = isr.read(input)) != -1){
				String inputString = new String(input, 0, l);				
				System.out.println(inputString);
				osw.write(input,0,l);
			}
			isr.close();
			fis.close();
			osw.close();
			fos.close();
			System.out.println("done");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}

}
