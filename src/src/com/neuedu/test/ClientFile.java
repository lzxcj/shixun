package com.neuedu.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Socket s = new Socket("localhost",8888);
			
			OutputStream out = s.getOutputStream();
			InputStream in = s.getInputStream();
			//DataOutputStream dout = new DataOutputStream(out);
			//DataInputStream din = new DataInputStream(in);
			
			FileOutputStream fos = new FileOutputStream("d:/demo.rar");
			
			byte[] buffer = new byte[1024];
			
			int len = in.read(buffer);
			while(len!=-1)
			{
				fos.write(buffer, 0, len);
				len = in.read(buffer);
			}
			
			fos.flush();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
