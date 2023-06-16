package day0616;

public class QuizDataType_10 {
	public static void main(String[] args) {
		/* 매개변수(args)를 이용하여 출력해보세요 
		 * [시험결과]
		 * Java=88, Jsp=77,Spring=99
		 * 총점: 264 점
		 * 평균: 88.00 점*/
		
		int score1 = Integer.parseInt(args[0]);
		int score2 = Integer.parseInt(args[1]);
		int score3 = Integer.parseInt(args[2]);
		
		int sum = score1+score2+score3;
		
		double avg = sum/3; //결과가 무조건 int
		double avg2=(double)sum/3; //결과가 무조건 double
		
		
		System.out.println("[시험결과]");
		System.out.printf("Java=%d, Jsp=%d, Spring=%d\n",score1,score2,score3);
		System.out.println("총점: "+sum+" 점");
		System.out.printf("평균: %.2f 점",avg2);


	}
}
