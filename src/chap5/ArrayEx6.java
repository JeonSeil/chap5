package chap5;

import java.util.Scanner;

/*
 * 10������ �������� �����ϱ�
 */
public class ArrayEx6 {
	public static void main(String[] args) {
		int[] binary = new int[32];
		System.out.println("2������ ������ �ڿ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num; //0
		int index = 0;  //4
		//binary : 0101000000000000000000
		while(divnum != 0) {
			binary[index++] = divnum % 2;
			divnum /= 2; 
		}
		System.out.print(num + "�� 2���� :");
		for(int i=index-1;i >=0 ;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}
}
