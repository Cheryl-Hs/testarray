package myCollection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
	public static void main(String[] args) {
		//分割字符串
		String[] arr = "this is a cat and that is a mice and where is the food ?".split(" ");
		//分拣存储
		Map<String, Integer> map = new HashMap<>();
		for(String key: arr) {
			//方法1：通过key
			System.out.println(key);
			/*if(!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				map.put(key, map.get(key)+1);
			}*/
			
			
			//方法2：通过value
			Integer value = map.get(key);
			if(value == null) {
				map.put(key, 1);
			}else {
				map.put(key, value + 1);
			}
		}
		
		
		//查看每个单词出现的次数
		Set<String> keySet = map.keySet();
		//方法1
		for(String key: keySet) {
			System.out.println(key + "-->" + map.get(key));
		}
		
		System.out.println("-------------------------------");
		
		//方法2：迭代器
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "-->" + value);
		}
	}
}
