package 基础练习;

import java.util.Scanner;

public class 用筛法求之N内的素数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			if (isP(i)) {
				System.out.println(i);
			}
		}
		
	}
	public static boolean isP(int n) {
		if (n<2) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
