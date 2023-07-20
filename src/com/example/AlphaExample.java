package com.example;     //어느 팩캐지에 있는 것을 안내해줌

import util.Color;
import util.VT100;
import java.util.Scanner;

public class AlphaExample {
	public static void main(String[] args) {
		VT100.clearScreen();       // import로 util.을 생략할 수 있다
		VT100.cursorMove(10, 10);
//		VT100.setForeground(30);            
		VT100.setForeground(Color.Green);
//		VT100.setBackground(45);
		VT100.setForeground(Color.Blue);
		System.out.println("Hello");
		
		VT100.cursorMove(13, 5);
		VT100.setForeground(32);
		VT100.setBackground(40);
		System.out.println("World");
		
		VT100.reset();
	}
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("com.example.AlphaExample입니다");
		util.VT100.clearScreen();
		java.util.Scanner scan = new java.util.Scanner(System.in);    //길어서 이렇게는 안씀
		Scanner scan2 = new java.util.Scanner(System.in);             // import로 줄일 수 있다
	}

}
