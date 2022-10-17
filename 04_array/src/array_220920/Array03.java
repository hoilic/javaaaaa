package array_220920;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 입력 : ");
		int size = sc.nextInt();
		
		int[] ar ;
		ar = new int[size]; //size 로 입력하는 수 만큼의 방이 생긴다.
		int sum = 0;
		int max, min ;
		
		/*
		System.out.println("ar[0] 입력 : ");
		ar[0] = sc.nextInt();
		System.out.println("ar[1] 입력 : ");
		ar[1] = sc.nextInt();
		System.out.println("ar[2] 입력 : ");
		ar[2] = sc.nextInt();
		*/
		
		for( int i=0; i< size; i++) {
			System.out.print("ar[" + i + "] 입력 : ");
			ar[i] = sc.nextInt();
			
			//합
			sum = sum+ar[i];
		}//for i
		System.out.println();
		
		max = min = ar[0]; //초기값
		
		for(int i =1; i<size; i++) {
			if(ar[i] > max) max = ar[i]; // max 값이 계속 바뀐다.
			if(ar[i] < min) min = ar[i];
		}
		
		for(int data : ar) {
			System.out.print(data + "  ");
		}//for data
		System.out.println();
		
		System.out.println("합 = " + sum);
		
		//max 의 초기값은 ar[0] 한다.
		System.out.println("최대값 = " + max);
		
		System.out.println("최소값 = " + min);

	}

}

/*
배열 크기 입력 : 3

ar[0] 입력 : 25
ar[1] 입력 : -50
ar[2] 입력 : 78

25   -50   78
합 = XXX
최댓갑 = XXX 

*/