package chap5;

import java.util.Scanner;

/*
 * 동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
 * 
 * 3600
 * 동전이 부족합니다.
 * 
 * 3000
 * 500 : 5개
 * 100 : 5개
 */
public class ArrayEx10 {
	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scan.nextInt();
		int maxmoney = 0; //보유한 동전의 최대 금액
		for (int i = 0; i < coin.length; i++) {
			maxmoney += coin[i] * cnt[i];
		}
		if (money > maxmoney) {
			System.out.println("동전이 부족합니다.");
			return; //메서드 종료.
		} 
		//보유한 동전 내에서 바꿔 줄 수 있는 경우
		for (int i = 0; i < coin.length; i++) {
			int coinNum = 0;  //필요한 동전의 갯수
			coinNum = money / coin[i]; //5
			if (cnt[i] < coinNum) {  //필요한 동전이 더 큰 경우
				coinNum = cnt[i]; //보유한 최대 동전으로 값 변경
				cnt[i] = 0;
			} else {  //필요한 동전이 보유한 동전 보다 작은
				cnt[i] -= coinNum;
			}
			money -= coinNum * coin[i];
			System.out.println(coin[i] + "원:" + coinNum);
		}
		for (int i = 0; i < coin.length; i++) {
			System.out.println("남은 동전 " + coin[i] + "원:" + cnt[i] + "개");
		}
	}
}
