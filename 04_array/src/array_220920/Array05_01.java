package array_220920;
//강사님 문제풀이
import java.util.Random;

public class Array05_01 {

	public static void main(String[] args) {
		Random r = new Random();
		char[] ar = new char[50];
		int[] count = new int[26];
		
		/*
		ar[0] =(char)(r.nextInt(26) + 65); //r.nextInt(26) = 0~25
		ar[1] =(char)(r.nextInt(26) + 65);
		ar[2] =(char)(r.nextInt(26) + 65);
		~~~
		ar[49] =(char)(r.nextInt(26) + 65);
		*/
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = (char)(r.nextInt(26)+65); //
			System.out.print(ar[i] + " ");
			
			if((i+1)%10 == 0) System.out.println(); // 10줄씩 바꾸기
		} //for
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<count.length; j++) {
				if(ar[i] == j+65) count[j]++;
			}//for j
		}//for i
		
		System.out.println();
		
		for(int i=0; i<count.length; i++) {
			if(i%10 == 0) System.out.println(); // 10줄씩 바꾸기
			System.out.println((char)(i+65) + " : " + count[i]);
		}
		
		
	}

}
/*
[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? ~~~ Z의 개수?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0

*/
