package myCollection.map;

/**
 * 自定义实现Map的功能
 * 暂不完美
 * Map：存放键值对，根据键对象找对应的值对象，键不能重复！
 * @author Administrator
 *
 */
public class MyMap01 {
	
	MyEntry[] arr = new MyEntry[990];
	int size;
	
	public void put(Object key, Object value) {
		MyEntry e = new MyEntry(key, value);
		//解决键值重复的处理
		for(int i = 0; i<size;i++) {
			if(arr[i].key.equals(key)) {
				arr[i].value = value;
				return;
			}
		}
		
		arr[size++] = e;
	}
	
	public Object get(Object key) {
		for(int i = 0; i<size;i++) {
			if(arr[i].key.equals(key)) {
				return arr[i].value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key) {
		for(int i = 0; i<size;i++) {
			if(arr[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value) {
		for(int i = 0; i<size;i++) {
			if(arr[i].value.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		MyMap01 m = new MyMap01();
		m.put("黄爽", new Friend("段艳会"));
		m.put("张玉敏", new Friend("谢婷婷"));
		m.put("黄爽", new Friend("严柯"));
		Friend f = (Friend) m.get("黄爽");
		System.out.println(f.name);
	}
	
}

class MyEntry {
	Object key;
	Object value;
	
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}


class Friend{
	String name;

	public Friend(String name) {
		super();
		this.name = name;
	}
	
}
