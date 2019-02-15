package chap5;
/*
 * Lotto 번호 생성하기
 * 1 ~ 45까지의 수 중에서 임의로 6개를 선택함. 중복 불가
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		//1 부터 45까지의 값을 가진 배열 선언, 초기화
		int[] balls = new int[45];
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		//2. 배열의 값을 섞기.
		//   임의로 배열의 인덱스 2개를 찾아서 두개의 수를 바꾸기.  => 1000번 실행
		for(int i=0;i<1000;i++) {
			int f = (int)(Math.random() * 45);
			int t = (int)(Math.random() * 45);
			// balls[t] <- balls[f]
			// balls[f] <- balls[t]
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		//3. balls배열의 0~ 5사이의 값을 lotto 배열에 저장 
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = balls[i];
		}
		for(int b : lotto) {
		    System.out.print(b + ",");
		}
		System.out.println();
		//4. lotto 번호를 정렬하여 출력하기.
		for(int i=0;i<lotto.length;i++) {
			boolean change = false;
			for(int j=0;j<lotto.length-i-1;j++) {
				if(lotto[j] > lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;
					change=true;
				}
			}
			if (!change) break;
		}
		for(int b : lotto)
		    System.out.print(b + ",");
		System.out.println();
	}
}
