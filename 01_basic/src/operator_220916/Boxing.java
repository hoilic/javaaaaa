package operator_220916;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double) a / 3; //Casting (강제형변환)
		
		String c = "25";
		int d = Integer.parseInt(c); // String 이 객체형이기 때문에 Integer라는 클래스가 와서 casting 해야 한다.
		
		//AutoBoxing
		int e = 5; //기본형
		
		Integer f = e; // AutoBoxing - Integer 와 int 는 같은 형
		//Integer g = new Integer(e); //JDK 5.0 이전
		
		Integer h = 5;
		int i = h; //unAutoBoxing
		//int j = h.intValue(); //JDK 5.0 이전
		
		
		System.out.println(c);
		
		

	}

}
