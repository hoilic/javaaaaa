package basic_220915;

public class NumberTest {

	public static void main(String[] args) {
		System.out.println(2 + 3); // 5
		System.out.println();
		System.out.println('2' + '3'); // 101
		System.out.println('2'-48 + '3'-48); // 문자 → 숫자로 변환시 -48
		System.out.println();
		System.out.println("2" + "3"); // 23 
		System.out.println(Integer.parseInt("2") + Integer.parseInt("3")); // 문자열 → 숫자자로 변환시
		
		System.out.println('a' + 3); //100 ('a'는 97)
		System.out.println("a" + 3); //a3
		System.out.println(0xa + 3); //13 (0xa는 16진수) 

	}

}
