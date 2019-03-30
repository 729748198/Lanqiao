package 历届试题;

import java.util.Scanner;

public class 分糖果 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []num=new int[n];
		int []temp=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
			temp[i]=num[i]/2;
		}
		int flag=0;
		int ji=0;
		while (flag==0) {
			
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				num[i]=temp[0]+temp[i];
			}else {
				num[i]=temp[i]+temp[i+1];
			}
			if(num[i]%2!=0) {
				ji++;
				num[i]++;
			}
		}
	
		flag=panduan(num, n);
		for(int i=0;i<n;i++) {
			temp[i]=num[i]/2;
		}			
	}
		System.out.println(ji);
}
	
	public static int panduan(int []num,int n) {
		for(int i=1;i<n;i++) {
			if(num[i]!=num[i-1]) {
				return 0;
			}
		}
		return 1;
	}
}
