package test;

import java.util.Scanner;

/*
 * 1 부터 10까지의 임의의 수 10개를 배열 에 입력받아 숫자 만큼 * 를 출력하기
 */
public class Ex02 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(((arr[i]<10)?" ":"") + arr[i] + ": ");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
