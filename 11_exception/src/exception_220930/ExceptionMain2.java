package exception_220930;

import java.util.Scanner;

public class ExceptionMain2 {
	
	private int x, y; 
//	private int mul=1; 
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("X 입력 : ");
		x = scan.nextInt();
		System.out.print("Y 입력 : ");
		y = scan.nextInt();	
	}
	
	public void output() {
		if(y >=0 ) {
			int mul =1;
			for(int i = 1 ;i<=y; i++) { //for 는 y번 만큼 반복 시키려고
				
				mul = x*mul;
				/* 2 = 2*1
				 * 4 = 2*2
				 * 8 = 2*4
				 */		
			}//for
			System.out.print(x +"의" + y + "승 = " + mul);	
		}else {
			//System.err.println("y는 0보다 크거나 같아야 한다");
			try {
				//개발자가 강제로 Exception 발생
				throw new Exception("y는 0보다 크거나 같아야 한다");
			 } catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}
	public static void main(String[] args) {
		
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		// 대문자는 클래스, 소문자는 객체값
		exceptionMain2.input();
		exceptionMain2.output();	
		}
	
			
	}
	


/*
[문제] 제곱연산
- x의 y승을 처리 한다.

[실행결과]
x 입력 : 2
y 입력 : 10                input()
---------------------------------
2의 10승은 xxx              output()
*/