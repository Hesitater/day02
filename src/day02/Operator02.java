package day02;

public class Operator02 {
	public static void main(String[] args) {
		
		//산술연산자
		int i = 7 / 3; //2
		int j = 7 % 3; //1
		int k = 7 * 3; //21
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		
		//비교연산자
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i > j);
		System.out.println(i <= j);
		System.out.println(k % 2 == 0); //짝수 false
		System.out.println(k % 2 !=1);
		
		
		//비트연산자
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		System.out.println(a & b); // 0000 0001 -> 두 비트값이 1이면 1
		System.out.println(a | b); // 0000 0111 -> 두 비트값중 하나만 1이여도 1
		System.out.println(a ^ b); // 0000 0110 -> 다르면 1 같으면 0
		
		// 비트 쉬프트
		int c = 192;
		System.out.println( c >> 3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
