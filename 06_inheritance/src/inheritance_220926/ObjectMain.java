package inheritance_220926;

class Test extends Object{ //자바의 모든 클래스는 Object로 부터 상속받는다.
	
	@Override
	public String toString() {
		return getClass()+"개바부";
	}
	
}
//---------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test(); //new 를 했기에 주소의 값을 던져 준다. 객체는 주소의 값을 갖는다(형식 : 클@16진수)
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString()); //.toString() 생략된것으로 써도되고 안써도됨
		System.out.println("객체 t = " + t.hashCode()); //10진수로 변환됨
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str);
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa == bb : " + (aa == bb)); //주소가 같나요? - false
		System.out.println("aa.equals(bb) : " + aa.equals(bb)); // 문자열 - true
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc == dd : " + (cc == dd)); //주소 같나요? - false
		System.out.println("cc.equals(dd) : " + cc.equals(dd)); //주소 같나요? - false
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("cc == dd : " + (ee == ff)); //주소 같나요? - false
		System.out.println("cc.equals(dd) : " + ee.equals(ff)); //문자열 - true
		System.out.println();
		
		
	}
}

/*
 Class Object{
  	public boolean equals(Object) //참조값(주소) 비교
 	public String toString() //클@16진수
 	public String hashCode() //10진수
 }
 
  Class Test extends Object{
 	public String toString() //개바부
 }
 
   Class String extends Object{
 	public String toString() //문자열
 	public int hashCode() // 문자열을 10진수로 변환, 표현할수있는 문자열은 무한하므로 10진수로 다 표현할수 없다.
 	public boolean equals(Object) //문자열 비교
 }
 
 */
