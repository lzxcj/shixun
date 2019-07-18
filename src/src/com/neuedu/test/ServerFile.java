package com.neuedu.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerFile {

	public static void main(String[] args) {
		//1. open a listenning port
		try {
			
		   Scanner sc = new Scanner(System.in);
			
		   ServerSocket ss = new ServerSocket(8888);
		   //2. accept connection from client
		   Socket s = ss.accept(); //s stands for temporary port for communication
		   //3. give input and out stream
		   OutputStream out = s.getOutputStream();
		   InputStream in = s.getInputStream();
		   //4. wrap stream into reader/writer
		   //DataOutputStream dout = new DataOutputStream(out);
		   //DataInputStream din = new DataInputStream(in);
		  
		   //send file
		   FileInputStream fis = new FileInputStream("e:/demo.rar");
		   
		   byte[] buffer = new byte[1024];
		   
		   int len = fis.read(buffer);
		   while(len!=-1)
		   {
			   out.write(buffer, 0, len);
			   len = fis.read(buffer);
		   }
		   
		   out.flush();
		   out.close();
		   

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
