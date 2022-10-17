package multi_220922;

public class MultiArray03 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "프로도", "죠르디"};
		int[][] jumsu = {{90, 95, 100, 0}, {100, 89, 75, 0}, {75, 80, 48,0}};
		double[] avg = new double[3];
		char [] grade = new char[3];
		
		//입력
		for(int i = 0; i<jumsu.length; i++ ) {
			for(int j=0; j<jumsu[i].length-1; j++) { //열 : 배열 i 의 길이 만큼의 열의 크기
				jumsu[i][jumsu.length] = jumsu[i][jumsu.length]+jumsu[i][j];
			}//for j
		}//for i
		
		//평균
		for(int i = 0; i<avg.length; i++ ) {
			avg[i] = jumsu[i][jumsu.length]/3.0;
		
		}
		//학점
		for(int i = 0; i<grade.length; i++ ) {
		if(avg[i] >= 90) grade[i] = 'A';
		else if (avg[i] >= 80) grade[i] = 'B';
		else if (avg[i] >= 70) grade[i] = 'C';
		else if (avg[i] >= 60) grade[i] = 'D';
		else grade[i] = 'F';
		}
		
		//출력
		System.out.println("----------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------");
		for(int i=0; i<jumsu.length; i++) { 
			System.out.print(name[i] + "\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");	
				}//for j
			
			System.out.println(String.format("%.2f", avg[i]) + "\t" + grade[i]);
		}//for i
			
		
	}


	}



/*
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
코난      100      89      75
또치      75      80      48
----------------------------------------------------
*/