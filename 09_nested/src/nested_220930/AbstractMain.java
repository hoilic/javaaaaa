package nested_220930;

public class AbstractMain implements InterA  {
	
	public void aa() {}
	public void bb() {}

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {//익명 Inner 클래스, {} 흑기사를 생성 new 시켜 버림
			
			@Override
			public void setName(String name) {
				this.name = name;
			}
		};

//		InterA ia = new InterA(); // interface 는 절대 new 할수 없다.
		InterA ia = new InterA() { // {} 흑기사를 생성 new 시켜 버림, /익명 Inner 클래스
			public void aa() {}
			public void bb() {}
		};
		AbstractExam ae = new AbstractExam() {
			//추상메소드가 없기 때문에 원하는 메소드를 골라서 Override
		};
		
	}

}
