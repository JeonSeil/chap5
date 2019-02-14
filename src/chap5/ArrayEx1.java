package chap5;
/*
 * 배열 예제 1
 */
public class ArrayEx1 {
	public static void main(String[] args) {
		int[] arr1; //배열 참조변수 선언. 배열의 선언
		arr1 = new int[5]; //배열 객체 생성. 배열의 생성
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1[" + i + "]=" + arr1[i]);
		}
		int[] arr2 = new int[10];
		arr2 = arr1;
		arr2[3] = 100;
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr1[" + i + "]=" + arr1[i]);
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		//개선된 for 구문. 첨자 사용 불가
		for(int a : arr1) {
			System.out.println(a);
		}
	}
}
