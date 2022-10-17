package variable_220915;

import java.text.DecimalFormat;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 320;
		short b = 258;
		short sum =(short)(a + b);
		
		System.out.println(a + "+" + b + "=" + sum);
		
		short sub=(short)(a-b);
		int mul=a*b; //short 는 범위가 -32768 ~ +32767 이므로 int형으로 바꿈 
		double div= (double)a / b; //정수형을 실수형으로 강제형변환
		
		
		System.out.println(a + "+" + b + "=" + sum);
		System.out.println(a + "-" + b + "=" + sub);
		
		System.out.println(a + "*" + b + "=" + mul);
		System.out.println(a + "*" + b + "=" +  new DecimalFormat().format(mul));
		// new DecimalFormat() 3자리마다 쉼표 표시
		
		System.out.println(a + "/" + b + "=" + div);
		System.out.println(a + "/" + b + "=" + String.format("%7.5f",div));

		

		

	}

}


/*
[문제] 변수를 이용하여 320, 258의 합을 구하시오

[실행결과]
320 + 258 = XXX

[문제] 변수를 이용하여 320, 258의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오

[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = 1.24031007751938
*/