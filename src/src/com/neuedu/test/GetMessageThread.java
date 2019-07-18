package com.neuedu.test;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class GetMessageThread extends Thread{
	
	private Socket s;
	
	public GetMessageThread(Socket s)
	{
		this.s = s;
	}
	
	@Override
	public void run() {
		
		try {
			InputStream in = s.getInputStream();
			DataInputStream din = new DataInputStream(in);
			while(true)
			{
				System.out.println("来自客户端的消息："+din.readUTF());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
