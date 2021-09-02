package day02;

public class OpreatorCondition {
	public static void main(String[] args) {

		// 프로그램에서 랜덤한 숫자를 출력하는 것은 유용하게 많이 사용됩니다.
		// System.out.println( Math.random() ); // 0~1미만 double형 랜덤값

		// 1~10까지 랜덤값
//		double d = Math.random() * 10;
//		int result = (int)d;
//		System.out.println(result);

		int result = (int) (Math.random() * 10) + 1;
		System.out.println(result);

		// 3의 배수인지 판별?
		// 현재 3항연산식이 문자열이라 String을 사용
		String ran = result % 3 == 0 ? "3의배수입니다" : "3의배수가 아닙니다";
		System.out.println(ran);

	}

}
