package day0616;

public class DataType_08 {
	public static void main(String[] args) {
		
		byte a=127; //-128~127
		byte b = (byte)128; // 더작은 자료형으로의 변환(디모션_값손실)
		
		System.out.println("a="+a+" b="+b);
		
		//결과 : a=127, b=-128
		//원통형이기때문에 값이 이렇게 바뀜 
		
		
		
		
		int x=7, y=4;
		
		System.out.println((double)x/y);
		//계산시 x를 double로 변환해서 계산: 결과는 double 
		//y를 변환해도 결과값은 동일 
		
		
		
		//강제형변환
		
		double d=100.0;
		int i=100;
		
		int result = (int)d+i;
		double result2= i;
		
		//큰자료형->작은 X
		//작은->큰 O
		
		System.out.println(d);
		System.out.println(i);
		System.out.println(result);
		
	}
}
