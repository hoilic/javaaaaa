package multi_220922;
//다차원 배열 : 가변길이
public class MultiArray04 {

	public static void main(String[] args) {
		//가변길이
		int[][] ar = new int[3][];
		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[5];
		
		
		ar[0][0] = 10;
		
		//출력
		for(int i=0; i<ar.length; i++) { //행 주소
			for(int j=0; j<ar[i].length; j++) { //열 : 배열 i 의 길이 만큼의 열의 크기
				System.out.println("ar[" + i + "] = " + ar[i][j]);		
			}//for j
			System.out.println();
		}//for i
		

	}

}
