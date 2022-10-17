package class_220923;

public class Compute {
	private int x,y,sum,sub,mul; //필드, 초기화, null
	private double div; 
	
	public void setX(int x) { //구현
		this.x = x;	//this는 필드 값과 같다라고 표기하기 위한부분			
	}
	public void setY(int y) { //구현
		this.y = y;				
	}
	
	public void calc(){ //calc 라는 메소드 구현
		sum = x + y ;
		sub = x - y ;
		mul = x * y ;
		div = (double)x/y ;	
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getSum(){
		return sum;
	}
	public int getSub(){
		return sub;
	}
	public int getMul(){
		return mul;
	}
	public double getDiv(){
		return div;
	}
	




}
/*
객체배열을 이용하여 작성하시오
데이터는 키보드로부터 입력 받으세요

클래스명 : Compute
필드 : int x,y,sum,sub,mul
       double div
메소드 : setX(~)
       setY(~)
       calc() - 합차곱몫을 계산
       getX()
       getY()
       getSum()
       getSub()
       getMul()
       getDiv()

클래스명 : ComputeMain

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X      Y      SUM      SUB      MUL      DIV
320      258
256      125
452      365
*/