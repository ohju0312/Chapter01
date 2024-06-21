package com.javaex.ex02;

//클래스
public class Ex01 {

	//메소드
	public static void main(String[] args) {
		
		System.out.println("안녕");
		System.out.println("하세요");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("----------");
	
		int i=2345;
		double d=3.14;
		char c ='한'; //실제값을 가지고 있다
		
		String s ="한"; //주소를 가지고있다
		String str ="굿모닝";
		String name ="오주현";
		
		System.out.println(c);
		System.out.println(str+name+str);
		System.out.println(i +i);
		System.out.println(i +d);
		System.out.println(str+ i);
		
		String str2 = str+ i;
				
		
		//굿모닝랑오주현   str랑name
 		System.out.println(str+"랑"+name);
		
 		//굿모닝 오주현
 		System.out.println(str+""+name);
 		
 		//제이름은 오주현입니다
 		System.out.println("제이름은"+name+"입니다");
 		
 		//char형은+연산자가 더하기로 계산됨
 		System.out.println(c);
 		System.out.println(c+c);
 		
 		System.out.println("--------");
 		
 		//제이름은 "오주현"입니다

 		System.out.println("제이름은\""+ name +"\" 입니다." );
 		//제이름은 \오주현\ 입니다.
 		System.out.println("제이름은\\"+ name +"\\입니다." );
 		System.out.println("제이름은"+ name +"입니다." );
 		// 제이름은    오주현   입니다.
 		
 		// 제이름은 
 		// 오주현 입니다.
 		System.out.println("제이름은\n"+ name+"입니다.");
 		
 		
	}	

}
