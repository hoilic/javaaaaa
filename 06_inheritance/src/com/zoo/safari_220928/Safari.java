package com.zoo.safari_220928;

import com.zoo_220928.Zoo;

public class Safari extends Zoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.tiger();
//		zoo.giraffe();
//		zoo.elephant();
//		zoo.lion();
		
		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe(); //다른패키지 자식 클래스
//		safari.elephant();
//		safari.lion();
		
		}

}
