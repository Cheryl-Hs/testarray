package sort.col;

import java.util.Collections;
import java.util.TreeSet;

/**
 * 实体类实现Comparable接口的应用
 * @author Administrator
 *
 */
public class TreeSetDemo02 {

	public static void main(String[] args) {
		Worker w1 = new Worker("垃圾回收员", 12000);
		Worker w2 = new Worker("农名工", 8000);
		Worker w3 = new Worker("程序员", 5000);
		
		TreeSet<Worker> employees = new TreeSet<>();
		employees.add(w1);
		employees.add(w2);
		employees.add(w3);
		
		System.out.println(employees);
		
		
	}

}
