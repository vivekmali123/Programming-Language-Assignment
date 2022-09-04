package Assignment_15;

// Q.9. Write a program to read data from properties file.


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class q9 {

	private final Properties configProp = new Properties();

	private q9()
	{
		//Private constructor to restrict new instances
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("application.properties");
		System.out.println("Reading all properties from the file");
		try {
			configProp.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Bill Pugh Solution for singleton pattern
	private static class LazyHolder
	{
		private static final q9 INSTANCE = new q9();
	}

	public static q9 getInstance()
	{
		return LazyHolder.INSTANCE;
	}

	public String getProperty(String key){
		return configProp.getProperty(key);
	}

	public Set<String> getAllPropertyNames(){
		return configProp.stringPropertyNames();
	}

	public boolean containsKey(String key){
		return configProp.containsKey(key);
	}

	public static void main(String[] args)
	{
		//Get individual properties

			System.out.println(q9.getInstance().getProperty("firstName"));
			System.out.println(q9.getInstance().getProperty("lastName"));

			//All property names
		try {
			System.out.println(q9.getInstance().getAllPropertyNames());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
