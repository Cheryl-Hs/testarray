package collection_others.properties;

import java.io.IOException;
import java.util.Properties;

/**
 * 使用类相对路径读取配置文件
 * bin
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		//类相对路径的   /表示bin
		//pro.load(Demo04.class.getResourceAsStream("/collection_others/properties/db.properties"));;// "/"表示bin目录
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("collection_others/properties/db.properties"));   //""表示bin目录
		System.out.println(pro.getProperty("user", "test")); 
	}
}
