package day02;

public class Operator03 {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		// 소괄호가 true면 if중괄호를 실행, false라면 else문을 실행
		// false & true = false &둘다 true일때 true 아니면 false
		// & 가 1개 일때랑 2개일대 차이?
		if (x != 10 && ++y == 21) { // 두개짜리 연산자는 만족할 수 없는 조건일때 뒤를 실행하지 않는다.
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}

		System.out.println("x값:" + x  + ", y값:" + y);
		
		
		// true | false = true
		// | 가 1개 일때랑 2개일대 차이? 2개짜리쓰면 뒤에가 실행이 안된다.
		if( x == 10 || ++y == 21) {
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
		
		System.out.println("x값:" + x  + ", y값:" + y);
		
		
	}
}
