package 历届试题;

import java.util.Scanner;

public class 核桃的数量 {

	public static int gcd(int a,int b) {
		int max,min;
		max=a>b?a:b;
		min=a>b?b:a;
		if(max%min!=0) {
			return gcd(min, max%min);
		}else {
			return min;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int n3=in.nextInt();
		int temp=n1*n2/gcd(n1, n2);
		System.out.println(temp*n3/gcd(temp, n3));
	}

}
