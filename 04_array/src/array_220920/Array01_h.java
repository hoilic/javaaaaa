package array_220920;

public class Array01_h {
	public static void main(String[] args) {
		/*
		int[] ar = {10,20,30};
		int[] ar;
		ar = new int[3];
		int[]ar = new int[3];
		*/
		
		//int a; //정수형 변수
		int[] ar;
		ar = new int[5];
		ar[0] = 25 ;
		ar[1] = 27 ;
		ar[2] = 30 ;
		ar[3] = 35 ;
		ar[4] = 38 ;
		
		//배열명 주소, 메모리 어디에 저장이 된건지
		System.out.println("배열명 ar 주소 = " + ar);
		System.out.println("배열명 크기 = " + ar.length);
		
		for(int i = 0; i<ar.length; i++) { // 0부터 5까지 돌려~
			System.out.println("ar[" +i+ "] = " + ar[i]);
		}
		
		System.out.println();
		
		System.out.println("거꾸로 출력");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("ar[" + i +"] = " + ar[i]);
		}
		System.out.println();
		
		System.out.println("짝수 데이터만 출력");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 == 0) {
				System.out.println("ar[" + i +"] = " + ar[i]);
			}
		}
		
		System.out.println();
		System.out.println("확장 for 문");
		for(int data : ar) {
			System.out.println(data);
		}
		
	}

}
