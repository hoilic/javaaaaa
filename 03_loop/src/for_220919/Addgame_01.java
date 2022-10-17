package for_220919;

import java.util.Scanner;

public class Addgame_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int score;
		
		LOOP : while(true) {
			for( int round = 1; round<=2; round++){ //5번 실행
				int a=(int)(Math.random()* 90 + 10); //10~99 사이
				int b=(int)(Math.random()* 90 + 10); //10~99 사이
				
				for(int j=1; j<=2; j++) { //2번 기회
					
					System.out.print("["+ round +"]" + a + " + " + b + " = ");
					int answer = sc.nextInt();
					if (answer == (a+b)) {
						System.out.println("딩동댕");
						count++;
						break;			
					}
					else System.out.println("틀렸다");
					
					if(j == 2) System.out.println("정답은" + (a+b));
					System.out.println();
								
				}//for j
				
			}// for round
			
			score = 20*count;
			System.out.println("당신은 총" + count + "문제를 맞추어서 점수는" + score + "입니다");
			while(true) {
				System.out.print("또 할래(Y/N) : ");
				String go = sc.next();
				
				if(go.equals("Y") || go.equals("y")) break;
				if(go.equals("N") || go.equals("n")) {
					System.out.print("프로그램을 종료합니다.");	
					break LOOP;
			}		
		}
			
		}//while

	}
}

