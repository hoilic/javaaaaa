package class_220923;

//1인분

public class MemberDTO {
	private String name; // 이름
	private int age; // 나이
	private String phone; // 핸드폰
	private String address; // 주소
	
	public MemberDTO(String name, int age, String phone, String address) {
		// void 가 없으면 생성자다! 
		// 생성자명은 클래스명과 동일해야한다!
		// MemberDTO 메소드는 변수 4개를 받아야 실행된다.
		this.name =name;
		this.age = age;
		this.phone = phone;
		this.address = address;	
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;	
	}
	
	@Override // 원래 있는 메소드에 덮어씌운다.
	// toString 의 원래 메소드에 다른 내용의 형식을 덮어 씌우는 과정
	public String toString() {
		return name+"\t"+age+"\t"+phone+"\t"+address;
	}


}


/*
클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오

[실행결과]
menu()
*************
   1. 가입 
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 

[1번 경우]
insert()
5명의 정원이 꽉 찼습니다...//5명이 꽉 차면 
----------------------
이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

1 row created
xx자리 남았습니다

[2번 경우] //if
list()
이름   나이   핸드폰      주소

[3번 경우]
update()
핸드폰 번호 입력 : 010-123-1234
홍길동   25   xxx   xxx

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 : 

1 row(s) updated
--------------------
핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 : 
1 row deleted

핸드폰 번호 입력 : 
찾는 회원이 없습니다
*/