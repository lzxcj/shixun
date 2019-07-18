package shixun2;

import java.io.File;
import java.io.IOException;



public class ThrowTest 
{
	public void createFile(String path) throws IOException{
		File f= new File(path);
		try{
			f.createNewFile();
		}catch(IOException ie){
			ie.printStackTrace();
			throw ie;    //ты╢невЁЖ
		}

	}
	public static void main(String[] args){
		ThrowTest  tt = new ThrowTest();
		try{
			tt.createFile("c:/abc.txt");
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
