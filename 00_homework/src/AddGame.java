import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int a, b, dab, count;
		String yn;
		
		while(true) {
			count = 0;
			for(int i=1; i<=2; i++) { //5문제
				a = (int) (Math.random() * 90 + 10); // 10~99 사이 숫자
		        b = (int) (Math.random() * 90 + 10);
		        
		        for(int j=1; j<=2; j++) { //기회를 1번 더
			        System.out.print("[" + i + "] " + a + " + " + b + " = ");
			        dab = scan.nextInt();
			        
			        if(dab == a+b) { // 참이면 딩동댕!
			        	System.out.println("딩동댕! 정답입니다");
			        	count++; //정답 갯수를 카운트 해라!!!
			        	break; //for j 를 벗어나라
			        }
			        else //위에서 답을 맞췄고 else 는 답이 아닌경우 
			        	if( j ==1) // 첫번째 기회
			        	System.out.println("틀렸다");
			        	else  // 두번째 기회
			        		System.out.println("2틀렸다 정답은 " + (a+b));
		        } //for j
		        
		        System.out.println();
		        
			}//for i
			System.out.println();
			System.out.println("당신은 총 "+count+" 문제를 맞추어서 점수는 "+(count*20)+" 점 입니다.");
		
					 do {
				            System.out.print("또 할래 (Y/N) : ");
				            yn = scan.next();
				            
				         }
					 while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
				 	// 반복을 위한조건
					 
					 
					
			if(yn.equals("N") || yn.equals("n"))
				break; //while를 벗어나라
	
		} //while 
		
		System.out.println("프로그램을 종료합니다.");

	}

}






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