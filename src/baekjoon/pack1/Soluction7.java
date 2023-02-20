package baekjoon.pack1;

import java.util.Scanner;

/**
 * Question : 코딩은 체육과목 입니다
 * Writer : Kyudong
 * Date : 2023-02-20
 * Time : 오후 10:22
 */
public class Soluction7 {

//	public static void main(String[] args) throws Exception {
//		Scanner scanner = new Scanner(System.in);
//
//		int number = scanner.nextInt() / 4;
//		for (int i = 0; i < number; i++) {
//			System.out.print("long ");
//		}
//
//		System.out.print("int");
//	}

	// 자바의 String.repeat를 이용한 방법
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt() / 4;
		System.out.print("long ".repeat(number) + "int");
	}

}
