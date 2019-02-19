package test;

import java.util.Scanner;

/*
�ﰢ���� ���� n�� ���� m�� �Է¹��� �� ������ ���� �ﰢ�� ���·� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� 1                  ���� 2             ���� 3
 *                    *****                *
 **                   ****                ***
 ***                  ***                *****
 ****                 **                *******
 *****                *                *********

�ﰢ���� ũ�� n(n�� ������ 100 ������ �ڿ���)�� ���� m
(m�� 1���� 3������ �ڿ���)�� �Է¹޴´�
 */
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� Ȧ�� ���̿� ������ �Է��ϼ��� (3 2)");
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
