package class2_220927;

import java.util.Scanner;

public class StringMain2 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String inputStr = scan.next(); //문자열 입력
		System.out.print("현재 문자열 입력 : ");
		String targetStr = scan.next(); //현재 문자열 입력
		System.out.print("바꿀 문자열 입력 : ");
		String changeStr = scan.next(); //바꿀 문자열 입력
		
		if(inputStr.length() < targetStr.length()) { //입력한 문자의 크기가 바꾸려는 문자의 크기보다 작으면 못바꿔요
			System.out.println("입력한 문자열의 크기가 작습니다");
		}else {
			inputStr = inputStr.toLowerCase(); // aA 가 들어오면 aa 로 바꿔라
			targetStr = targetStr.toLowerCase(); // aA 가 들어오면 aa 로 바꿔라
			
			int count = 0;
			int index = 0;
			
			while( (index = inputStr.indexOf(targetStr, index)) != -1) {
				//우리가 찾아서 바꾸려는 문장이 없으면 -1 로 표기된다. 즉 -1이 안되면 찾았다는 의미로 카운트 한다
				//inputStr 에 입력되는 "~~~~~" 중 바꾸고자하는 targetStr의 "@@" 의 값이 몇번째 인지 index 로 나타낸다.
				
//				String a = "aabbccaa";
//				int s = 0;
//				System.out.println(s = a.indexOf("b", s));
			
				count++;
				index = index + targetStr.length();	
				/* 바꾸고자 하는 글자가 "~~~~~~"문장중 한개일수도 있지만 여러개 있을경우
				첫번째 위치 를 index로 하고 찾은 위치에서 바꾸고자하는 글자 수만큼 더해준뒤
				또 찾아야 찾고자하는 문자에 두번째 위치 를 찾을수 있다.
				*/
			}//while
			
			System.out.println(inputStr.replace(targetStr, changeStr));
			System.out.println(count + "개 치환");
		}
		
	
//		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
//		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
//		
//		System.out.println("문자열 검색 = " + e.indexOf("짜"));
//		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));
		
	}

}

/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

indexOf()
replace()
while()
*/