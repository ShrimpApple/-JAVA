package ch05;


import java.util.Arrays;
import java.util.Comparator;

public class SungJeok2 {

    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}, // 1번 학생: 국어, 영어, 수학 점수
                {20, 20, 20},    // 2번 학생: 국어, 영어, 수학 점수
                {30, 30, 30},    // 3번 학생: 국어, 영어, 수학 점수
                {40, 40, 40},    // 4번 학생: 국어, 영어, 수학 점수
                {50, 50, 50}     // 5번 학생: 국어, 영어, 수학 점수
        };
        
        // 각 학생의 총점 계산
        int[] totals = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            totals[i] = sum;
        }
        
        // 학생의 총점과 인덱스를 함께 저장
        Integer[] indices = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            indices[i] = i;
        }
        
        // 총점 기준으로 내림차순 정렬 (배열 인덱스 기준)
        Arrays.sort(indices, (a, b) -> totals[b] - totals[a]);
        
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        
        System.out.println("순위 번호 국어 영어 수학 총점 평균 ");
        System.out.println("===============================");
        
        // 순위에 맞게 학생 출력
        for (int rank = 0; rank < score.length; rank++) {
            int i = indices[rank];
            int sum = totals[i];
            float avg = sum / 3.0f;
            
            // 과목별 총점 누적
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            
            // 순위 출력
            System.out.printf("%3d %3d", rank + 1, i + 1);
            
            // 학생별 점수 출력
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%5d", score[i][j]);
            }
            
            // 총점 및 평균 출력
            System.out.printf("%5d %5.1f\n", sum, avg);
        }
        
        // 구한 총점 출력
        System.out.println("===============================");
        System.out.printf("총점:%3d %4d %4d\n", korTotal, engTotal, mathTotal);
    }
}