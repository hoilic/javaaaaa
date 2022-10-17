package class_220923;

public class MemberMain {

	public static void main(String[] args) {
		//MemberService의 menu() 호출
		MemberService memberService = new MemberService();
		
		memberService.menu(); //호출
		
		System.out.println("프로그램을 종료합니다.");

	}

}
