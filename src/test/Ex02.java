package test;

import java.util.Scanner;

/*
 * 1 ���� 10������ ������ �� 10���� �迭 �� �Է¹޾� ���� ��ŭ * �� ����ϱ�
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
