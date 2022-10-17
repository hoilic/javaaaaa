package class_220922;

public class SungJukMain_h {

	public static void main(String[] args) {
		SungJuk_h aa = new SungJuk_h(); // SungJuk_h 클래스를 생성하고 그 이름을 aa 라고 한다.
		
		aa.setData("홍길동", 90, 100, 90);//setData 메소드를 호출
		aa.calc(); //calc 라는 메소드 호출
		
		System.out.println("----------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점\t");
		System.out.print(
				aa.getName() + "\t" +
				aa.getKor() + "\t" +
				aa.getEng() + "\t" +
				aa.getMath() + "\t" +
				aa.getTot() + "\t" +
				String.format("%.2f",aa.getAvg() ) + "\t" +
				aa.getGrade()
				);
		

	}

}
