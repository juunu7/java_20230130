package main1;

import java.util.Scanner;
//문자열
public class Main3 {
	public static void main(String[] args) {
		
		// import안함, java.lang.*
		// 클래스명 객체명 = new 클래스명 (준비물);
        String str = new String("hello world");
        String str1 = "hellow world";
       
        // ret[0] = hello
        // ret[1] = world
        String[] ret = str.split(" "); // 원하는 기준 문자로 분할하기
        System.out.println(ret[0]);
        System.out.println(ret[1]);
        
        System.out.println(str);
        System.out.println(str1);
        // String 클래의 기능중에서 substring를 사용한 경우
        System.out.println(str.substring(0, 3) ); // hel
	}

}
