//问题描述
//Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
//
//当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
//
//输入格式
//输入包含一个整数n。
//输出格式
//输出一行，包含一个整数，表示Fn除以10007的余数。
//说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。
//
//样例输入
//10
//样例输出
//55
//样例输入
//22
//样例输出
//7704
//数据规模与约定
//1 <= n <= 1,000,000。
package 入门训练;

import java.util.Scanner;

public class Fibonacci数列 {
	public static int f(int n) {
		if(n==1||n==2) {
			return 1;
		}
		return f(n-1)+f(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//普通的方法，直接求出Fibonacci数列数组，然后取余,但是这样求出的结果太大，int甚至Long都不足以支持这个结果。
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		 long[] f=new long [1000001];
		f[1]=1;
		f[2]=1;
		for(int i=3;i<=n;i++) {
			//数组直接计算
			f[i]=(f[i-1]+f[i-2])%10007;
			
			//利用递归函数
			//f[i]=f(i);
			System.out.println(i+" "+f[i]);
		}
		System.out.println(f[n]);
	}

}
