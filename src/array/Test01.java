package array;

public class Test01 {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 23;
		a[1] = 28;
		a[2] = 32;
		
		Car[] cars = new Car[10];
		cars[0] = new Car("奔驰");
		
		System.out.println(cars[0].name);
		
		StringBuilder s = new StringBuilder("abcn");
		s.append(true).append(321).append("随便");
		System.out.println(s);
		System.out.println(s.delete(2, 5));
		System.out.println(s.reverse());
	}
}
