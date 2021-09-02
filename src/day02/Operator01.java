package day02;

public class Operator01 {
	public static void main(String[] args) {
		
		//단항연산자
		
		//부호연산자 +,-
		int i = +3;
		int j = -i;
		
		System.out.println(j);
		System.out.println("-------------");
		
		//증감연산자 ++,--
		
		int k = 1;
		int h = ++k; // 전위연산자 - 먼저 값을 증가 시키고, 그다음에 대입
		
		System.out.println("k의값:" + k);
		System.out.println("h의값:" + h);
		System.out.println("-------------");
		
		
		int x = 1;
		int y = x++; // 후위연산자 - 먼저 값을 대입하고, 그 다음에 증가
		
		
		System.out.println("x의값:" + x);
		System.out.println("y의값:" + y);
		System.out.println("-------------");
		
		//일반적인 푷ㄴ방식
		x = 1;
		x++; //2
		++x; //3
		
		System.out.println(x);
		
		System.out.println("-------------");
		
		x=1;
		System.out.println(x++);
		System.out.println(++x);
	
		System.out.println("-------------");
		
		// 한 항에서 여러번 사용하는 경우, 증가된형태로 계산됩니다
		x = 1;
		int result = (x++) +(x++) + 10;
		//             1      2     2번째 x 가 앞에서 올라가서 2로 판정됨
		System.out.println(result); //13
	
		
		System.out.println("-------------");
		
		// 비트반전 연산자 ~
		byte a = 10; // 0000_1010
		System.out.println(~a); // 1111_0101
		System.out.println(~a+1); // -10이됨 더했을때 0이 되는수
		
		System.out.println("-------------");
		
		//논리 반전연산자! - 반대의 의미
		boolean bool = true;
		System.out.println(!bool); // false
		System.out.println(!true); // false
		System.out.println(!false); // true
		
		
	
	}
	
}
