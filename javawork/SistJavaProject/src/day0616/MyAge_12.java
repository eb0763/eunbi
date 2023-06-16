package day0616;

import java.util.Calendar;

public class MyAge_12 {
	public static void main(String[] args) {
		// 매개변수 args에서 실행시 이름과 태어난 연도를 보낸후 출력하세요(name, myBirth)
		// 이름: 이민규
		// 태어난 연도: 1995년도
		// 나이: 28세
		
		//현재년도는 Calendar import
		
		Calendar c = Calendar.getInstance();
		
		String name = args[0];
		int myBirth = Integer.parseInt(args[1]);
		
		System.out.println("이름: "+name);
		System.out.println("태어난 연도: "+myBirth+"년도");
		System.out.println("나이: "+ ((c.get(c.YEAR))-myBirth));
	}
}
