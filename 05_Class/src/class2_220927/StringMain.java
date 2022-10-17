package class2_220927;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //a변수의 literal 생성
		String b = "apple";
		if (a == b) System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
		if (a.equals(b)) System.out.println("a와 b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		String c = new String("apple"); //String 클래스의 객체를 생성하고 이름을 C 라고 붙였다.
		String d = new String("apple");
		if (c == d) System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		if (a.equals(b)) System.out.println("c와 d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2022 + 9 + 27;
		/*
		 문자열은 편집이 안되므로 메모리 4번 생성된다.
		 JVM에 의해서 삭제 시 Garbage Collector(휴지통)로 보낸다.
		 Garbage Collector(휴지통)가 실행되면 컴퓨터가 멈춘다.
		 "오늘 날짜는"
		 "오늘 날짜는 2022"
		 "오늘 날짜는 20229"
		 e ---> "오늘 날짜는 2022927" 
		 */
		System.out.println("e = " + e);
		System.out.println("문자열 크기 = " + e.length());
		for(int i=0; i<e.length(); i++) {
			System.out.println(i + " : " + e.charAt(i)); // i번째 해당하는 e배열 방안에 문자값을 나타내라
		}//for
		
		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7,11)); // 7~10번째 글자
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));
		System.out.println("문자열 검색 = " + e.indexOf("개바부"));
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));

		String r = "aabbccaa";
		int s = 0;
		System.out.println(s = r.indexOf("b", s));
	}

}
