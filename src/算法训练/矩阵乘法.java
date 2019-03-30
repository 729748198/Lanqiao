//问题描述
//　　输入两个矩阵，分别是m*s，s*n大小。输出两个矩阵相乘的结果。
//输入格式
//　　第一行，空格隔开的三个正整数m,s,n（均不超过200）。
//　　接下来m行，每行s个空格隔开的整数，表示矩阵A（i，j）。
//　　接下来s行，每行n个空格隔开的整数，表示矩阵B（i，j）。
//输出格式
//　　m行，每行n个空格隔开的整数，输出相乘後的矩阵C（i，j）的值。
//样例输入
//2 3 2
//1 0 -1
//1 1 -3
//0 3
//1 2
//3 1
//样例输出
//-3 2
//-8 2
//
//提示
//矩阵C应该是m行n列，其中C(i,j)等于矩阵A第i行行向量与矩阵B第j列列向量的内积。
//例如样例中C(1,1)=(1,0,-1)*(0,1,3) = 1 * 0 +0*1+(-1)*3=-3
package 算法训练;

import java.util.Scanner;

public class 矩阵乘法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,s,n;
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		s=in.nextInt();
		n=in.nextInt();
		int[] []p1=new int[m][s];
		for(int i=0;i<m;i++) {
			for(int j=0;j<s;j++) {
				p1[i][j]=in.nextInt();
			}
		}
		int[] []p2=new int[s][n];
		for(int i=0;i<s;i++) {
			for(int j=0;j<n;j++) {
				p2[i][j]=in.nextInt();
			}
		}
		int [][]rs=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<s;k++) {
					rs[i][j]+=p1[i][k]*p2[k][j];
				}
			
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
			System.out.print(rs[i][j]+" ");
			}
			System.out.println();
		}
	}

}
