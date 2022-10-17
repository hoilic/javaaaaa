package inheritance2_220928;

enum Color{ //enum 은 상수들을 정의해놓은것
	RED, GREEN, BLUE
}

class Final{
	public final String FRUIT = "사과";
	public final String FRUIT2; 	
	
	public Final() { // 생성자
		FRUIT2 = "딸기"; //객체 초기화는 생성자에서
	}
	
	public static final String ANIMAL = "사자"; //상수는 static final 을 건다.
	public static final String ANIMAL2;//static 은 절대 생성자에서 초기화를 못한다.
	
	static {//static 은 초기화 영역을 따로 잡아야 한다.
		ANIMAL2 = "기린";
	}
	
//	public static final int RED = 0;
//	public static final int GREEN = 1;
//	public static final int BLUE = 2;
	

	
}

//--------------------
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 10; //final 상수는 바꿀수 없다.
//		AGE++; // - erroe 바꿀수 없기에 에러가 뜬다 
		System.out.println("AGE = " + AGE);
		
		final int AGE2; // 초기 값도 안준 상태, garbage 값을 가지고 있음
		AGE2 = 20; // 값을 주는 한번의 기회를 더 준다.
//		AGE2 = 30; // - error 기회는 한번만
		System.out.println("AGE2 = " + AGE2);
		
		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT); 
		// Final 클래스에 있는 FRUIT의 값을 가져와야함. f. 은 메인클래스가 아닌 Final 에서 가져오기 위함
		System.out.println("FRUIT2 = " + f.FRUIT2); 
		System.out.println();
		
		System.out.println("ANIMAL = " + f.ANIMAL); 
		System.out.println("ANIMAL2 = " + f.ANIMAL2); 
		System.out.println();

//		System.out.println("빨강 = " + Color.RED); 
//		System.out.println("빨강 = " + Color.RED.ordinal()); 
//		System.out.println("초록 = " + Color.GREEN); 
//		System.out.println("파랑 = " + Color.BLUE); 
		
		for(Color data : Color.values()) { //Color 안에 있는 정보를 하나씩 전달
			System.out.print(data + " : ");
			System.out.println(data.ordinal()); // enum 안에 들어간게 0,1,2 순서대로 나온다.
			
		}
		 
	}

}
