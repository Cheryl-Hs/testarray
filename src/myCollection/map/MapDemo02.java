package myCollection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
	public static void main(String[] args) {
		//分割字符串
		String[] arr = "this is a cat and that is a mice and where is the food ?".split(" ");
		//分拣存储
		Map<String, Letter> map = new HashMap<>();
		for(String key: arr) {
			System.out.println(key);
			//方法1：通过key
			//如果不存在，放入单词
			/*if(!map.containsKey(key)) {
				map.put(key, new Letter(key));
			} 
			//如果存在，计算次数
			Letter value = map.get(key);
			value.setCount(value.getCount() + 1);*/
			
			
			//方法2：通过value
			Letter value = map.get(key);
			if(value == null) {
				value = new Letter();
				map.put(key, value);
			}
			value.setCount(value.getCount() + 1);
			
		}
		
		
		//查看每个单词出现的次数
		for(String key: map.keySet()) {
			Letter value = map.get(key);
			System.out.println(key + "-->" + value.getCount());
		}
	}
}
