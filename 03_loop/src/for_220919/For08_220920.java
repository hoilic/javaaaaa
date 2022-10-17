package for_220919;

import java.util.Scanner;

//강사님 해설
public class For08_220920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt(); //10
			
			if(num == 0) break;
			if(num < 0) continue; // num 음수가 되면 실행하지마! 처음으로 돌아갈!
			//if (num >=1); // 안써도 된다.
			
			// 약수 & 소수
			int count=0;
			
			for(int i=1; i<=num; i++) {
				if(num%i == 0) {
					System.out.print(i + " "); // 입력값 num 을 1부터~num 사이의 수로 나누어 나머지가 없는것이 소수의 약수
					count++;
				} //while
			} //for
			
			System.out.println();
			
			if(count == 2) System.out.println(num + "는 소수이다"); //소수는 약수가 2개이므로, count 되는 숫자가 2개가 나오는 수가 소수이다.
			else System.out.println(num + "는 소수가 아니다");
		}//while
		
	 System.out.println("프로그램을 종료합니다.");
	}

}

/*
[문제] 약수와 소수(1과 자기자신의 숫자만 약수로 갖는 수)를 구하기
- 0이 입력되면 종료된다.
- 음수가 입력되면 숫자를 다시 입력한다.

[실행결과]
숫자 입력 : -8
숫자 입력 : -1
숫자 입력 : 12
1  2  3  4  6  12
12는 소수가 아니다

숫자 입력 : 37
1  37
37는 소수이다

숫자 입력 : 0
프로그램을 종료합니다.
*/

