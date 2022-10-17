package class3_220929;

class Fruit{
	private String pum; //필드 변수 선언
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar; //공유 변수!
	
	public Fruit(String pum, int jan, int feb, int mar) {//생성자 생성, 생성자는 절대 void 붙이지 말것
		// argument(인수) parameter = 함수 괄호 안에 있는 애들은 개별단위로 선언, (묶어서 선언하면 안됩니다.)
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		this.tot = tot;
	}
	public void calcTot() { // 메소드 
		tot = jan + feb + mar;
		
		sumJan += jan; //sumJan = sumJan + jan;
		sumFeb += feb; 
		sumMar += mar; 		
	}
	public void disp() {
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
	}
	public static void output() { //공유 변수!
		System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
}

//---------------
public class FruitMain {

	public static void main(String[] args) {
	
		Fruit apple = new Fruit("사과", 100, 80, 75);
		Fruit grape = new Fruit("포도", 30, 25, 10);
		Fruit straw = new Fruit("딸기", 25, 30, 90);
		
		apple.calcTot();
		grape.calcTot();
		straw.calcTot();
		
		System.out.println("--------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("--------------------");
		
		apple.disp();
		grape.disp();
		straw.disp();
		System.out.println();
		Fruit.output();

	}
}
/* static 문제
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자
calcTot()
display()
output() - static


클래스 : FruitMain


[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
        xxx   xxx   xxx            output()로 처리
*/