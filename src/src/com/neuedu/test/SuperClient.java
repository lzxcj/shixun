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
				System.out.println("��������Ϣ���,101��¼��102����Ϣ");
				int num = sc.nextInt();
				if(num == 101)
				{
					//��¼
					System.out.println("�������û���");
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
					//����Ϣ
					System.out.println("������to˭");
					sc = new Scanner(System.in);
					String to = sc.nextLine();
					
					System.out.println("��������Ϣ����");
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
