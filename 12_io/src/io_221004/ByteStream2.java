package io_221004;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt"); //파일 객체 생성
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		
		int size = (int)file.length(); //파일 크기
		byte[] b = new byte[size]; //배열 생성
		
		bis.read(b, 0, size);
		System.out.println(new String(b));		//byte[] -> String 변환
		
		bis.close();
	}

}
