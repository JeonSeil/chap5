package chap5;

import java.util.Scanner;

/*
 * �ݾ��� �Է¹޾Ƽ�  �ּҰ��� �������� �ٲ��ִ� ���α׷� �����ϱ�
 * 
 * ������ ���� : 500,100,50,10,5,1
 * 
 * [��1]
 * 3600
 * 500���� : 7��
 * 100���� : 1��
 * ..       
 */
public class ArrayEx9 {
	public static void main(String[] args) {
		int coin[] = {500,100,50,10,5,1};
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int money = scan.nextInt();
		for(int c : coin) {
			System.out.println(c + "�� :" + money/c + "��");
			money %= c;
		}
	}
}
