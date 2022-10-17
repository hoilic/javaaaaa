package array_220920;

import java.util.Scanner;

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
public class Array04_h {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		boolean[] ar =new boolean[5]; //5개 방 만들기
		
		while(true) {
			System.out.println(); //줄바꿈용
			System.out.println("주차관리 시스템");
			System.out.println("**********");
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 리스트");
			System.out.println("4. 종료");
			System.out.println("**********");
			System.out.print("메뉴 : ");
			num = sc.nextInt();
			if(num == 4)break;
			else if(num<1 || num>4) {//1234 제외 하고 나머지 찍었을 경우
				System.out.println("1 ~ 4번 까지만 입력하세요");
				continue;
			}
			if (num == 1) {//1번 찍으면
				System.out.print("위치 입력 : ");
				int position = sc.nextInt();
				// 3번 방으로 들어갈거면 ar[2], 0부터 시작하닌까 1이 작아야함
				if(ar[position-1]) // true 이면 이미 차가 주차되어있는 상태
					System.out.println("이미 주차되어 있습니다.");
				else {
					ar[position-1] = true; // false 를 true 로 바꿔서 주차하게 만듬
					System.out.println(position + "위치에 입차");
				}
				
			}else if(num == 2) { //2번 찍으면
				System.out.print("위치 입력 : ");
				int position = sc.nextInt();
				
				if(ar[position-1]) {// true일때
					ar[position-1] =  false; //false 는 출차
					System.out.println(position + "위치에 출차");
				}else
					System.out.println("주차되어 있지 않습니다.");	
				
			}else if(num == 3) {
				for(int i=0; i<ar.length; i++) {
					System.out.println((i+1) + "위치 : " + ar[i]);
				}
			}
				
		}//while
		
		System.out.println("프로그램을 종료합니다.");

	}

}
