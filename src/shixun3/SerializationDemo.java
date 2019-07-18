package shixun3;
import java.io.*;
public class SerializationDemo
{
	public static void main(String[] args)
	{
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("d:/io/customer.txt");
			oos=new ObjectOutputStream(fos);
			Customer c1=new Customer("Dingdang",10,"kangfu",200.0);
			Customer c2=new Customer("Kenan",7,"xiaolan",2000.0);
			System.out.println("对象序列化...");
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.flush();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fos!=null) {
					fos.close();}
				if(oos!=null) {
					oos.close();
				}
				}catch(IOException e) {
					e.printStackTrace();
				}
			getFxlh();
		}
	}
	private static void getFxlh() {
		ObjectInputStream ois = null;
		
			FileInputStream fis = null;
			try {
				fis = new FileInputStream("d:/io/customer.txt");
				ois = new ObjectInputStream(fis);
				
				System.out.println("对象反序列化...");
				Object c = null;
				while ((c = ois.readObject()) != null) {
					Customer c1 = (Customer) c;
					System.out.println(c1.age + " " + c1.name + " " + c1.password);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EOFException e) {
				// TODO Auto-generated catch block
				  System.err.println("读取完毕");  
			} 	
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
					try {
						if(ois !=null){
							ois.close();
						}
						if(fis !=null){
							fis.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}
		
}
class Customer implements Serializable {

	String name;
	int age;
	transient String password;
	//String password;
    // double money;
	double money;

	Customer(String name, int age, String password, double money) {
		this.name = name;
		this.age = age;
		this.password = password;
		this.money = money;
	}

	public String toString() {
		return "name=" + name + " age=" + age + " password=" + password
				+ " money=" + money;

	}

}


