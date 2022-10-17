package abstract_220927;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
//		NumberFormat nf = new NumberFormat(); - 추상클래스
		NumberFormat nf = new DecimalFormat();
		//3자리마다 , 찍고 소수이하 3째자리
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		//유효숫자가 아닌것은 표현하지 않는다.
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0를 강제로 표시
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		NumberFormat nf4 = NumberFormat.getInstance(); //메소드 이용
		//기본은 소수이하 3째자리
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
		NumberFormat nf5 = NumberFormat.getInstance(); //메소드 이용	
		nf5.setMaximumFractionDigits(2); //소수이하 2째자리 표시
		nf5.setMinimumFractionDigits(3); //0를 강제로 표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
		NumberFormat nf6 = NumberFormat.getCurrencyInstance();//
		//원 표시 //메소드 이용	
		nf6.setMaximumFractionDigits(2); //소수이하 2째자리 표시
		nf6.setMinimumFractionDigits(2); //0를 강제로 표시
		System.out.println(nf6.format(12345678.456789));
		System.out.println(nf6.format(12345678));
		System.out.println();
		
		NumberFormat nf7 = NumberFormat.getCurrencyInstance(Locale.US);//
		//$ 표시 //메소드 이용	
		nf7.setMaximumFractionDigits(2); //소수이하 2째자리 표시
		nf7.setMinimumFractionDigits(2); //0를 강제로 표시
		System.out.println(nf7.format(12345678.456789));
		System.out.println(nf7.format(12345678));
		System.out.println();
	}

}
