package sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 */
public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list = new ArrayList<>();
		list.add(new Goods("老马的视频", 100, 1000));
		list.add(new Goods("老高的视频", 50, 3000));
		list.add(new Goods("老高的视频", 1000, 2000));
		
		System.out.println("排序前：" + list);
		
//		Collections.sort(list, new GoodsPriceComp());
		Collections.sort(list, new GoodsFavComp());
		System.out.println("排序后：" + list);
	}
}
