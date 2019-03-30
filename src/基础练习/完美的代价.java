//问题描述
//回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
//交换的定义是：交换两个相邻的字符
//例如mamad
//第一次交换 ad : mamda
//第二次交换 md : madma
//第三次交换 ma : madam (回文！完美！)
//输入格式
//第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
//第二行是一个字符串，长度为N.只包含小写字母
//输出格式
//如果可能，输出最少的交换次数。
//否则输出Impossible
//样例输入
//5
//mamad
//样例输出
//3
package 基础练习;

import java.util.Scanner;

public class 完美的代价 {

	private static char[]a;
	public static void swap(int i,int j) {
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String string=in.next();
		a=string.toCharArray();
		int count=0;
		int flag=0;
		int right=n-1;
		for(int i=0;i<n/2+1;i++) {
			for(int j=n-1;j>=i;j--) {
				if(j==i) {
					if(n%2==0||flag==1) {
						System.out.println("Impossible");
						return;
					}else{
						count+=n/2-i;
						flag=1;
					}
				}else if(a[j]==a[i]){
					 for(int k=j;k<right;k++) {
						 swap(k, k+1);
						 count++;
						 for(char c:a) {
							 System.out.print(c);
						 }
						 System.out.println();
					 }
					 right--;
					 break;
				}
			}
		}
		System.out.println(count);
	}

}
