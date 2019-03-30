//问题描述
//　　题目很简单，给出N个数字，不改变它们的相对位置，在中间加入K个乘号和N-K-1个加号，（括号随便加）使最终结果尽量大。因为乘号和加号一共就是N-1个了，所以恰好每两个相邻数字之间都有一个符号。例如：
//　　N=5，K=2，5个数字分别为1、2、3、4、5，可以加成：
//　　1*2*(3+4+5)=24
//　　1*(2+3)*(4+5)=45
//　　(1*2+3)*(4+5)=45
//　　……
//输入格式
//　　输入文件共有二行，第一行为两个有空格隔开的整数，表示N和K，其中（2<=N<=15, 0<=K<=N-1）。第二行为 N个用空格隔开的数字（每个数字在0到9之间）。
//输出格式
//　　输出文件仅一行包含一个整数，表示要求的最大的结果
//样例输入
//5 2
//1 2 3 4 5
//样例输出
//120
//样例说明
//　　(1+2+3)*4*5=120
package 算法训练;

import java.util.Scanner;

public class 最大的算式 {
	
	    /*
	     * dp[i][j]代表前i个数中有j个乘号的最大值
	     * sum[i]是前i个数的和
	     * 状态转移方程:dp[i][0] = sum[i]
	     * dp[i][j] = max(dp[i][j],dp[k-1][j-1]*(sum[i]-sum[j-1]))
	     * k为乘号的位置；
	     */
	 
	    public static void main(String[] args) {
	    	Scanner in=new Scanner(System.in);
	    	int n=in.nextInt();
	    	int k=in.nextInt();
	    	int []sum=new int[n+1];
	    	int [][]dp=new int[n+1][k+1];
	    	int []num=new int[n+1];
	    	for(int i=1;i<=n;i++) {
	    		num[i]=in.nextInt();
	    		sum[i]=sum[i-1]+num[i]; //前i个数的和
	    		dp[i][0]=sum[i];//前i个数有0个乘号的最大算式（就是和）
	    	}
	    	for(int i=2;i<=n;i++) {
	    		int t=Math.min(i, k);
	    		for(int j=1;j<=t;j++) {//乘号数量
	    			for(int l=2;l<=i;l++) {//乘号位置
	    				int temp=sum[i]-sum[l-1];
	    				dp[i][j]=Math.max(dp[i][j], dp[l-1][j-1]*temp);
	    			}
	    		}
	    	}
	    	System.out.println(dp[n][k]);
	    }
}
