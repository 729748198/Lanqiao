//问题描述
//有一棵 n 个节点的树，树上每个节点都有一个正整数权值。如果一个点被选择了，那么在树上和它相邻的点都不能被选择。求选出的点的权值和最大是多少？
//
//输入格式
//第一行包含一个整数 n 。
//
//接下来的一行包含 n 个正整数，第 i 个正整数代表点 i 的权值。
//
//接下来一共 n-1 行，每行描述树上的一条边。
//
//输出格式
//输出一个整数，代表选出的点的权值和的最大值。
//样例输入
//5
//1 2 3 4 5
//1 2
//1 3
//2 4
//2 5
//样例输出
//12
//样例说明
//选择3、4、5号点，权值和为 3+4+5 = 12 。
//数据规模与约定
//对于20%的数据， n <= 20。
//
//对于50%的数据， n <= 1000。
//
//对于100%的数据， n <= 100000。
//
//权值均为不超过1000的正整数。
package 算法训练;

import java.util.Scanner;

public class 结点选择 {

	   int [][] dp=new int[100001][2];
	   int [][] tree=new int[100001][300];
	   
	   public void cteat(int one ,int two) {
		   int i=0;
		   while (tree[one][i]!=0) {
			i++;
		}
		   tree[one][i]=two;
		   int j=0;
		   while (tree[two][j]!=0) {
			   j++;
		}
		   tree[two][j]=one;
	   }
	   public void dfs(int start,int root) {
		   int child=tree[start][0];
		   for(int i=0;child!=0;i++) {
			   child=tree[start][i];
			   if(child!=root) {
				   dfs(child, start);
				   dp[start][1]+=dp[child][0];
				   dp[start][0]+=dp[child][1]>dp[child][0]?dp[child][1]:dp[child][0];
			   }
		   }
	   }
	   
		public static void main(String[] args) {
				
				结点选择 test=new 结点选择();
				int n;
				Scanner in=new Scanner(System.in);
				n=in.nextInt();
				for(int i=0;i<n;i++) {
					test.dp[i+1][1]=in.nextInt();
				}
				for(int i=0;i<n-1;i++) {
					int p1=in.nextInt();
					int p2=in.nextInt();
					test.cteat(p1, p2);
					
				}
				test.dfs(1, 0);
				int max=Math.max(test.dp[1][1], test.dp[1][0]);
				System.out.println(max);
				
			}

}
