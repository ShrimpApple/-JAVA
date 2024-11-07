package exam01;

import java.util.Scanner;

public class testexam03 {

		public static void main(String[] args) {
	        // 입력 처리
	        int x = getInput("정수 x 입력: ");
	        int y = getInput("정수 y 입력: ");
	        
	        // 연산 결과 출력
	        performOperations(x, y);
	    }

	    // 사용자 입력을 처리하는 함수
	    public static int getInput(String prompt) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print(prompt);
	        return scanner.nextInt();
	    }

	    // 연산을 수행하고 결과를 출력하는 함수
	    public static void performOperations(int x, int y) {
	        // 나눗셈 오류 처리
	        if (y == 0) {
	            System.out.println("0으로 나눌 수 없습니다.");
	        } else {
	            // 나눗셈이 가능할 때 출력
	            System.out.println("나눗셈 : " + ((float) x / y));
	        }

	        // 덧셈, 뺄셈, 곱셈 출력
	        System.out.println("덧셈 : " + (x + y));
	        System.out.println("뺄셈 : " + (x - y));
	        System.out.println("곱셈 : " + (x * y));
	    }
	}
