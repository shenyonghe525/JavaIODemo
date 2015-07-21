package com.syh.io.charstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
/**
 * 带缓冲的的字符流
 * @author shenyonghe
 *
 * 2015-7-21
 */
public class BufferedCharStream {

	public static void main(String[] args) {
		try {

			FileInputStream fis = new FileInputStream("ReadMe.txt");
			FileOutputStream fos = new FileOutputStream("ReadMe_new_buffer.txt");
			
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			
			BufferedReader br = new BufferedReader(isr);
//			BufferedWriter bw = new BufferedWriter(osw);//丢失换行符
			PrintWriter pw = new PrintWriter(fos,true);//保留换行符的数据输出,true自动强制输出流里面的数据，防止输出不完全
			
			String input;
			while((input = br.readLine()) != null){
				System.out.println(input);
//				bw.write(input);
				pw.println(input);
			}
//			pw.flush();//强制输出流里面的数据，防止输出不完全
			br.close();
//			bw.close();
			pw.close();
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
