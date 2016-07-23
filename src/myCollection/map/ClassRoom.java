package myCollection.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * 班级类：一个班级多个学生
 * @author Administrator
 *
 */
public class ClassRoom {
	private String no;//班级
	private List<Student> stuList;//班级列表
	private double total;//总分
	
	public ClassRoom() {
		stuList = new ArrayList<>();//初始化list,避免容器再初始化，直接使用即可
	}
	
	public ClassRoom(String no) {
		this();
		this.no = no;
	}

	public ClassRoom(String no, List<Student> stuList, double total) {
		super();
		this.no = no;
		this.stuList = stuList;
		this.total = total;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public List<Student> getStu() {
		return stuList;
	}

	public void setStu(List<Student> stuList) {
		this.stuList = stuList;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
	
}
