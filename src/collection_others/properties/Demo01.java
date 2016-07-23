package collection_others.properties;

import java.util.Properties;

/**
 * Properties 资源配置文件的读写
 * 1、key 与value 只能为字符串
 * 2、存储与读取
 * setProperty(String key, String value)
 * getProperty(String key, String defaultValue)
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//创建对象
		Properties pro = new Properties();
		//存储
		pro.setProperty("drive", "oracle.jdbc.driver.OravleDriver");
		//pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		//获取
		String url = pro.getProperty("url", "test");
		
		System.out.println(url);
		
		
	}
}
