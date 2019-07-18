import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class essay 
{
	public static void main(String[] args) throws IOException
	{
		try 
		{
			File f=new File("d:/io/caiji.doc");
			if(f.exists()==false)
			{
				f.createNewFile();
				FileWriter fw=new FileWriter(f);
				fw.write("”¢”Ôaaaaaa");
				fw.close();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
