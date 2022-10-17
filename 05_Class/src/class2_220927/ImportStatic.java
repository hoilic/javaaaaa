package class2_220927;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;
//import static java.lang.System.out;
import static java.lang.Math.*;
import static java.lang.String.format;


public class ImportStatic {

	public static void main(String[] args) {
		//System.out.println("난수 = " + Math.random());
		System.out.println("난수 = " + random());
		//System.out.println("제곱 = " + Math.pow(3, 4)); // 3의 4승
		System.out.println("제곱 = " + pow(3, 4)); // 3의 4승
		System.out.println("소수 이하 2째자리 = " + format("%.2f", 43.45678));

	}

}
