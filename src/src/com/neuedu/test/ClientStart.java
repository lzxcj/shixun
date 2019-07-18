package com.neuedu.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Socket s = new Socket("localhost",8888);
			
			GetMessageThread gmt = new GetMessageThread(s);
			gmt.start();
			
			OutputStream out = s.getOutputStream();
			
			DataOutputStream dout = new DataOutputStream(out);
					
			while(true)
			{			
				//send
				String msg = sc.nextLine();
				dout.writeUTF(msg);
			}
						
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
