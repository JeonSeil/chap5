package test;
/*
  1 ���� 9���� ���� �� �ߺ����� �ʴ� ���ڸ� ���ڸ� ��� ����ϱ�
   [���]
     123,124,125...129
     132,134,135...139
     
     9*8*7 = 504��
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] arrnum = new int[1000];
		int cnt = 0;
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				for(int k=1;k<10;k++) {
					if((i != j) && (i != k) && (j != k))
						arrnum[cnt++] = i*100+j*10+k;
				}
			}
		}
		for(int i=0;i<arrnum.length;i++) {
			if (arrnum[i] == 0) break;
			System.out.print(arrnum[i] + "  ");
			if((i+1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n1���� 9���� �ߺ����� �ʴ� ���ڸ� ���ڴ� ��� " + cnt + "�� �Դϴ�.");
	}
}
