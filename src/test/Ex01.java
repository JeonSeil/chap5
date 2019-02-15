package test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("»ï°¢ÇüÀÇ ³ôÀÌ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		int len = scan.nextInt();
		int max = len * 2 - 1;  //¹Ø¹Ù´Ú * °¹¼ö   5
		for(int i=0;i<len;i++) {
			for(int j=0;j<max;j++) { 
				if(j>= (max/2-i) && j <= (max/2+i)) {
					System.out.print("*");
				} else if (j < (max/2-i) || j > (max/2+i)) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
