package operator_220916;
// 강사님 문제풀이
public class Homework02_01 {

	public static void main(String[] args) {
		char ch = 'B';
		// char ch = 'e';
		
		int result = ch>= 'A' && ch<='Z' ? ch+32 : ch-32;
		System.out.println(ch + " → " +  (char)result );

	}

}
