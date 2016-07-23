package sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import sort.Utils;

/**
 * 使用Collections
 * @author Administrator
 *
 */
public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<>();
		news.add(new NewsItem("中国最棒", 1000, new Date()));
		news.add(new NewsItem("小日本滚蛋", 600, new Date(System.currentTimeMillis() - 1000*60*60)));
		news.add(new NewsItem("美国第二", 500, new Date(System.currentTimeMillis() - 1000*60*60)));
		System.out.println("排序前：" + news);
		
		//排序
		Collections.sort(news);
		Utils.sort(news);//降序
		System.out.println("排序后： " + news);
		
		
	}
}
