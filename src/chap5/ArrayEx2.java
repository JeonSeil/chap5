package chap5;

import java.util.Scanner;

/*
 * ȭ�鿡�� ������ 10 �Է� �޾Ƽ� score �迭�� �����ϰ�, ������ �հ�� ���, �ִ� ������ ����ϱ� 
 */
public class ArrayEx2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		System.out.println("10���� ������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int sum=0,max=0;
		for(int i=0;i<score.length;i++) {
			score[i] = scan.nextInt();
			sum +=score[i];
			if(max < score[i]) {
				max = score[i];
			}
		}
		System.out.println("���� �հ�:" + sum
				         + ", ���:" + (double)sum/score.length 
				         + ", �ִ� ����:" + max);
	}
}
