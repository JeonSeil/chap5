package test;

/*
 * command ���ο��� ���ڸ� �Է¹޾� �Ҽ����� �Ǻ��Ͻÿ�
 */
public class Ex06 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command ���ڸ� �Է��ϼ���");
			return;
		}
		int num = Integer.parseInt(args[0]); //����<=���ڿ�
		String result = null;
		int cnt = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		System.out.print(num + "��/�� ");
//		if(cnt == 2) System.out.println("�Ҽ��Դϴ�.");
		if(cnt == 2) result = "�Ҽ��Դϴ�.";
		else {
			System.out.print("����� " + cnt + "�� �ֽ��ϴ�.");
			result = "�Ҽ��� �ƴմϴ�.";
		}
		System.out.println(result);
	}
}
