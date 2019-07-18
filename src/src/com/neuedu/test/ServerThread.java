package com.neuedu.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.alibaba.fastjson.JSON;

public class ServerThread extends Thread{
	
	private Socket s;

	public void setS(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		
		try {
			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			while(true)
			{
				String message = dis.readUTF();
				System.out.println("来自客户端的消息："+message);
				//str-> object
				Message m = JSON.parseObject(message, Message.class);
				if(m.getCode()== 101)
				{
					//login
					SuperServer.users.put(m.getName(), s);
				}
				else if(m.getCode() == 102)
				{
					//send message to someone
					String to = m.getTo();
					String name = m.getName();
					String msg = m.getMessage();
					
					Socket targetperson = SuperServer.users.get(to);
					if(targetperson!=null)
					{
						OutputStream out = targetperson.getOutputStream();
						DataOutputStream dos = new DataOutputStream(out);
						dos.writeUTF("来自"+name+"的消息:"+msg);
						dos.flush();
					}			
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
