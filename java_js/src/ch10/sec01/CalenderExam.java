package ch10.sec01;

import java.util.Calendar;

public class CalenderExam {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("현재 날짜와 시간: " + year + "년 " + month + "월 " + day + "일 " + hour + ":" + minute + ":" + second);
	}

}
