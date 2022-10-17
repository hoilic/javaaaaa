package array_220920;

public class Array01 {

	public static void main(String[] args) {
		/*
		int[] ar = {10, 20, 30};
		=
		int[] ar;
		ar = new int[3];
		=
		int[] ar = new int[]{10, 20, 30};   //int[] ar = new int[3]{10, 20, 30} 은 안됨 초기값이 주어져 있으므로
		*/
		
		
		//int a; //정수형 변수
		int[] ar; //정수형 배열, 배열 선안
		ar = new int[5]; //생성, 방5개,  0번 부터 시작
		ar[0] = 25;
		ar[1] = 78;
		ar[2] = 30;
		ar[3] = 43;
		ar[4] = 52;
		
		/*
		System.out.println("ar[0] = " + ar[0]);
		System.out.println("ar[1] = " + ar[1]);
		System.out.println("ar[2] = " + ar[2]);
		System.out.println("ar[3] = " + ar[3]);
		System.out.println("ar[4] = " + ar[4]);
		*/
		System.out.println("배열명 ar = " + ar);
		System.out.println("배열 크기 = " + ar.length);
		//for(int i =0; i<5; i++) System.out.println("ar["+i+"] = " + ar[i]);
		for(int i =0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = " + ar[i]);
		}//for
		
		
		System.out.println();
		
		
		System.out.println("거꾸로 출력");
		for(int i =ar.length-1; i>=0; i--){ //ar.ength-1 = 4
			System.out.println("ar["+i+"] = " + ar[i]);
		}//for
		
		System.out.println();
		
		System.out.println("짝수 데이터만 출력");
		for(int i =0; i<ar.length; i++){
			if(ar[i]%2 == 0) {
				System.out.println("ar["+i+"] = " + ar[i]);
			}
			
		}//for
		
		System.out.println();
		
		System.out.println("확장 for 문"); //ar.length 라고 안써도 배열의 크기만큼 for 문이 반복한다.
		for(int data : ar){
			System.out.println(data);
			
			}
			
		}//for
	} 


