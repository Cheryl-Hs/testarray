package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**时间对象和字符串转换
 * @author Administrator
 *
 */
public class TestDateFormat {
	public static void main(String[] args) {
		//format 时间转换为字符串
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss 属于本月的第w周");
		Date d = new Date(132434253L);
		String str = df.format(d);
		System.out.println(str);
		
		System.out.println("####################");
		
		//parse 字符串转换为时间
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String str2 = "1977-7-7";
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
