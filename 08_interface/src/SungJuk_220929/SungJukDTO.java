package SungJuk_220929;


public class SungJukDTO { //1인분
	// 필드 : 번호(중복X), 이름, 국어, 영어, 수학, 총점, 평균
	private int no, kor, eng, math, tot;
	private double avg;
	private String name;
	
	public SungJukDTO(int no,  String name, int kor, int eng, int math) {
//		super(); //부모생성자 호출 빼버려도 됩니다.
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
		// 생성자를 쓰는 이유 : 코드의 단순화
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void calc() {
		tot = kor + eng + math;
		avg = (double)tot/3;
	}
	@Override
	public String toString() { 
		//받을때는 실수 , 정수, 문자 값으로 받았으나 출력시 String 으로
		return (no + "\t" 
				+ name + "\t" 
				+ kor + "\t" 
				+ eng + "\t" 
				+ math + "\t" 
				+ tot + "\t" 
				+ avg) ;		
	}

}
