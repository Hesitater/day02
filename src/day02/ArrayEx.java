package day02;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		// 1. 배열의 선언
		int[] arr;
		
		// 2. 배열의 생성 - 배열을 생성시에 크기를 지정
		arr = new int[5];
		System.out.println(arr); //배열의 주사값(0번째 상자가  만들어진 위치) 그냥 16진수 이상한 수나옴
		
		// 3. 배열의 초기화
//		arr[인덱스번호] = 34; <- ex
		
		arr [0] = 34;
		arr [1] = 100;
		arr [2] = 300;
		arr [3] = 56;
		arr [4] = 1;
		
		// 4. 배열의 사용
		System.out.println("배열의 첫번째 값:" + arr[0]);
		arr[0] = 50;
		System.out.println("배열의 첫번째 값:" + arr[0]);
	
		System.out.println("-------------------------------");
		
		//일단 외워 
		//5. 배열의 저장된 값을 한눈에 문자열의 형태로 확인. 
		System.out.println( Arrays.toString(arr) );  //이건 외워
		
		//6. 배열의 길이를 확인하는 명렬 배열명.length
		System.out.println("배열의길이: " + arr.length);
		System.out.println("배열의마지막 " + arr[ arr.length-1] );
		
		
		// 7. 배열의 선언과 생성을 동시에  1,2 같이
		byte[] arr2 = new byte[7];  //반을 가르고 비슷하게 맞아떨어지면..?
				
		// 8. 배열의 선언과 생성, 초기화를 동시에  /2개있으나 일단 하나
		// {}를 이용하여
		int[] arr3 = {1,2,3,4,5,};
		System.out.println( Arrays.toString(arr3) );
		
				
		// 9. 배열의 초기값을 지정하지 않으면 기본값으로 자동초기화 0, 0.0 , null (int,double, String)
		System.out.println( Arrays.toString(arr2) );
		
		System.out.println("-------------------------------");


//문제	// 1-1 문자열(String)배열에 월요일 화요일 수요일 저장하고 출력.
		
		// 1-2 3개의 크기, int배열을 생성하고, 각각 랜덤값을 저장하고 출력.
		
		// 1- 1내가한값
		String[] str = new String[3];
		str[0] = "월요일";
		str[1] = "화요일";
		str[2] = "수요일";
		
		System.out.println( Arrays.toString(str));
				
		// 1-1 한번에?
		String[] str2 = {"월요일","화요일","수요일"};
		System.out.println( Arrays.toString(str2));
		
		//선생님이
		String[] sArr = {"월요일", "화요일", "수요일"};
		System.out.println( Arrays.toString(sArr) );
		
		
		int[] iArr = new int[3];
		iArr[0] =(int)(Math.random()* 10 );
		iArr[1] =(int)(Math.random()* 10 );
		iArr[2] =(int)(Math.random()* 10 );
		
		System.out.println( Arrays.toString(iArr) );
		
		//내가 생각해본거..?
		int[] iArr2 = {(int)(Math.random()* 10) ,(int)(Math.random()* 10) ,(int)(Math.random()* 10) };
		System.out.println( Arrays.toString(iArr2) );
		
	
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
