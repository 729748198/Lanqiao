//问题描述
//给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
//
//输入格式
//第一行包含一个数n，表示序列长度。
//
//第二行包含n个正整数，表示给定的序列。
//
//第三个包含一个正整数m，表示询问个数。
//
//接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。
//
//输出格式
//总共输出m行，每行一个数，表示询问的答案。
//样例输入
//5
//1 2 3 4 5
//2
//1 5 2
//2 3 2
//样例输出
//4
//2
//数据规模与约定
//对于30%的数据，n,m<=100；
//
//对于100%的数据，n,m<=1000；
//
//保证k<=(r-l+1)，序列中的数<=106。
package 算法训练;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 区间K大数查询 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []s=new int[n+1];
		for(int i=1;i<n+1;i++) {
			s[i]=in.nextInt();
		}
		int m=in.nextInt();
		int[] rs=new int[m];
		int temp=0;
		while (m-->0) {
			int l=in.nextInt(),r=in.nextInt(),k=in.nextInt();
			int[] b=new int[r-l+1];
			int i;
			for( i=0;i<r-l+1;i++) {
				b[i]=s[i+l];
			}
			Arrays.sort(b);
			rs[temp++]=b[r-l+1-k];
		}
		for (int i : rs) {
			System.out.println(i);
		}
	}

}
