//问题描述
//　　对于给定整数数组a[],寻找其中最大值，并返回下标。
//输入格式
//　　整数数组a[],数组元素个数小于1等于100。输出数据分作两行：第一行只有一个数，表示数组元素个数；第二行为数组的各个元素。
//输出格式
//　　输出最大值，及其下标
//样例输入
//3
//3 2 1
//
//样例输出
//
//
//3 0

package 算法训练;

import java.util.Scanner;

public class 寻找数组中最大值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int max=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<n;i++) {
			int temp=in.nextInt();
			if(max<temp) {
				max=temp;
				index=i;
			}
		}
		System.out.println(max+" "+index);
	}

}
