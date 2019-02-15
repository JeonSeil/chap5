package chap5;

import java.util.Scanner;

/*
 * ������ ������ ������ ���� �����Ͽ�, ������ ������ŭ�� ���� �����ϱ�
 * 
 * 3600
 * ������ �����մϴ�.
 * 
 * 3000
 * 500 : 5��
 * 100 : 5��
 */
public class ArrayEx10 {
	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int money = scan.nextInt();
		int maxmoney = 0; //������ ������ �ִ� �ݾ�
		for (int i = 0; i < coin.length; i++) {
			maxmoney += coin[i] * cnt[i];
		}
		if (money > maxmoney) {
			System.out.println("������ �����մϴ�.");
			return; //�޼��� ����.
		} 
		//������ ���� ������ �ٲ� �� �� �ִ� ���
		for (int i = 0; i < coin.length; i++) {
			int coinNum = 0;  //�ʿ��� ������ ����
			coinNum = money / coin[i]; //5
			if (cnt[i] < coinNum) {  //�ʿ��� ������ �� ū ���
				coinNum = cnt[i]; //������ �ִ� �������� �� ����
				cnt[i] = 0;
			} else {  //�ʿ��� ������ ������ ���� ���� ����
				cnt[i] -= coinNum;
			}
			money -= coinNum * coin[i];
			System.out.println(coin[i] + "��:" + coinNum);
		}
		for (int i = 0; i < coin.length; i++) {
			System.out.println("���� ���� " + coin[i] + "��:" + cnt[i] + "��");
		}
	}
}
