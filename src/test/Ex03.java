package test;
/*
 * 
 */
public class Ex03 {
	public static void main(String[] args) {
		String str = "aaaaa bbbbb ccc ddd zzz";
		int[] arr= new int[26]; //a ~ z ������ ���� ������ �迭
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') { //�ҹ����� ��츸 
			   arr[ch-'a']++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println((char)(i+'a') + ":" + arr[i] + "��");
		}
	}
}
