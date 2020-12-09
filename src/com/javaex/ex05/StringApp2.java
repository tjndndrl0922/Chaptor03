package com.javaex.ex05;

public class StringApp2 {
	
	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//concat()
		System.out.println(a.concat(b));
		System.out.println(a); // 변하지 않음
		
		a = a.concat(b);
		System.out.println(a);
		
		//trim()
		a = a.trim();
		System.out.println(a);
		System.out.println("__"+a+"__"); //뒤 공백 확인용
		
		a = a.replace("ab", "12,");
		System.out.println(a);
		
		System.out.println("==================================");
		String[] sArr = a.split(",");
		for(int i=0;i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		String str = "hello java";
		String result = str.substring(3); //(n)방부터 끝까지 출력
		System.out.println(result);
		System.out.println(str);
		
		String result02 = str.substring(3, 6); //(n)방부터 (,n)방 전까지 //뒤에 n 포함안됌.
		System.out.println(result02);
		
		char c = str.charAt(0); 
		System.out.println(c);
		
		String c2 = str.substring(0,1);
		System.out.println(c2);
		
	}

}
