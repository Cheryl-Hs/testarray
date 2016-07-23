package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections对容器的比较
 * 1、public static <T> void sort(List<T> list, Comparator<? super T> c)
 * 2、public static <T extends Comparable<? super T>> void sort(List<T> list)
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("a");
		list.add("abcd");
		
		Collections.sort(list, new StringComp());
		System.out.println(list);
		
		list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("a");
		list.add("abcd");
		Collections.sort(list);
		System.out.println(list);
	}
}
