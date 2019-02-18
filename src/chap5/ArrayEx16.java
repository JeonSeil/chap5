package chap5;

/*
 * 2차원 배열의 행의 합과 열의 합 구하기
 * int arr[][] = {{10,20},{30,40},{50,60,70}}
 * 
 * 0행의 합:
 * 1행의 합:
 * 2행의 합:
 * 0열의 합:
 * 1열의 합:
 * 2열의 합:
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
//			System.out.println(i + "행의 합 : " + a[i]);
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i + "열의 합: " + b[i]);
//		}
		int maxcol = 0;
		//a : arr 참조변수는 1차원배열의 참조변수의 배열임
		for(int[] a : arr) {
			if(maxcol < a.length) {
				maxcol = a.length;
			}
		}
		//배열은 한번 생성이 되면 방의 갯수를 변경 할 수 없다.
		int tot[] = new int[maxcol]; //열의 합을 저장할 배열
		for (int i = 0; i < arr.length; i++) {
			 int sum = 0;
			 for (int j = 0; j < arr[i].length; j++) {
				 sum += arr[i][j];
				 tot[j] += arr[i][j];
			 }
			 System.out.println(i + "행의 합:" + sum);
		}
		for (int i = 0; i < tot.length; i++) {
			 System.out.println(i + "열의 합:" + tot[i]);
		}

	}
}
