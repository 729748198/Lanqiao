//问题描述
//　　给两组数，各n个。
//　　请调整每组数的排列顺序，使得两组数据相同下标元素对应相乘，然后相加的和最小。要求程序输出这个最小值。
//　　例如两组数分别为:1 3　　-5和-2 4 1
//
//　　那么对应乘积取和的最小值应为：
//　　(-5) * 4 + 3 * (-2) + 1 * 1 = -25
//输入格式
//　　第一个行一个数T表示数据组数。后面每组数据，先读入一个n，接下来两行每行n个数，每个数的绝对值小于等于1000。
//　　n<=8,T<=1000
//输出格式
//　　一个数表示答案。
//样例输入
//2
//3
//1 3 -5
//-2 4 1
//5
//1 2 3 4 5
//1 0 1 0 1
//
//样例输出
//
//
//-25
//6
package 算法训练;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 最小乘积 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Comparator comparator=new MyComparator();
		while (n-->0) {
			int temp=in.nextInt();
			int []p1=new int[temp];
			Integer []p2=new Integer[temp];
			for(int i=0;i<temp;i++) {
				p1[i]=in.nextInt();
			}
			for(int i=0;i<temp;i++) {
				p2[i]=in.nextInt();
			}
			Arrays.sort(p1);
			Arrays.sort(p2, comparator);
			int sum=0;
			for(int i=0;i<temp;i++) {
				sum+=(p1[i]*p2[i]);
			}
			System.out.println(sum);
			
		}
	}

}
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}
