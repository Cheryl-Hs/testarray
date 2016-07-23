package myCollection;

import java.util.HashMap;

/**
 * 自定义自己的hashSet
 * @author Administrator
 *
 */
public class MyHashSet {
	HashMap map;
	private static final Object PRESENT = new Object();
	
	public MyHashSet() {
		map = new HashMap();
	}
	public int size() {
		return map.size();
	}
	
	public void add(Object obj) {
		map.put(obj, PRESENT);  //Set的不可重复就是利用了map里面键对象的不可重复！
	}
	
	public static void main(String[] args) {
		MyHashSet s = new MyHashSet();
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
		
	}


}
