package com.neuedu.test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import com.alibaba.fastjson.JSON;

public class SuperClient {
	
	private static String _name = "";
	
	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localhost",6666);
			
			OutputStream out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			GetMessageThread gmt = new GetMessageThread(s);
			gmt.start();
			
			Scanner sc = new Scanner(System.in);
			
			while(true)
			{
				System.out.println("请输入消息类别,101登录，102发消息");
				int num = sc.nextInt();
				if(num == 101)
				{
					//登录
					System.out.println("请输入用户名");
					sc = new Scanner(System.in);
					String name = sc.nextLine();
					_name = name;
					Message m = new Message();
					m.setCode(101);
					m.setName(name);
					//obj -> json str
					String msg = JSON.toJSONString(m);
					dos.writeUTF(msg);
					dos.flush();
				}
				else if(num == 102)
				{
					//发消息
					System.out.println("请输入to谁");
					sc = new Scanner(System.in);
					String to = sc.nextLine();
					
					System.out.println("请输入消息内容");
					sc = new Scanner(System.in);
					String msg = sc.nextLine();
					
					Message m = new Message();
					m.setCode(102);
					m.setName(_name);
					m.setTo(to);
					m.setMessage(msg);
					
					//obj -> json str	
					String str = JSON.toJSONString(m); 
					System.out.println(str);
					dos.writeUTF(str);
					dos.flush();
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
