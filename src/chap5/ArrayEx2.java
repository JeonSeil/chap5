package chap5;

import java.util.Scanner;

/*
 * 화면에서 점수를 10 입력 받아서 score 배열에 저장하고, 점수의 합계와 평균, 최대 점수를 출력하기 
 */
public class ArrayEx2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		System.out.println("10개의 점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int sum=0,max=0;
		for(int i=0;i<score.length;i++) {
			score[i] = scan.nextInt();
			sum +=score[i];
			if(max < score[i]) {
				max = score[i];
			}
		}
		System.out.println("점수 합계:" + sum
				         + ", 평균:" + (double)sum/score.length 
				         + ", 최대 점수:" + max);
	}
}
