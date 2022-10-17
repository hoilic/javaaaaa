package interface_220928;

//public class InterMain implements InterA, InterB{
public class InterMain implements InterC{// main 이 inter c 를  인터페이스 했다. (구현했다)
	
	public void aa() {}
	public void bb() {}
	
	public void cc() {}
	public void dd() {}

	public static void main(String[] args) {

	}

}

//클래스는 다중 상속이 안된다.
//부모가 가지고있는걸 오버라이딩 해서 사용해야한다.
//오버라이딩 하기 싫으면 자식 class 가 