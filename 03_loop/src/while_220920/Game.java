package while_220920;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int com = (int)(Math.random()*100+1); //1~100;
			System.out.println("1 ~ 100 사이의 숫자를 맞추세요" + "("+com+")");
			int count = 0; // 지역변수가 되면 안되므로, while 밖에 미리 써놔야한다.
			
			
			while(true) {
				System.out.print("숫자 입력 : ");
				int user = scan.nextInt();
				count++; // 1 2 3 ...
				
				if(com>user) {
					System.out.println(user + "보다 큰 숫자입니다.");
				}
				else if (com<user) {
					System.out.println(user + "보다 작은 숫자입니다.");
				}
				else if (com == user) {
					break;
				}					
			}//while
			
			System.out.println("딩동댕! " + count + "번 만에 맞추셨습니다!");
			
			System.out.print("\n 또 할래요(Y/N) : ");
			String yn = scan.next();
			
			if(yn.equals("N") || yn.equals("n")) break; //문자열은 equals 를 사용하여 문자열 입력하도록 만든다.
						
			}//while
		System.out.println("프로그램 을 종료합니다.");
	
	}

}

/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1~100 사이에 난수 발생, 발생한 난수를 맞추는 게임
- 몇 번 만에 맞추었는지 출력한다.

[실행결과]
1~100 사이의 숫자를 맞추세요

숫자 입력 : 50
50 큰 숫자 입니다.

숫자 입력 : 80
80 보다 작은 숫자 입니다.

숫자 입력 : 77
딩동댕... X 번 만에 맞추셨습니다.


*/
