package chap5;

/*
 * 2���� �迭�� ���� �հ� ���� �� ���ϱ�
 * int arr[][] = {{10,20},{30,40},{50,60,70}}
 * 
 * 0���� ��:
 * 1���� ��:
 * 2���� ��:
 * 0���� ��:
 * 1���� ��:
 * 2���� ��:
 */
public class ArrayEx16 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 20 }, { 30, 40 }, { 50, 60, 70,80} };
//		int[] a = new int[3];
//		int[] b = new int[3];
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				a[i] += arr[i][j];
//				b[j] += arr[i][j];
//			}
//			System.out.println(i + "���� �� : " + a[i]);
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i + "���� ��: " + b[i]);
//		}
		int maxcol = 0;
		//a : arr ���������� 1�����迭�� ���������� �迭��
		for(int[] a : arr) {
			if(maxcol < a.length) {
				maxcol = a.length;
			}
		}
		//�迭�� �ѹ� ������ �Ǹ� ���� ������ ���� �� �� ����.
		int tot[] = new int[maxcol]; //���� ���� ������ �迭
		for (int i = 0; i < arr.length; i++) {
			 int sum = 0;
			 for (int j = 0; j < arr[i].length; j++) {
				 sum += arr[i][j];
				 tot[j] += arr[i][j];
			 }
			 System.out.println(i + "���� ��:" + sum);
		}
		for (int i = 0; i < tot.length; i++) {
			 System.out.println(i + "���� ��:" + tot[i]);
		}

	}
}
