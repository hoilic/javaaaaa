package multi_220922;

public class MultiArray01 {

	public static void main(String[] args) {
		int[][] ar = new int[3][2]; // new 는 동적할당 이라고 한다.
		
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[1][0] = 30;
		ar[1][1] = 40;
		ar[2][0] = 50;
		ar[2][1] = 60;
		
		for(int i=0; i<ar.length; i++) { //행 주소
			for(int j=0; j<ar[i].length; j++) { //열 : 배열 i 의 길이 만큼의 열의 크기
				System.out.println("ar[" + i + "] = " + ar[i][j]);		
			}//for j
			System.out.println();
		}//for i
	}

}
