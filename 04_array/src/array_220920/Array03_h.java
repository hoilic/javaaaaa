package array_220920;

import java.util.Scanner;

/*
배열 크기 입력 : 3

ar[0] 입력 : 25
ar[1] 입력 : -50
ar[2] 입력 : 78

25   -50   78
합 = XXX
최댓갑 = XXX 

*/
public class Array03_h {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 크기 입력 : ");
		int size = scan.nextInt();
		
		int sum=0;
		int max, min;
		
		int ar[] = new int[size]; // size 를 숫자로 입력하면 그 수만큼 방이 생긴다.
		for(int i=0; i<size; i++) {
			System.out.print("ar["+i+"] 입력 : ");
			ar[i] = scan.nextInt();
			// 합
			
			sum = sum+ar[i];
		}//for i
		System.out.println();
		
		max = min = ar[0];
		for(int i=1; i<size; i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min) min = ar[i];
		}
		for(int data :ar) {
			System.out.println(data+ " ");
		}//for data
		System.out.println();
		
		System.out.println("합 = " + sum);
		
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);

	}

}
