package day0616;

public class ParseIntArgs_03 {
	public static void main(String[] args) {

		// args로 파라미터 입력받아 형변환 
		// Run Configurations

		int n1=Integer.parseInt(args[1]);
		int n2=Integer.parseInt(args[2]);
		
		System.out.println("* 결과출력");
		System.out.println("* 내 이름은 "+args[0]);
		System.out.println("* 자바점수는 "+args[1]);
		System.out.println("* 오라클점수는 "+args[2]);
		System.out.println("* 두 수 더하기 : "+(n1+n2));

	}
}
