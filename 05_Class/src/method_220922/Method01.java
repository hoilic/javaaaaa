package method_220922;

public class Method01 {

	public static void main(String[] args) {
		int a=25, b=36;	 // 지역 변수, local variable
		Method01 m = new Method01();// Method01 이라는 클래스에 m이라는 객체 생성
		
		int sum = m.sum2(25,  36); //호출 m이라는 개체에 sum2 메소드에 인수값 25,36 을 입력, a, b 로 넣어도 된다.
		int sub = m.sub2(25,  36);
		int mul = m.mul2(25,  36);
		double div = m.div2(25,  36);
		
		System.out.println(a + "+" + b + "=" + sum);
		System.out.println(a + "-" + b + "=" + sub);
		System.out.println(a + "*" + b + "=" + mul);
		System.out.println(a + "/" + b + "=" + String.format("%.2f", div));

	}
	
	public int sum2(int a, int b){// 구현 , 인수(argument), 매개변수(parameter)		
		return a+b; //return 은 반환한다, 돌려준다 라는 의미
		//public 은 모두에게 공개한다는 의미
		//static 이 없으면 new 를 만들어 줘야한다.
	}
	public int sub2(int a, int b){
		return a-b; 
	}
	public int mul2(int a, int b){
		return a*b; 
	}
	public double div2(int a, int b){
		return (double)a/b; 
	}
}
