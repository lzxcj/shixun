package com.neuedu.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerStart {

	public static void main(String[] args) {
		//1. open a listenning port
		try {
			
		   Scanner sc = new Scanner(System.in);
			
		   ServerSocket ss = new ServerSocket(8888);
		   //2. accept connection from client
		   Socket s = ss.accept(); //s stands for temporary port for communication
		   
		   //3. startup thread for getting message
		   GetMessageThread gmt = new GetMessageThread(s);
		   gmt.start();
		   
		   //3. give input and out stream
		   OutputStream out = s.getOutputStream();
		
		   //4. wrap stream into reader/writer
		   DataOutputStream dout = new DataOutputStream(out);
		 
		   while(true)
		   {
			   String msg = sc.nextLine();
			   //send
			   dout.writeUTF(msg);			  
		   }

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
