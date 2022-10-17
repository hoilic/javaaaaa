package array_220920;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		boolean[] parking; //
		parking = new boolean[5]; 
		
		int driver = 0;
		
		while(true) {
			System.out.println("**********");
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 리스트");
			System.out.println("4. 종료");
			System.out.println("**********");
			System.out.print("메뉴 : ");
			
			int menu = scan.nextInt();
	
			if(menu == 1) {
				System.out.print("위치 입력 : ");
				driver = scan.nextInt();
				if(parking[driver-1] == true) { //true 이면 이미 차가 주차되어있는 상태
					System.out.println(driver + "이미 주차되어 있습니다");
				}else if(parking[driver-1] == false) {
					System.out.println(driver + "위치에 입차");
					parking[driver-1] = true;
				}
			}//if1
			if(menu == 2) {
				System.out.print("위치 입력 : ");
				driver = scan.nextInt();
				if(parking[driver-1] == false) { //true 이면 이미 차가 출차된 상태
					System.out.println(driver + "이미 출차되었습니다");
				}else if(parking[driver-1] == true) {
					System.out.println(driver + "위치에 출차 합니다");
					parking[driver-1] = false;
				}
				
			}//if2
			if(menu == 3) {
				for(int i =0; i<parking.length; i++) {
					System.out.println((i+1)+"위치 : " + parking[i]);
				}//for
			}//if3
			if (menu == 4) {
				System.out.println("종료");
				break;
			}
			
		}//while

	}

}

/*
주차장 관리 프로그램
**************
   1. 입차      input()
   2. 출차      output()
   3. 리스트      list()
   4. 종료 // 무한 루프가 도는걸 끝내야함 (while, if)
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/