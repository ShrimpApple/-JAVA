package ch02.sec1.exam02;

public class ValueChange {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		int tmp = x;
		x = y;
		y = tmp;
		
		
		System.out.println("x <-> y 데이터 교환:");
		System.out.println("x=" + x);
		System.out.println("y=" + y);


	}

}
