package class2_220927;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ","); // ,은 구분자! ,을 기준으로 토큰 설정
		System.out.println("토큰 개수 = " + st.countTokens());
		
		while(st.hasMoreTokens()) { 
			//hasMoreTokens 현재 위치에 토큰이 있냐 없냐? 있으면 true, 없으면 false
			System.out.println(st.nextToken());
			//nextToken 토큰을 꺼내주고 다음 토큰으로 이동!
			// "학원" 을 꺼내주고 위로 올라가서 "집" 꺼내주고 위로올라가서 "게임방" 꺼내주고 토큰 없으닌까 빠져버리기
		}
		System.out.println("--------------------");
		
		String[] ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}

	}

}

/*
Tokenizer  주로 java 에서만 쓴다.
*/