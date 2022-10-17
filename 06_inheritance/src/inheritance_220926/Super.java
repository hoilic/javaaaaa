package inheritance_220926;

public class Super {
	protected double weight, height; //protected 는 나와 자식 클래스만 허용
	
	public Super() {//기본생성자
		System.out.println("Super 기본생성자");	
	
	}
	

	//weight, height 를 받는 생성자 만들기
	public Super(double weight, double height) { //public Super (인수) = 인수는 각각 표기해야합 double weight, height = X
		System.out.println("Super 생성자");
		this.weight = weight;
		this.height = height;
	}
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	
}