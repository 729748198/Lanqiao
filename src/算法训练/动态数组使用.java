//从键盘读入n个整数，使用动态数组存储所读入的整数，并计算它们的和与平均值分别输出。要求尽可能使用函数实现程序代码。平均值为小数的只保留其整数部分。
//样例输入: 
//5 
//3 4 0 0 2
//样例输出:
//9  1
//样例输入: 
//7
//3 2 7 5 2 9 1
//样例输出:
//29  4
package 算法训练;

import java.util.Scanner;

public class 动态数组使用 {

	public static void fun(int []zu) {
		int sum=0;
		for(int i=0;i<zu.length;i++) {
			sum+=zu[i];
		}
		System.out.println(sum+" "+sum/zu.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int []zu=new int[n];
		for(int i=0;i<n;i++) {
			zu[i]=in.nextInt();
		}
		
		fun(zu);
	}

}
