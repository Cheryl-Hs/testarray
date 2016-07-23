package myCollection;

/**
 * 自己实现一个ArrayList
 * @author Administrator
 *
 */
public class MyArrayList2 {
	private Object[] elementData;
	
	private int size;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public MyArrayList2() {
		this(10);
	}
	public MyArrayList2(int initialCapacity) {
		if(initialCapacity < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementData = new Object[initialCapacity];
	}
	
	public void add(Object obj) {
		//数组扩容和数据的拷贝
		if(size==elementData.length) {
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
//		for (int i = 0; i<elementData.length;i++) {
//			newArray[i] = elementData[i];
//		}
			elementData = newArray;
		}
		elementData[size] = obj;
		size++;
	}
	
	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}
	
	public void remove(int index){
		rangeCheck(index);
		//删除指定位置的对象
	    int numMoved = size - index - 1;
	    if (numMoved > 0) {
        	System.arraycopy(elementData, index+1, elementData, index,
	                             numMoved);
	    }
	       	elementData[--size] = null; // clear to let GC do its work
	}
	
	public void remove(Object obj) {
		for(int i = 0;i<size;i++) {
			if (obj.equals(elementData[i])) {   //底层调用的是equals方法而不是==
				remove(i);
			}
		}
	}
	
	public Object set(int index, Object obj) {
		rangeCheck(index);
		
		Object oldValue = elementData[index];
		elementData[index] = obj;
		return oldValue;
	}
	
	public void add(int index, Object obj) {
		rangeCheck(index);
		//数组扩容
		ensureCapacity();
		
		System.arraycopy(elementData, index, elementData, index+1, 
				size-index);
		elementData[index] = obj;
		size++;
	}
	
	private void ensureCapacity() {
		//数组扩容和数据的拷贝
		if(size==elementData.length) {
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
	}
	
	private void rangeCheck(int index) {
		if (index < 0 || index>=size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	
	public static void main(String[] args) {
		MyArrayList2 list = new MyArrayList2(3);
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("666");
		System.out.println(list.size);
		System.out.println(list.get(4));
	}
}
