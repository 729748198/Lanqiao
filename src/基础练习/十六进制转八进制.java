//问题描述
//　　给定n个十六进制正整数，输出它们对应的八进制数。
//
//输入格式
//　　输入的第一行为一个正整数n （1<=n<=10）。
//　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
//
//输出格式
//　　输出n行，每行为输入对应的八进制正整数。
//
//　　【注意】
//　　输入的十六进制数不会有前导0，比如012A。
//　　输出的八进制数也不能有前导0。
//
//样例输入
//　　2
//　　39
//　　123ABC
//
//样例输出
//　　71
//　　4435274
//
//　　【提示】
//　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
package 基础练习;

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class 十六进制转八进制 {

	private static final char []f= {'0','1','2','3','4','5','6','7'};
	
	public static String fun(String string) {

		//大整数自带的处理函数，超时
		BigInteger temp=new BigInteger(string,16);
		return temp.toString(8);
		
		//直接转换——超时
//		//进制用数组处理
//		char[] temp=string.toCharArray();
//		
//		//先换成十进制，再换成八进制
//		BigInteger sum=BigInteger.valueOf(0);
//		//基数16
//		BigInteger sixteen=BigInteger.valueOf(16);
//		
//		//换成十进制
//		for(int i=0;i<temp.length;i++) {
//			if(temp[i]>='A'&&temp[i]<='F') {
//				//乘法 sum=sum*16+temp[i]-'A'+10
//				sum=sum.multiply(sixteen);
//				int jia=temp[i]-'A'+10;
//				sum=sum.add(BigInteger.valueOf(jia));
//				
//			}else {
//				//乘法 sum=sum*16+temp[i]-'0'
//				sum=sum.multiply(sixteen);
//				int jia=temp[i]-'0';
//				sum=sum.add(BigInteger.valueOf(jia));
//		}
//	}
//
//		//换成八进制
//		//计数j
//		int j=0;
//		//位数
//		char []s=new char [1000000];
//		
//		if(sum.equals("0")) {
//			return "0";
//		}else {
//			while (!sum.equals(BigInteger.valueOf(0))) {
//				//逐位赋值
//				int index=Integer.valueOf(sum.mod(BigInteger.valueOf(8)).toString());
//				s[j]=f[index];
//				j++;
//				
//				//每次赋值后除以8
//				sum=sum.divide(BigInteger.valueOf(8));
//			}
//			//拼接字符串
//			StringBuilder result=new StringBuilder("");
//		for(int k=j-1;k>=0;k--) {
//			result.append(s[k]);
//		}
//		
//			return result.toString();
//		
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a= System.currentTimeMillis();//获取当前系统时间(毫秒)
		Scanner in=new Scanner(System.in);
		//new BufferedInputStream(System.in)
		int n=in.nextInt();
		String []str=new String[n];
		for(int i=0;i<n;i++) {
			
			str[i]=in.next();
			
		}
		for(int i=0;i<n;i++) {
			String temp=toBarry(str[i]);
			System.out.println(toOrcal(temp));
		}
		   System.out.print("程序执行时间为：");
		   System.out.println(System.currentTimeMillis()-a+"毫秒");
	}
	//二进制转换为八进制
	public static String toOrcal(String s) {
		if(s.length()%3==1)s="00"+s;
		if(s.length()%3==2)s="0"+s;
		int k=0;
		if(s.substring(0, 3).equals("000"))k=3;
		StringBuilder result=new StringBuilder();
		for(;k<s.length()-2;k=k+3) {
			switch (s.substring(k,k+3)) {
			case "000":
				result.append("0");
				break;
			case "001":
				result.append("1");
				break;
			case "010":
				result.append("2");
				break;
			case "011":
				result.append("3");
				break;
			case "100":
				result.append("4");
				break;
			case "101":
				result.append("5");
				break;
			case "110":
				result.append("6");
				break;
			case "111":
				result.append("7");
				break;
			default:
				break;
			}
		}
		return result.toString();
	}
	//16进制换为二进制。
	public static String toBarry(String s) {
		 int length=s.length();
		 StringBuilder result=new StringBuilder();
		 for(int i=0;i<length;i++) {
			 switch (s.charAt(i)) {
			case '0':
				result.append("0000");
				break;
			case '1':
				result.append("0001");
				break;
			case '2':
				result.append("0010");
				break;
			case '3':
				result.append("0011");
				break;
			case '4':
				result.append("0100");
				break;
			case '5':
				result.append("0101");
				break;
			case '6':
				result.append("0110");
				break;
			case '7':
				result.append("0111");
				break;
			case '8':
				result.append("1000");
				break;
			case '9':
				result.append("1001");
				break;
			case 'A':
				result.append("1010");
				break;
			case 'B':
				result.append("1011");
				break;
			case 'C':
				result.append("1100");
				break;
			case 'D':
				result.append("1101");
				break;
			case 'E':
				result.append("1110");
				break;
			case 'F':
				result.append("1111");
				break;
				
			default:
				break;
			}
			 
		 }
		 return result.toString();
	}

}
