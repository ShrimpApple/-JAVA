package ch05.exam04;

import java.io.*;
import java.util.*;

public class SungJeok4 {

    public static void main(String[] args) {
        String filename = "D:/pyw_data/ecl_java_data/java_js/src/ch05/exam04/scores.txt"; // 메모장 파일 경로
        // 학생 수를 미리 파악하기 위한 변수
        List<int[]> scoreList = new ArrayList<>();

        // 파일에서 데이터를 읽어오기 위한 BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            // 파일에서 한 줄씩 읽어들임
            while ((line = br.readLine()) != null) {
                // 공백으로 점수를 분리하고, 각각의 값을 배열로 저장
                String[] scoreStrings = line.split(" ");
                int[] score = new int[scoreStrings.length];
                for (int i = 0; i < scoreStrings.length; i++) {
                    score[i] = Integer.parseInt(scoreStrings[i]);
                }
                // List에 점수 배열을 추가
                scoreList.add(score);
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            return;
        }

        // List를 배열로 변환
        int[][] score = new int[scoreList.size()][];
        for (int i = 0; i < scoreList.size(); i++) {
            score[i] = scoreList.get(i);
        }

        // 각 학생의 총점 계산
        int[] totals = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            totals[i] = sum;
        }

        // 버블 정렬을 사용하여 총점 기준으로 순위 매기기
        for (int i = 0; i < totals.length - 1; i++) {
            for (int j = 0; j < totals.length - 1 - i; j++) {
                if (totals[j] < totals[j + 1]) {
                    // 총점 교환
                    int temp = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = temp;
                    // 점수가 바뀌었으므로, 해당 학생들의 순위도 함께 변경
                    int[] tempScore = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tempScore;
                }
            }
        }

        // 순위 출력
        System.out.println("순위 번호 국어 영어 수학 총점 평균 ");
        System.out.println("===============================");
        
        // 학생 출력 (정렬 후)
        for (int rank = 0; rank < score.length; rank++) {
            int sum = totals[rank];
            float avg = sum / 3.0f;
            
            // 순위 출력
            System.out.printf("%3d %3d", rank + 1, rank + 1);
            
            // 학생별 점수 출력
            for (int j = 0; j < score[rank].length; j++) {
                System.out.printf("%5d", score[rank][j]);
            }
            
            // 총점 및 평균 출력
            System.out.printf("%5d %5.1f\n", sum, avg);
        }
    }
}
