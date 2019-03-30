//问题描述
//已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
//
//输入格式
//输入一个正整数N。
//
//输出格式
//输出一个整数，表示你找到的最小公倍数。
//样例输入
//9
//样例输出
//504
//数据规模与约定
//1 <= N <= 106。
package 算法训练;

import java.util.Scanner;

public class 最大最小公倍数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		long n=in.nextInt();
		if(n<=2) {
			
			System.out.println(n);
			return;
		}
		if(n%2==0) {
			if(n%3==0) {
				System.out.println((n-1)*(n-2)*(n-3));
			}else {
				System.out.println(n*(n-1)*(n-3));
			}
		}else {
			System.out.println(n*(n-1)*(n-2));
		}
					
	}

}
