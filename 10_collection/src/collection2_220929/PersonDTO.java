package collection2_220929;

public class PersonDTO implements Comparable<PersonDTO> { //Comparable이 나온 이유는 PersonDTO 객체를 sort 하려고
	private String name;
	private int age;
	
	public PersonDTO() {//ctrl + sapce 눌러서 기본생성자 만들어주세요
		
	}
	public PersonDTO(String name, int age) { //생성자
		//생성자가 생기면 기본생성자는 안생김으로 기본생성자를 만들어주라
//		super(); // super 는 있으나마나
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
	
		return "이름 = " + name + "    나이 = " + age;
	}
	@Override
	public int compareTo(PersonDTO p) {
		if(this.age < p.age) return-1; //sort 라는 함수로 전해주려고
		else if(this.age > p.age) return 1;
		else return 0;
	}
	
		


}
