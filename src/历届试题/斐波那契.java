package 历届试题;

import java.util.Scanner;

public class 斐波那契 {

	
	public static long fib(Long n) {
		if(n==1||n==2) {
			return 1;
		}
		else return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long m=in.nextLong();
		long p=in.nextLong();
		long fm=fib(m);
		long sum=0;
		for(long i=1;i<=n;i++) {
			sum+=fib(i);
			sum%=fm;
			sum%=p;
		}
		System.out.println(sum);
	}

}
