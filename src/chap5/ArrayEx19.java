package chap5;

import java.util.Scanner;

public class ArrayEx19 {
	public static void main(String[] args) {
		System.out.println("배열의 크기를 홀수로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[][] matrix = new int[size][size];
		int data = 0;
		for(int i=1;i<=size;i+=2) {
			data += i;
		}
		data *=2;
		data--;
		for(int i=0;i<=matrix.length/2;i++) {
			for(int j=i;j<matrix.length-i;j++) {
				matrix[i][j] = data--;
			}
		}
		for(int i = matrix.length/2+1;i<matrix.length;i++) {
			for(int j=matrix.length-1-i;j<=i;j++) {
				matrix[i][j] = data--;
			}
		}
		//matrix 출력하기
		for(int i=0;i < matrix.length;i++) {
			for(int j=0; j< matrix[i].length;j++) {
				System.out.print(((matrix[i][j]==0)?" ":matrix[i][j])+"\t");
			}
			System.out.println();
		}
		
	}
}
