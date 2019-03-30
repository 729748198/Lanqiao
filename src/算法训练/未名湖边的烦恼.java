//问题描述
//　　每年冬天，北大未名湖上都是滑冰的好地方。北大体育组准备了许多冰鞋，可是人太多了，每天下午收工后，常常一双冰鞋都不剩。
//　　每天早上，租鞋窗口都会排起长龙，假设有还鞋的m个，有需要租鞋的n个。现在的问题是，这些人有多少种排法，可以避免出现体育组没有冰鞋可租的尴尬场面。（两个同样需求的人（比如都是租鞋或都是还鞋）交换位置是同一种排法）
//输入格式
//　　两个整数，表示m和n
//输出格式
//　　一个整数，表示队伍的排法的方案数。
//样例输入
//3 2
//样例输出
//5
//数据规模和约定
//　　m,n∈［0,18］
//　　问题分析
package 算法训练;

import java.util.Scanner;

public class 未名湖边的烦恼 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();//需要还鞋的
		int n=in.nextInt();//需要租鞋的
		System.out.println(dg(m, n));
		System.out.println(dp(m, n));
	}
	public static int dg(int m,int n) {
		if(m<n) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		return dg(m-1, n)+dg(m, n-1);
	}
	 //m代表还鞋的人数，n代表借鞋的人数
     public static int dp(int m, int n) {
        int[][] result = new int[m + 1][n + 1];   //初始化元素全为0
        for(int i = 1;i <= m;i++) {
            result[i][0] = 1;     //当借鞋的人数为0时，排列只有一种情况
            for(int j = 1;j <= n;j++) {
                if(i >= j)   //当i小于j时，排列总数为0
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }
        for (int[] is : result) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
        return result[m][n];
    }

}
