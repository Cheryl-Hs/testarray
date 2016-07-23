package sort;

import java.util.Arrays;
import java.util.Date;

public class Demo02 {
	public static void main(String[] args) {
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(System.currentTimeMillis() - 1000*60*60);
		arr[2] = new Date(System.currentTimeMillis() + 1000*60*60);
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(Date[] arr) {
		int len = arr.length;
		boolean sorted = true;
		for(int i = 0; i<len-1; i++) {  //趟数
			sorted = true; //假定有序
			for(int j = 0; j<len-1-i/*减少趟数*/; j++) {  //次数
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0) {
					Date temp = arr[j];
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
