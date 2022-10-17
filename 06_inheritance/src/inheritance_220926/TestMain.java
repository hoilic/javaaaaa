package inheritance_220926;

	class AA{
		public int a =3;
		public void disp() {
			a +=5;
			System.out.println("AA : "+ a + " ");
		}
	}//class AA
	
//---------------
	class BB extends AA{
		public int a =8;
		public void disp() {
			this.a += 5;;
			System.out.println("BB : "+ a + " ");
		}
	}
//---------------
	public class TestMain {
		
		public static void main(String[] args) {
			BB aa = new BB();
			aa.disp(); //BB : 13
			System.out.println("aa : " + aa.a); //13
			System.out.println();
			
			AA bb = new BB(); //부모 = 자식
			bb.disp(); // BB : 13
			System.out.println("bb : " + bb.a); //3
			//bb 라는 객체 값이 클래스 AA 의 주소를 가지고 있다.
			System.out.println();
			
			BB dd = (BB)bb; //자식 = (자식) 부모
			dd.disp();
			System.out.println("dd : " + dd.a); //18
			System.out.println();
			
			AA cc = new AA(); //부모 = 자식
			cc.disp(); // BB : 13
			System.out.println("cc : " + cc.a); //8
			System.out.println();
		}
}
