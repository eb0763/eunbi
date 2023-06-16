package day0616;

public class OperTest_07 {
	public static void main(String[] args) {
		// 기본자료형 8개
		
		//보통 b, bool flag
		boolean  b = false;
		
		//char "안되고 '
		// 알파벳 = 1byte, 한글 2byte
		//기본적으로는 정수형, 아스키코드 -> 즉, 형변환가능
		char ch= 'A';
		
		//3. 정수형 -128 ~ 128 
		//순서 
		byte a=-128; // 1바이트 -128~127 
		short s=32000; //16bit
		int c=6700000; //32bit
		long l=1000000000L; //64bit 대문자 L 또는 소문자l로 long임을 표시함. 안붙이면 int
		
		
		//실수형
		double d=42356.434543; //64bit, 소수점
		float f=3.321432f; //32bit(4byte)뒤에 f붙임. 안붙이면 double의미
		
		//int, float는 똑같이 32bit사용하지만,
		//기본적으로 실수형이 정수형보다 큰타입으로 처리된다
		
		//출력
		System.out.println("bool="+b);
		System.err.println("ch="+(char)(ch+1));
		System.err.println("ch="+(ch+1));
		System.out.println("d="+d); //정밀도 15자리
		System.out.println("f="+f); //정밀도 8자리
		
		//전체자리수 10자리 소수점2자리
		System.out.printf("d=%10.2f \n",d);
		
		//소수점1자리
		System.out.printf("d=%.1f \n",d);
		
		System.out.printf("f=%010.3f",f);
		
		
	}
}
