package switch_220919;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월 입력 : ");
		int month = scan.nextInt();
		int days;
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : days=31; break;
		case 2 : days=28; break;
		case 4, 6, 9, 11 : days=30; break;
		default : days=0;
		
		}//switch - 가독성
		
		
	
		
		System.out.println(month + " 월은 " + days +" 일 입니다." );

	}

}
