package day0616;

public class ParseArgs_04 {
	public static void main(String[] args) {

		
		String sangName=args[0];
		
		
		int su=Integer.parseInt(args[1]);
		int dan=Integer.parseInt(args[2]);
		int total=su*dan;
		
		System.out.println("*[상품정보]");
		System.out.println("* 상품명: "+sangName);
		System.out.println("* 수량: "+su);
		System.out.println("* 단가: "+dan);
		System.out.println("* 총 금액 : "+total);

	}
}
