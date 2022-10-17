package for_220919;

import java.util.Scanner;


public class For08 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int count = 0;
		String a ;
		
		for(int i = 1; i<=num; i++) {
			if(num%i == 0) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		if(count == 2) {
			System.out.println(num + "는 소수이다");
			}
		else System.out.println(num + "는 소수가아니다");

	
	}
}

/*
[문제] 약수와 소수(1과 자기자신의 숫자만 약수로 갖는 수)를 구하기

[실행결과]
숫자 입력 : 12
1  2  3  4  6  12
12는 소수가 아니다

숫자 입력 : 37
1  37
37는 소수이다
*/
