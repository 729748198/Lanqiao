//问题描述
//求出区间[a,b]中所有整数的质因数分解。
//输入格式
//输入两个整数a，b。
//输出格式
//每行输出一个数的分解，形如k=a1*a2*a3…(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
//样例输入
//3 10
//样例输出
//3=3
//4=2*2
//5=5
//6=2*3
//7=7
//8=2*2*2
//9=3*3
//10=2*5
//提示
//先筛出所有素数，然后再分解。
//数据规模和约定
//2<=a<=b<=10000
package 基础练习;

import java.util.Scanner;

public class 分解质因数 {

	public static boolean isPrame(int i) {
		for(int j=2;j*j<=i;j++) {
			if(i%j==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		for(int i=n;i<=m;i++) {
			int temp=i;
			int flag=0;
			System.out.print(temp+"=");
			while(temp>1) {
				for(int j=2;j<=temp;j++) {
					if(isPrame(j)&&temp%j==0) {
						//从第一个数字后每次加*
						if(flag==1) {
							System.out.print("*");
							
						}
						System.out.print(j);
						flag=1;
						temp/=j;
					}
				}
			}
			System.out.println();
		}
	}

}
