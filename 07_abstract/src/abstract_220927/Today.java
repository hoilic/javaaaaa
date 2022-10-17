package abstract_220927;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException{
		Date date = new Date();
		System.out.println("오늘 날짜 : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : "+ sdf.format(date));
		System.out.println();
		
		//내 생일 - 1992 09 13 02:30:01 입력
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19920913023001"); //String 을 Data 로 변환
		
		System.out.println("내 생일 : " + birth);
		System.out.println("내 생일 : " + sdf.format(birth));
		
//		Calendar cal = new Calendar(); - error , 추상클래스 라서 안됨
//		Calendar cal = new GregorianCalendar();//sub Class 이용하여 생성
		//기준을 캐나다로 변경
//		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada / Pacific")); 
		
		Calendar cal = Calendar.getInstance();//메소드를 이용하여 생성
//		int year = cal.get(1);
		int year = cal.get(Calendar.YEAR); // == int year = cal.get(1);
		int month = cal.get(Calendar.MONTH)+1;//10월 을 가져와서 입력하면 9로 되서 표기하기 위해 +1을 한거고
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); //일-1, 월-2, 화-3 .... 토-7
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String dayOfWeek = null;
		switch(week){
			case 1 : dayOfWeek="일"; break;
			case 2 : dayOfWeek="월"; break;
			case 3 : dayOfWeek="화"; break;
			case 4 : dayOfWeek="수"; break;
			case 5 : dayOfWeek="목"; break;
			case 6 : dayOfWeek="금"; break;
			case 7 : dayOfWeek="토";
		}
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+dayOfWeek+"요일"
				+ hour + ":" + minute + ":" + second);

	}

}
