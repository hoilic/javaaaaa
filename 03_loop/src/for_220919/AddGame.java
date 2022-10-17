package for_220919;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	      while (true) {
	         
	         int score = 0, count = 0;
	         
	         for(int round = 1 ; round <= 5 ; round++) {
	            
	            int a = (int) (Math.random() * 90 + 10); // 10~99 사이 숫자
	            int b = (int) (Math.random() * 90 + 10);
	            int sum = a + b;
	            int life;
	            
	            for(life = 1 ; life >= 0; life--) {
	               
	               System.out.print("["+round+"] "+a+" + "+b+" = ");
	               int ans = scan.nextInt();
	               
	               if (sum == ans) {
	                  score += 20;
	                  count++;
	                  System.out.println("딩동댕");
	                  break;//맞히면 기회 생략
	               }
	               if (sum != ans && life == 1) {
	                  System.out.println("틀렸다");
	               }
	               else
	                  System.out.println("틀렸다 정답은 " + sum);
	            }//기회2번 for
	         }//5문제 for
	         
	         System.out.println("당신은 총 "+count+" 문제를 맞추어서 점수는 "+score+" 점 입니다.");
	         System.out.print("또 할래(Y/N) : ");
	         String go = scan.next();
	         
	         if(go.equals("N") || go.equals("n")) { 
	            System.out.println("프로그램을 종료합니다.");
	            break;
	         }
	      }//while
	   }

	}
 /*whie{
	for (5문제) {
	if
		1번의 기회{
		}
		}
   }
   */
/*
[문제] 덧셈 계산 (for, while, 다중 for)
- 10~99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 5문제를 제공한다.
- 1문제당 점수 20점씩 처리한다.
- 1번 틀리면 기회를 주고, 2번 다 틀리면 정답을 알려준다.

[실행결과]
[1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 50
틀렸다 정답은 XXX

[2] 10 + 25 = 35
딩동댕


[5] 78 + 95 =89
틀렸다 정답은 XXX

당신은 총 x 문제를 맞추어서 점수 xx 점 입니다.

또 할래(Y/N) : n
프로그램을 종료합니다.


*/