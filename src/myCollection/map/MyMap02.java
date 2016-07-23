package myCollection.map;

import java.util.LinkedList;

/**
 * 自定义Map的升级版：
 * 1.提高查询的效率，避免像MyMap一样循环遍历
 * @author Administrator
 *
 */
public class MyMap02 {
	//Map的底层结构：数组+链表
	LinkedList[] arr = new LinkedList[999];//链表数组
	int size;
	
	public void put(Object key, Object value) {
		MyEntry e = new MyEntry(key,value);
		
		//hash负数控制
		int hash = key.hashCode();
		hash = hash<0?-hash:hash;
		
		int a = hash%arr.length;
		if(arr[a] == null) {
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		} else {
			LinkedList list = arr[a];
			for(int i = 0; i<list.size();i++) {
				MyEntry e2 = (MyEntry) list.get(i);
				if(e2.key.equals(key)) {
					e2.value = value; //键重复，直接覆盖
					return;
				}
			}
			arr[a].add(e);
		}
	}
	
	public Object get(Object key) {
		int a = key.hashCode()%arr.length;
		if(arr[a] != null) {
			LinkedList list = arr[a];
			for(int i = 0; i<list.size();i++) {
				MyEntry e = (MyEntry) list.get(i);
				if(e.key.equals(key)) {
					return e.value;
				}
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		MyMap02 m = new MyMap02();
		m.put("黄爽", new Friend("段艳会"));
		m.put("张玉敏", new Friend("谢婷婷"));
		m.put("黄爽", new Friend("严柯"));
		Friend f = (Friend) m.get("黄爽");
		System.out.println(f.name);
	}
}
