package chap5;

import java.util.Scanner;

/*
 * 금액을 입력받아서  최소개의 동전으로 바꿔주는 프로그램 구현하기
 * 
 * 동전의 종류 : 500,100,50,10,5,1
 * 
 * [예1]
 * 3600
 * 500동전 : 7개
 * 100동전 : 1개
 * ..       
 */
public class ArrayEx9 {
	public static void main(String[] args) {
		int coin[] = {500,100,50,10,5,1};
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scan.nextInt();
		for(int c : coin) {
			System.out.println(c + "원 :" + money/c + "개");
			money %= c;
		}
	}
}
