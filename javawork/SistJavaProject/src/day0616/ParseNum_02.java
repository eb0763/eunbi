package day0616;

public class ParseNum_02 {
	public static void main(String[] args) {
		
		// String -> int 형변환 
		// Integer.parseInt 
		// Double.parseDouble("12.23"); 문자열 -> 실수타입 반환
		
		String num1 ="10";
		String num2 ="20";
		
		
		System.out.println("두 수 더하기 : "+(num1+num2));
	
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		System.out.println("두 수 더하기 : "+(n1+n2));

	}
}
