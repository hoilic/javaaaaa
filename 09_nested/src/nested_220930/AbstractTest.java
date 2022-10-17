package nested_220930;

public abstract class AbstractTest { // 추상 메소드면 클래스도 추상 클래스로!
	// private 하는걸 캡슐화, 기본적으로 Object 에게 상속 받음 => 이러한 기본형식을 POJO 형식이라 한다!
	String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name); // 추상메소드, 추상메소드 면 키워드(ex.abstract) 를 내놔라
	

}
