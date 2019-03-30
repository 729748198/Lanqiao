//问题描述
//从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
//注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
//样例输入
//FFFF
//样例输出
//65535
package 基础练习;

import java.math.BigInteger;
import java.util.Scanner;

public class 十六进制转十进制 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
//		BigInteger temp=new BigInteger(in.nextLine(), 16);
//		System.out.println(temp);
		char []str;
		str=in.nextLine().toCharArray();
		long sum=0;
		for(int i=0;i<str.length;i++) {
			if(str[i]>='A'&&str[i]<='F') {
				sum=sum*16+str[i]-'A'+10;
			}else {
				sum=sum*16+str[i]-'0';
			}
			
		}
		System.out.println(sum);
	}

}
