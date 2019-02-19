package test;

import java.util.Scanner;

/*
삼각형의 높이 n과 종류 m을 입력받은 후 다음과 같은 삼각형 형태로 출력하는 프로그램을 작성하시오.

종류 1                  종류 2             종류 3
 *                    *****                *
 **                   ****                ***
 ***                  ***                *****
 ****                 **                *******
 *****                *                *********

삼각형의 크기 n(n의 범위는 100 이하의 자연수)과 종류 m
(m은 1부터 3사이의 자연수)을 입력받는다
 */
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 홀수 높이와 종류를 입력하세요 (3 2)");
		int len = scan.nextInt();
		int type = scan.nextInt();
		int maxcnt = len * 2 - 1;
		char[][] triangle = new char[len][maxcnt];
		switch (type) {
		case 1:
			for (int i = 0; i < len; i++) {
				for (int j = 0; j <= i; j++) {
					triangle[i][j] = '*';
				}
			}
			break;
		case 2:
			for (int i = len - 1; i >= 0; i--) {
				for (int j = 0; j < len - i; j++) {
					triangle[i][j] = '*';
				}
			}
			break;
		case 3:
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < maxcnt; j++) {
					if (j >= (maxcnt / 2 - i) && j <= (maxcnt / 2 + i))
						triangle[i][j] = '*';
				}
			}
			break;
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < maxcnt; j++) {
				System.out.print(triangle[i][j]);
			}
			System.out.println();
		}
	}
}
