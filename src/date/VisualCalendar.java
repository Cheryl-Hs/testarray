package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author Administrator
 *
 */
public class VisualCalendar {
	public static void main(String[] args) {
		//输入日期
		System.out.print("请输入日期(按照格式2016-6-22): ");
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		//设置日期的格式
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//将字符串时间转换成时间格式
			Date date = format.parse(temp);
			//将时间设置成日历格式
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			
			//将输入的时间日期保存到day中
			int day = calendar.get(Calendar.DATE);

			//将此时间的日历格式的日期设置为1
			calendar.set(Calendar.DATE, 1);
			
			//获取此日期中的月的最大天数
			int maxDate = calendar.getActualMaximum(Calendar.DATE);
			
			System.out.println("日\t一\t二\t三\t四\t五\t六\t");
			
			//将此月的一号是周几的前面打印成空格
			for (int i = 1; i<calendar.get(Calendar.DAY_OF_WEEK);i++) {
				System.out.print('\t');
			}
			//打印此月的日历
			for (int i = 1; i<=maxDate; i++) {
				//如果是日期是时间的当日，则输出一个*
				if (i == day) {
					System.out.print('*');
				}
				System.out.print(i + "\t");
				//获取日期在此月中是星期几
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				//如果是周六就换行
				if (w == Calendar.SATURDAY) {
					System.out.println();
				}
				
				//将日期加1
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		


	}
}
