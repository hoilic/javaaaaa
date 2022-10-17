package array_220920;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
			int[] lotto = new int[6];		
			
			System.out.print("현금 입력 : ");
			int money = scan.nextInt();
		
			
			for(int h=1; h<=money/1000; h++) { //돈 받은 천원단위 만큼 줄수 나오도록 money/1000
				//난수 발생
				for( int i=0; i<lotto.length; i++) {
					lotto[i] =(int)(Math.random()*45+1);
					
					//중복체크
					for(int j=0; j<i; j++) {
						if(lotto[i] == lotto[j]) {
							i--;
							break;
						}
						
					}//for j
				}//for i
				
				Arrays.sort(lotto);//정렬 - 오름차순
				//클래스.static 으로 되어 있어서 new 를 안써도 된다.
				
				
				for(int data : lotto) { //lotto의 데이터를 다 보여줘
					
					System.out.print(String.format("%-5d", data)); //왼쪽정렬
				}
				System.out.println();
				
				if((h)%5==0) System.out.println(); //5줄 되면 줄 띄우기
			}//for h
			

			} 
											
		}

/*
[문제] 로또
-돈을 입력받아서 난수가 자동으로 처리하는 프로그램




실행결과]
현금 입력 : 7000
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    3   14   23   30   34   35
   18   20   25   27   32   37

    1   16   32   34   41   42
    5    6   18   30   33   44



*/