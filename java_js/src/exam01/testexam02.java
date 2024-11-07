package exam01;

import java.util.Scanner;

public class testexam02 {

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 입력: 정수 x
        System.out.print("정수 x 입력 : ");
        int x = scanner.nextInt();
        
        // 두 번째 입력: 정수 y
        System.out.print("정수 y 입력 : ");
        int y = scanner.nextInt();
        
        // y가 0인 경우 나누기 오류 방지
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
