package chap5;

import java.util.Arrays;

/*
 * �迭�� ����
 * 1. for ������ �̿��Ͽ� �ϳ��� ����
 * 2. System.arrayCopy() �޼��带 �̿��ϱ�
 * 3. Arrays Ŭ���� �̿�
 */
public class ArrayEx23 {
	public static void main(String[] args) {
		//1 for ������ �̿��Ͽ� �ϳ��� ����
		int score[] = {90,80,70};
		int score2[] = new int[5];
		for(int i=0;i<score.length;i++) {
			score2[i] = score[i];
		}
		//2. System.arrayCopy() �޼��带 �̿��ϱ�
		score2 = new int[5];
		/*
           (�����迭, �����迭�� ���� �����ε���, ����迭, ��������ε���, ����� ����)
           score   = 90 80 70
           score2  =  0  90 80 70  0 
         */
//		System.arraycopy(score, 0, score2, 2, score.length);
		// 3. Arrays Ŭ���� �̿�
		score2 = null;
		/*
		 * score �����迭�� 5���� ���� ���� �迭�� ����
		 */
		score2 = Arrays.copyOf(score,5);
		
		for(int s : score2) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}
}