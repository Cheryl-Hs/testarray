package myCollection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 问题：定义一个Student类，属性：name 姓名，no 班号，score 成绩，现在将若干Student对象放入List，请统计出每个班级的总分和平均分
 * 思路：面向对象+分拣存储
 * @author Administrator
 *
 */
public class MapDemo03 {

	public static void main(String[] args) {
		List<Student> list = exam();
		Map<String, ClassRoom> map = count(list);
		view(map);
	}
	
	
	/**
	 * 查看总分及平均分
	 * @param map
	 */
	public static void view(Map<String, ClassRoom> map) {
		//遍历map
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String no = it.next();
			double total = map.get(no).getTotal();
			double avg = total/map.get(no).getStu().size();
			System.out.println(no + "-->" + total + "-->" + avg);
		}
	}
	
	/**
	 * 
	 * 统计分析
	 * 1、面向对象
	 * 2、分拣存储
	 * @param stuList
	 * @return
	 */
	public static Map<String, ClassRoom> count(List<Student> stuList) {
		Map<String, ClassRoom> map = new HashMap<>();
		//遍历stuList
		for(Student stu: stuList) {
			//分拣存储，看是否存在该编号班级
			String no = stu.getNo();//班级编号
			double score = stu.getScore();//学生成绩
			//判断班级是否存在
			ClassRoom room = map.get(no);
			//如果不存在，创建班级
			if(room == null) {
				room = new ClassRoom(no);
				map.put(no, room);
			}
			
			//存在  放入学生
			room.getStu().add(stu);//放入学生
			room.setTotal(room.getTotal() + score);//计算总分
			
		}
		return map;
	}
	
	/**
	 * 模拟考试，放入数据到List中
	 * @return
	 */
	public static List<Student> exam() {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("黄黄", "a", 80));
		stuList.add(new Student("黄小爽", "a", 83));
		stuList.add(new Student("黄小黄", "a", 85));
		stuList.add(new Student("大圆子", "b", 80));
		stuList.add(new Student("小圆子", "b", 90));
		return stuList;
		
	}

}
