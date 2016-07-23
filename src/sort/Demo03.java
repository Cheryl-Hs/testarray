package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) {
		//字符串比较
		String[] arr = {"abc","def","aaa","abcd"};
		Utils.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("----------------日期比较-----------------------");
		
		Date[] arr2 = new Date[3];
		arr2[0] = new Date();
		arr2[1] = new Date(System.currentTimeMillis() - 1000*60*60);
		arr2[2] = new Date(System.currentTimeMillis() + 1000*60*60);
		Utils.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("-------------容器比较+ Comparable----------------");
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("aaa");
		list.add("abcd");
		
		Utils.sort(list);
		System.out.println(list);
		
		System.out.println("-----------使用Comparator排序数组----------------");
		arr = new String[]{"a","abcd","abc","def"};
		Utils.sort(arr, new StringComp());
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-----------------List排序 使用比较器Comparator-----------------");
		
		list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("aaa");
		list.add("abcd");
		
		Utils.sort(list, new StringComp());
		System.out.println(list);
	}
		
}
