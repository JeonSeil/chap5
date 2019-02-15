package chap5;
/*
 * 배열의 선언,생성, 초기화 
 */
public class ArrayEx4 {
	public static void main(String[] args) {
		//배열의 선언,생성, 초기화 한줄에 구현
		int arr[] = {10,20,30,40,50};
//		for(int a : arr) {
//			System.out.println(a);
//		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i + "]=" + arr[i]);
		}
		System.out.println("생성 초기화만 할때");
		//생성, 초기화
		arr =new int[]{100,200,300,400,500,600,700,800};
//		for(int a : arr) {
//			System.out.println(a);
//		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i + "]=" + arr[i]);
		}
		String[] strarr = {"홍길동","김삿갓","이몽룡"};
		for(String s  : strarr) {
			System.out.println(s);
		}
	}
}
