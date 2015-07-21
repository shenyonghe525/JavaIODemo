package com.syh.io.randoomaccessfile;

import java.io.File;
import java.io.RandomAccessFile;

public class WriteFile extends Thread {

	private File mFile;
	private int mBlock;
	//每一块所含数据的大小
	private int L = 100;

	/**
	 * 
	 * @param file
	 * @param b
	 */
	public WriteFile(File file, int b) {
		this.mBlock = b;
		this.mFile = file;
	}

	public void run() {
		try {
			//可以从文件的任意位置开始读写
			RandomAccessFile raf = new RandomAccessFile(mFile, "rw");
			//将文件指针指向特定位置
			raf.seek(mBlock*L);
			//每一块即使没写满也会占L个长度（最后一个例外）总数 = (n-1)*l + n块的写入字节数
			//写入顺序是按照块的顺序写的
			raf.writeBytes("This is block"+mBlock+"\n");
			System.out.println(mBlock+":done");			
			raf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
