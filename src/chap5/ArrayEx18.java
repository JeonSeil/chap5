package chap5;
/*
 [결과]
    17	16	15	14	13	
 	 	12	11	10	 	
 	 	 	9	 	 	
 	 	8	7	6	 	
 	5	4	3	2	1
 	
 	출력하기
 */
public class ArrayEx18 {
	public static void main(String[] args) {
		int data = 17;
		int[][] matrix = new int[5][5];
		for(int i=0;i<=matrix.length/2;i++) {
			for(int j=i;j<matrix.length-i;j++) {
				matrix[i][j] = data--;
			}
		}
		for(int i = matrix.length/2+1;i<matrix.length;i++) {
			for(int j=matrix.length-1-i;j<=i;j++) {
				matrix[i][j] = data--;
			}
		}
		//matrix 출력하기
		for(int i=0;i < matrix.length;i++) {
			for(int j=0; j< matrix[i].length;j++) {
				System.out.print(((matrix[i][j]==0)?" ":matrix[i][j])+"\t");
			}
			System.out.println();
		}
		
	}
}
