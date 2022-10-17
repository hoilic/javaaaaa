package array_220920;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		//난수 발생
		for( int i=0; i<lotto.length; i++) {
			lotto[i] =(int)(Math.random()*45+1);
			
			//중복체크
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}//forj
		}//for i
		
		Arrays.sort(lotto);//정렬 - 오름차순
		//클래스.static 으로 되어 있어서 new 를 안써도 된다.
		
		
		for(int data : lotto) { //lotto의 데이터를 다 보여줘
			System.out.print(data + "  ");
		}
		System.out.println();

	}

}
