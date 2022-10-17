package multi_220922;

public class MultiArray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10]; 
		int num=0;
		
		//입력
		
		for(int i=0; i<ar.length; i++) { //행 주소
			for(int j=0; j<ar[i].length; j++) { //열 : 배열 i 의 길이 만큼의 열의 크기
				num++; //1부터 스타트
				ar[i][j] = num;
			}//for j
		}//for i
		
		//출력
		for(int i=0; i<ar.length; i++) { //행 주소
			for(int j=0; j<ar[i].length; j++) { //열 : 배열 i 의 길이 만큼의 열의 크기
				System.out.print(String.format("%4d", ar[i][j]));
			}//for j
			System.out.println();
		}//for i
			
		
	}

	}


