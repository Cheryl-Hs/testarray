package collection_others.properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * 使用Properties输出到文件
 * 资源配置文件：优点：可以动态切换数据库  不需要改代码
 * 
 * 1、.properties
 * store(OutputStream out, String comments)
 * store(Writer wirter, String comments)
 * 2、.xml
 * storeToXML(OutputStream os, String comment):UTF-8字符集
 * storeToXML((OutputStream os, String comment, String encoding)
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//创建对象
		Properties pro = new Properties();
		//存储
		pro.setProperty("drive", "oracle.jdbc.driver.OravleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		try {
			//存储到f:/myTest  绝对路径  盘符：
//			pro.store(new FileOutputStream(new File("f:/myTest/db.properties")), "db配置");
//			pro.storeToXML(new FileOutputStream(new File("f:/myTest/db.xml")), "db配置");
			//使用相对路径  当前的工程
//			pro.store(new FileOutputStream(new File("db.properties")), "db配置");
//			pro.store(new FileOutputStream(new File("src/db.properties")), "db配置");
			pro.store(new FileOutputStream(new File("src/collection_others/properties/db.properties")), "db配置");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
