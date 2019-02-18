package chap5;
/*
 * 5�� �л��� ����,����,���� ������ �л��� ����, ����� ����ϰ� ���� ������ ����ϱ�
 * 
 * [���]
 *          ����    ����   ����   ����   ���
 * 1���л� :  100   80   90  270  90.0
 * ...
 * ===================================
 *  ��������     450  370 
 */
public class ArrayEx15 {
	public static void main(String[] args) {
		int[][] score = {{100,80,90},{80,80,70},{80,75,90},{90,75,95},{100,60,75}};
		int total[] = new int[3];
		System.out.println("\t����\t����\t����\t����\t���");
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"���л�:");
			int sum = 0;
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
				total[j] += score[i][j];
			}
			System.out.println(sum + "\t" + (double)sum/score[i].length);
		}
		System.out.print("��������:\t");
		for(int t : total) {
			System.out.print(t + "\t");
		}
		System.out.println();
	}
}
