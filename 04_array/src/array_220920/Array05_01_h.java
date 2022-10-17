package array_220920;
/*
 문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? ~~~ Z의 개수?
 */
public class Array05_01_h {

	public static void main(String[] args) {
		char[] ch = new char[50];
		int[] count = new int[26];
		
		for(int i =0; i<ch.length; i++) {
			ch[i] = (char)(Math.random()*26+65); // 65~90
			System.out.print(ch[i] + " ");
			
			if((i+1)%10 == 0) System.out.println();
			//배열은 0부터 시작하닌까 9번째 자리에서 +1 은 10이 되서 자리 바꿔줌
		}//for i
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<count.length; j++ ) {
				
			}
		}
		
		
		
		
		//lotto[i] =(int)(Math.random()*45+1);

	}

}
