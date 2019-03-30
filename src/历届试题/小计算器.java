//问题描述
//　　模拟程序型计算器，依次输入指令，可能包含的指令有
//
//
//　　1. 数字：'NUM X'，X为一个只包含大写字母和数字的字符串，表示一个当前进制的数
//　　2. 运算指令：'ADD','SUB','MUL','DIV','MOD'，分别表示加减乘，除法取商，除法取余
//　　3. 进制转换指令：'CHANGE K'，将当前进制转换为K进制(2≤K≤36)
//　　4. 输出指令：'EQUAL'，以当前进制输出结果
//　　5. 重置指令：'CLEAR'，清除当前数字
//
//
//　　指令按照以下规则给出：
//　　数字，运算指令不会连续给出，进制转换指令，输出指令，重置指令有可能连续给出
//　　运算指令后出现的第一个数字，表示参与运算的数字。且在该运算指令和该数字中间不会出现运算指令和输出指令
//　　重置指令后出现的第一个数字，表示基础值。且在重置指令和第一个数字中间不会出现运算指令和输出指令
//　　进制转换指令可能出现在任何地方
//
//
//　　运算过程中中间变量均为非负整数，且小于2^63。
//　　以大写的'A'~'Z'表示10~35
//输入格式
//　　第1行：1个n，表示指令数量
//　　第2..n+1行：每行给出一条指令。指令序列一定以'CLEAR'作为开始，并且满足指令规则
//输出格式
//　　依次给出每一次'EQUAL'得到的结果
//样例输入
//7
//CLEAR
//NUM 1024
//CHANGE 2
//ADD
//NUM 100000
//CHANGE 8
//EQUAL
//样例输出
//2040

//1024
//10 100 1000 10000    1后面10个零        10000100000
//2   4   8     16    1024            2040
package 历届试题;

import java.util.Scanner;


public class 小计算器 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jing=10;  //当前进制
		long temp=0; //操作数
		long result=0;//结果
		int ji=0; //操作数计数
		String qString="null"; //当前操作
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String begin=in.next();
		String next=in.next();
		for(int i=1;i<n;i++) {
			//清除
			if (next.equals("CLEAR")) {
				jing=0;
				temp=0;
				result=0;
				qString="null";

				continue;
			}else if (next.charAt(0)=='N') {
			//增加数字
				next=in.next();

				temp=Long.parseLong(next,jing);
				
				if(result==0) {
					result=temp;
				}
				if(!qString.equals("null")) {
					
					 if(qString.equals("ADD")) {
						result+=temp;
					}else if (qString.equals("SUB")) {
						result-=temp;
					}else if (qString.equals("MUL")) {
						result*=temp;
					}else if (qString.equals("DIV")) {
						result/=temp;						
					}else if (qString.equals("MOD")) {
						result%=temp;
					}
					qString="null";
					
				}
			}else if (next.charAt(0)=='C') {
				//改变进制
				next=in.next();
				jing=Integer.parseInt(next);
				
				
			}else if (next.equals("EQUAL")) {
				//按进制输出
				System.out.print(Long.toString(result,jing));
			}else {
				qString=next;
			}	
			next=in.next();
		}
		
	}


}
