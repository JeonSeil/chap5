package chap5;

import java.util.Scanner;

/*
 * Ȧ������ �迭�� ũ�⸦ �Է¹޾� matirx(2�����迭)�� �����ϰ� * ���ڸ� �̿��Ͽ� �𷡽ð� ����ϱ�
 * 
 * [���]
     �迭�� ũ�⸦ Ȧ���� �Է��ϼ���
   5
     *****
      *** 
       *  
      *** 
     *****
 */
public class ArrayEx17 {
	public static void main(String[] args) {
		System.out.println("�迭�� ũ�⸦ Ȧ���� �Է��ϼ���");
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
		//matrix ����ϱ�
		for(int i=0;i < matrix.length;i++) {
			for(int j=0; j< matrix[i].length;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}