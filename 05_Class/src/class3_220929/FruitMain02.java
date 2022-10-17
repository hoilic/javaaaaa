package class3_220929;
//배열로 하는 경우
class Fruit2{
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar; //공유 변수!
	
	public Fruit2(String pum, int jan, int feb, int mar) {//생성자 생성, 생성자는 절대 void 붙이지 말것
		// argument(인수) parameter = 함수 괄호 안에 있는 애들은 개별단위로 선언, (묶어서 선언하면 안됩니다.)
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		this.tot = tot;
	}
	public void calcTot() {
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

public class FruitMain02 {

	public static void main(String[] args) {
		Fruit2[] ar = {
				new Fruit2("사과", 100, 80, 75),
				new Fruit2("포도", 30, 25, 10),
				new Fruit2("딸기", 25, 30, 90) 
				};
		
		System.out.println("--------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("--------------------");
		for(int i=0; i<ar.length; i++) {
			ar[i].calcTot();
			ar[i].disp();
	
		}
		Fruit2.output();
	}
		

	}


