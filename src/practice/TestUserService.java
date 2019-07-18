package practice;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.Properties;


public class TestUserService 
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException, IOException
	{
//		String str="helloworld";
//		Class clazz=str.getClass();
//		Method m=clazz.getMethod("substring", int.class);
//		Object o=m.invoke(str,4);
//		System.out.println(o);
//		Class clazzs=source.getClass();
//		Class clazzt=target.getClass();
//		Field[] fields=clazzs.getDeclaredFields();
//		for(Field fs:fields)
//		{
//			String getter="get"+fs.getName().substring(0,1).toUpperCase()+fs.getName().substring(1);
//			String setter="set"+fs.getName().substring(0,1).toUpperCase()+fs.getName().substring(1);
//			Method ms=clazzs.getMethod(getter, null);
//			Object value=ms.invoke(source, null);
//			Method mt=clazzt.getMethod(setter, value.getClass());
//			mt.invoke(target, value);
//		}
		UserService service=new UserImp1();
		Properties p = new Properties();
		p.load(TestUserService.class.getResourceAsStream("conf.properties"));

		String imp = p.getProperty("UserServiceImp");
		Class clazz = Class.forName(imp);

		UserService userService = (UserService)clazz.newInstance();
		userService.addUser();

	}
}
class Student
{
	private String name;
	private Integer age;
	private Date birthday;
}

class Person
{
	private String name;
	private Integer age;
	private Date birthday;
}
interface UserService {
public void addUser();
}

class UserImp1 implements UserService{
public void addUser() {
System.out.println("add user by userimp1");
}}

class UserImp2 implements UserService{
public void addUser() {
System.out.println("add user by userimp2");
}}
