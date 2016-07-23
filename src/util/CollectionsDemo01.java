package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1、binarySearch(List<? extends Comparable<? super T>> list, T key)  容器有序
 * 2、sort(List<?> list)
 *   sort(List<?> list, Comparator<? super T> c)
 * 3、reverse(List<?> list)
 * 4、shuffle(List<?> list)  洗牌
 * 5、swap(List<?> list, int i, int j)
 * 
 * @author Administrator
 *
 */
public class CollectionsDemo01 {
	
	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		//shuffle 洗牌 模拟斗地主
		for(int i = 0;i<54;i++) {
			cards.add(i);
		}
		//洗牌
		Collections.shuffle(cards);
		//一次发牌
		List<Integer> p1 = new ArrayList<>();
		List<Integer> p2 = new ArrayList<>();
		List<Integer> p3 = new ArrayList<>();
		List<Integer> last = new ArrayList<>();
		
		for(int i = 0;i<51;i+=3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
		}
		//最后三张为底牌
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));
		
		System.out.println("第一个人：" + p1);
		System.out.println("第二个人：" + p2);
		System.out.println("第三个人：" + p3);
		System.out.println("底牌为：" + last);
		
	}
	//反转
	public static void test() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("反转之后：" + list);
	}
}
