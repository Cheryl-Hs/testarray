package sort.col;

import java.util.TreeMap;

/**
 * 提供了解耦方式：业务排序类
 * @author Administrator
 *
 */
public class TreeMapDemo02 {
	public static void main(String[] args) {
		Worker w1 = new Worker("垃圾回收员", 12000);
		Worker w2 = new Worker("农名工", 8000);
		Worker w3 = new Worker("程序员", 5000);
		
		TreeMap<Worker, String> employees = new TreeMap<>();
		employees.put(w1, "工大");
		employees.put(w2, "工大");
		employees.put(w3, "工大");
		
		System.out.println(employees.keySet());
	}
}
