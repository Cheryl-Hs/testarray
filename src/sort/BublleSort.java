package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author Administrator
 *
 */
public class BublleSort {
	
	public static void main(String[] args) {
		int[] arr = {9,1,2,3,4};
		sort(arr);
	}
	
	public static void sort(int[] arr) {
		int len = arr.length;
		boolean sorted = true;
		for(int i = 0; i<len-1; i++) {  //趟数
			sorted = true; //假定有序
			System.out.println("第" + (i+1) + "趟");
			for(int j = 0; j<len-1-i/*减少趟数*/; j++) {  //次数
				System.out.print("第" + (j+1) + "次");
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = false;  //假定失败
				}
								
				System.out.println(Arrays.toString(arr));
			}

			if(sorted) {
				break;
			}
		}
	}
}
