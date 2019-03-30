//问题描述
//　　Torry从小喜爱数学。一天，老师告诉他，像2、3、5、7……这样的数叫做质数。Torry突然想到一个问题，前10、100、1000、10000……个质数的乘积是多少呢？他把这个问题告诉老师。老师愣住了，一时回答不出来。于是Torry求助于会编程的你，请你算出前n个质数的乘积。不过，考虑到你才接触编程不久，Torry只要你算出这个数模上50000的值。
//输入格式
//　　仅包含一个正整数n，其中n<=100000。
//输出格式
//　　输出一行，即前n个质数的乘积模50000的值。
//样例输入
//1
//
//样例输出
//
//
//2
package 算法训练;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Torry的困惑 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int []sushu=new int[100001];
		int ji=1;
		int temp=2;
		while (ji<=n) {
			
			if(isPrame(temp)==1) {
				sushu[ji++]=temp;
			}
			temp++;
		}
		int rs=1;
		for(int i=1;i<=n;i++) {
			System.out.println(sushu[i]);
			rs=(rs*sushu[i])%50000;
		}
		System.out.println(rs);
		
	}
	public static int isPrame(int n) {
		if(n==2) {
			return 1;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}

}
