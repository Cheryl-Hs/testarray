package sort;

import java.util.Comparator;
import java.util.List;

/**
 * 排序（降序）
 * @author Administrator
 *
 */
public class Utils {
	
	
	/**
	 * 容器排序（使用泛型方法）+ Comparator
	 * @param arr
	 */
	public static <T> void sort(List<T> list,Comparator<T> com) {
		//第一步：转成数组
		Object[] arr = list.toArray();
		sort(arr, com);
		//第二步：改变容器中对应的值
		for(int i = 0; i<arr.length; i++) {
			list.set(i, (T)arr[i]);
		}
	}
	

	/**
	 * 数组的排序（降序） + Comparator接口
	 * @param arr
	 */
	public static <T> void sort(Object[] arr, Comparator<T> com) {
		int len = arr.length;
		boolean sorted = true;
		for(int i = 0; i<len-1; i++) {  //趟数
			sorted = true; //假定有序
			for(int j = 0; j<len-1-i/*减少趟数*/; j++) {  //次数
				if(com.compare((T)arr[j], (T)arr[j+1]) < 0) {
					Object temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = false;  //假定失败
				}
								
			}

			if(sorted) {
				break;
			}
		}
	}
	
	
	/**
	 * 容器排序（使用泛型方法）
	 * @param arr
	 */
	public static <T extends Comparable<T>> void sort(List<T> list) {
		//第一步：转成数组
		Object[] arr = list.toArray();
		sort(arr);
		//第二步：改变容器中对应的值
		for(int i = 0; i<arr.length; i++) {
			list.set(i, (T)arr[i]);
		}
	}
	/**
	 * 数组排序（使用泛型方法）
	 * @param arr
	 */
	public static <T extends Comparable<T>> void sort(T[] arr) {
		int len = arr.length;
		boolean sorted = true;
		for(int i = 0; i<len-1; i++) {  //趟数
			sorted = true; //假定有序
			for(int j = 0; j<len-1-i/*减少趟数*/; j++) {  //次数
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = false;  //假定失败
				}
								
			}

			if(sorted) {
				break;
			}
		}
	}
	/**
	 * 数组的排序
	 * @param arr
	 */
	public static void sort(Object[] arr) {
		int len = arr.length;
		boolean sorted = true;
		for(int i = 0; i<len-1; i++) {  //趟数
			sorted = true; //假定有序
			for(int j = 0; j<len-1-i/*减少趟数*/; j++) {  //次数
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0) {
					Object temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = false;  //假定失败
				}
								
			}

			if(sorted) {
				break;
			}
		}
	}
}
