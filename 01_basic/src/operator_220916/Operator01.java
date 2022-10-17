package operator_220916;
import java.text.DecimalFormat;

public class Operator01 {

	public static void main(String[] args) {
		int money = 5738;
		
		int thu = (money/1000)%10;	//	5738 / 1000 → 5.738%10 → 몫은 0 나머지 5
		int hun = (money/100)%10;		// 5738 / 100 → 57.38%10 → 몫은 5 나머지 7
		int ten = (money/10)%10;		// 5738 / 10 → 573.8%10 → 몫은 57 나머지 3
		int one = money%10;			// 5738 %10 → 몫 573 나머지 8
		
		System.out.println("현금 " + new DecimalFormat().format(money) + "원");
		System.out.println("천의 자리 : " + thu );
		System.out.println("백의 자리 : " + hun );
		System.out.println("십의 자리 : " + ten );
		System.out.println("일의 자리 : " + one );
		
		

	}

}