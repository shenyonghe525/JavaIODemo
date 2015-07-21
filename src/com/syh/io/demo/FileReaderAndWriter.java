package com.syh.io.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 读取文本数据特别方便
 * 
 * @author shenyonghe
 * 
 *         2015-7-21
 */
public class FileReaderAndWriter {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader("ReadMe.txt");
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter("ReadMe_newfile.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			String line;

			while ((line = br.readLine()) != null) {
				bw.write(line + "\n");
			}

			System.out.println("done");
			bw.close();
			fw.close();
			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
