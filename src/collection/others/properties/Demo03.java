package collection.others.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties读取配置文件
 * 资源配置文件：
 * 使用相对于绝对路径读取
 * load(InputStream inStream)
 * load(Reader reader)
 * loadFromXML(InputStream in)
 * 
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		Properties pro = new Properties();
		//读取
		try {
			//读取  绝对路径 
			pro.load(new FileReader("f:/myTest/db.properties"));
			//读取  相对路径
			pro.load(new FileReader("src/collection_others/properties/db.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(pro.getProperty("user", "test"));
	}
}
