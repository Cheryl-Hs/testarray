package sort;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		String[] arr = {"abc","def","aaa","abcd"};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(String[] arr) {
		int len = arr.length;
		boolean sorted = true;
		for(int i = 0; i<len-1; i++) {  //趟数
			sorted = true; //假定有序
			for(int j = 0; j<len-1-i/*减少趟数*/; j++) {  //次数
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0) {
					String temp = arr[j];
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
