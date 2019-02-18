package chap5;

import java.util.Scanner;

/*
 * 홀수개의 배열의 크기를 입력받아 matirx(2차원배열)를 생성하고 * 문자를 이용하여 모래시계 출력하기
 * 
 * [결과]
     배열의 크기를 홀수로 입력하세요
   5
     *****
      *** 
       *  
      *** 
     *****
 */
public class ArrayEx17 {
	public static void main(String[] args) {
		System.out.println("배열의 크기를 홀수로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		char[][] matrix = new char[size][size];
		for(int i=0;i<=matrix.length/2;i++) {
			for(int j=i;j<matrix.length-i;j++) {
				matrix[i][j] = '*';
			}
		}
		for(int i = matrix.length/2+1;i<matrix.length;i++) {
			for(int j=matrix.length-1-i;j<=i;j++) {
				matrix[i][j] = '*';
			}
		}
		//matrix 출력하기
		for(int i=0;i < matrix.length;i++) {
			for(int j=0; j< matrix[i].length;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}