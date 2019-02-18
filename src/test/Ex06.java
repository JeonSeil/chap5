package test;

/*
 * command 라인에서 숫자를 입력받아 소수인지 판별하시오
 */
public class Ex06 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command 숫자를 입력하세요");
			return;
		}
		int num = Integer.parseInt(args[0]); //정수<=문자열
		String result = null;
		int cnt = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		System.out.print(num + "은/는 ");
//		if(cnt == 2) System.out.println("소수입니다.");
		if(cnt == 2) result = "소수입니다.";
		else {
			System.out.print("약수가 " + cnt + "개 있습니다.");
			result = "소수가 아닙니다.";
		}
		System.out.println(result);
	}
}
