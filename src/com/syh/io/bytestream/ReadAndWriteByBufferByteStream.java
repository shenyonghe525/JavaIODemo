package com.syh.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * 带有缓冲的字节输入输出流的操作
 * @author shenyonghe
 * 调整缓冲流的大小和每次读写字符数组的大小可以使读写速度提升。
 * 2015-7-21
 */
public class ReadAndWriteByBufferByteStream {

	public static void main(String[] args) {
        try {
        	//设置缓冲流的大小（要大于每次读写的大小）
			FileInputStream fis = new FileInputStream("movie.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis,100000);
			
			FileOutputStream fos = new FileOutputStream("movie_new.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos,100000);
			//byte数组大小（大型文件越大小的越小效率越高）
			byte input[] = new byte[20000];
			int count = 0;
			long before = System.currentTimeMillis();
			while(bis.read(input) != -1){
				bos.write(input);
				count++;
			}
			bis.close();
			fis.close();
			bos.close();
			fos.close();
			System.out.println((System.currentTimeMillis()-before)+"ms");
			System.out.println("共读取了:"+count+"次");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
        
	}

}
