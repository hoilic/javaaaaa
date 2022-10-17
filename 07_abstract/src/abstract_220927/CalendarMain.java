package abstract_220927;

import java.util.Calendar;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CalendarMain {
	private int year, month, week, lastDay; // week 는 시작 요일, lastDay는 윤달인 경우도 있으니까 잡아줘야함
	
	public CalendarMain() { //생성자는 클래스명과 똑같다, 또한 void 를 붙일수 없다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		year = scan.nextInt(); //2022
		System.out.print("월 입력 : ");
		month = scan.nextInt(); //10
	}
	
	public void calc() {
		Calendar cal = Calendar.getInstance(); //클래스 생성, 모든 클래스가 new 로만 만들어지는것은 아니다.
		//getInstance() 시스템 시간 (2022-09-28)을 원하는 날짜로 변경
		//Calendar 는 추상 메소드로 만들어야 하기때문에 getInstance 로 어거지로 객체를 생성
//		cal.set(Calendar.YEAR, year);//년도 변경
//		cal.set(Calendar.MONTH, month-1);//월 변경 //1월 -0, 2월- 1...... 9월-8
//		cal.set(Calendar.DAY_OF_MONTH, 1);//일 변경 , 처음시작하는 일 이 1일 이라서 1로 한다.
		
		cal.set(year, month-1, 1);//위에 3개와 같은 내용
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH) ; //28, 29, 30, 31  //끝나는 요일 설정
		//이번달에 가장 큰 숫자는 얼마냐, 즉 마지막 숫자는 몇인지 
		}
	
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1; i<week; i++) { //일-1, 월-2, 화-3 .... 토-7
			System.out.print("\t");			
		}//for
		
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i + "\t");
			
			if(week%7 == 0) System.out.println();
			week++;
		}//for
	}

	public static void main(String[] args) {
		CalendarMain calendarMain = new CalendarMain(); // (); => 생성자를 불러서 (물귀신) 호출
		calendarMain.calc(); //
		calendarMain.display(); //
		

	}

}

/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10   

일   월   화   수   목   금   토
      1   2   3   4   5
6   7   8   9   10   11   12
13   14   15   16   17   18   19
20   21   22   23   24   25   26
27   28   29   30   31
 */