package day02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {

		// 1. 스캐너 생성
		Scanner scan = new Scanner(System.in);

		System.out.print("이름>"); // print 는 가로로 나옴 println은 줄 바뀜
		String name = scan.next(); // 어떤값을 받아들이겠다는 의미? 더불어 이 3줄이 문자열 기본

		System.out.print("나이>"); // 정수 Int
		int age = scan.nextInt(); // 정수

		System.out.print("키>");
		double cm = scan.nextDouble(); // 실수

		System.out.println("이름:" + name + ", 나이: " + age + ", 키: " + cm);

		// 2. 스캐너 자원 반납 -> 다시 스캐너를 재사용 불가
		scan.close();

	}

}
