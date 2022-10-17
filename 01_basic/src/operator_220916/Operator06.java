package operator_220916;

public class Operator06 {

	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a = " + a); //false
		System.out.println("!a = " + !a); //true
		System.out.println();
		
		String b = "apple"; //literal 생성 , b 의 주소 값
		String c = new String("apple"); // c 의 주소 값을 물어보는거, apple 글자를 보는게 아니라
		
		System.out.println("b == c : " + (b == c ? "같다" : "다르다")); // 주소값, 참조값 물어보는거
		System.out.println("b != c : " + (b != c ? "참" : "거짓") );
		System.out.println();
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다")); //문자열 을 물어봄
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "참" : "거짓"));
		
	}

}
