package 基础练习;

import java.util.Scanner;

public class 蛇行矩阵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [][]num=new int[n][n];
		num[0][0]=1;
		int ji=2;
		for(int i=1;i<n;i++) {
			int temp=i;//行递减
			for(int j=0;j<=i;j++) {
				num[temp--][j]=ji++;
			}
		}
		int temp=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<temp;j++) {
				System.out.print(num[i][j]+" ");
			}
			temp--;
			System.out.println();
		}
	}

}
