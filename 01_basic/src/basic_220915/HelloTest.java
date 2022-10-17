package basic_220915;

public class HelloTest {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다"); // \ 은 new line
		System.out.println("사과\t딸기\t바나나"); // \t 는 tab
		System.out.println(25 + 36); //61
		System.out.println("25 + 36"); // 25 + 36
		System.out.println("25" + "36"); // 2536 문자열에서 +는 결합 
		/* 숫자		'문자'		"문자열"
					1개			2개이상
		*/
		System.out.println("25 + 36 =" + 25 + 36); // 25 + 36 = 2536
		System.out.println("25 + 36 =" + (25 + 36)); // 25 + 36 = 61
		System.out.println(2+3); //5
		System.out.println('2'+'3'); //50+51
	}

}
