//问题描述
//给定一个n个顶点，m条边的有向图（其中某些边权可能为负，但保证没有负环）。请你计算从1号点到其他点的最短路（顶点从1到n编号）。
//
//输入格式
//第一行两个整数n, m。
//
//接下来的m行，每行有三个整数u, v, l，表示u到v有一条长度为l的边。
//
//输出格式
//共n-1行，第i行表示1号点到i+1号点的最短路。
//样例输入
//3 3
//1 2 -1
//2 3 -1
//3 1 2
package 算法训练;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class 最短路 {
	//floyd算法
//	public static void floyid(int [][]ver) {
//		for(int i=0;i<ver.length;i++) {
//			for(int j=0;j<ver.length;j++) {
//				for(int k=0;k<ver.length;k++) {
//					if(ver[j][i]!=Integer.MAX_VALUE&&ver[i][k]!=Integer.MAX_VALUE) {
//						ver[j][k]=Math.min(ver[j][i]+ver[i][k], ver[j][k]);
//					}
//				}
//			}
//		}
//		for(int i=1;i<ver.length;i++) {
//			System.out.println(ver[0][i]);
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n,m;//n个顶点，m条边
//		Scanner in=new Scanner(System.in);
//		n=in.nextInt();
//		m=in.nextInt();
//		int [][]ver=new int[n][n];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				ver[i][j]=Integer.MAX_VALUE;
//			}
//		}
//		for(int i=0;i<m;i++) {
//			int t1=in.nextInt();
//			int t2=in.nextInt();
//			ver[t1-1][t2-1]=in.nextInt();
//		}
//		floyid(ver);
//	}
 //spfa算法
	static class edge{
		public int a,b,val;
		public edge(int a,int b,int val) {
			this.a=a;
			this.b=b;
			this.val=val;
		}
	}
	public static void spfa(ArrayList<edge>[] lists,int n) {
		int []result=new int[n];
		result[0]=0;
		for(int i=1;i<n;i++) {
			result[i]=Integer.MAX_VALUE;
		}
		LinkedList<Integer> list=new LinkedList<>();
		list.add(0);
		boolean []used=new boolean[n];
		used[0]=true;
		while (!list.isEmpty()) {
			int a=list.getFirst();
			for(int i=0,length=lists[a].size();i<length;i++) {
				int b=lists[a].get(i).b;
				int val=lists[a].get(i).val;
				if(result[b-1]>result[a]+val) {
					result[b-1]=result[a]+val;
					if(!used[b-1]) {
						used[b-1]=false;
						list.add(b-1);
						
					}
				}
			}
			list.removeFirst();
			used[a]=false;
		}
		for(int i=1;i<n;i++) {
			System.out.println(result[i]+" ");
		}
	}
	public static void main(String[] args) {
		int n,m;//n个顶点，m条边
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		m=in.nextInt();
		ArrayList<edge> []list=new ArrayList[n];
		for(int i=0;i<n;i++) {
			list[i]=new ArrayList<edge>();
		}
		for(int i=0;i<m;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			int val=in.nextInt();
			list[a-1].add(new edge(a, b, val));
			
		}
		
		spfa(list, n);
		
	}
}
