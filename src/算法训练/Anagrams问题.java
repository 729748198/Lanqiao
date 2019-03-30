//问题描述
//　　Anagrams指的是具有如下特性的两个单词：在这两个单词当中，每一个英文字母（不区分大小写）所出现的次数都是相同的。例如，“Unclear”和“Nuclear”、“Rimon”和“MinOR”都是Anagrams。编写一个程序，输入两个单词，然后判断一下，这两个单词是否是Anagrams。每一个单词的长度不会超过80个字符，而且是大小写无关的。
//　　输入格式：输入有两行，分别为两个单词。
//　　输出格式：输出只有一个字母Y或N，分别表示Yes和No。
//　　输入输出样例
//样例输入
//Unclear
//Nuclear
//样例输出
//Y
package 算法训练;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		System.out.println("转小写:"+s1+' '+s2);
		char []c1=s1.toCharArray();
		char []c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String r1=new String(c1);
		String r2=new String(c2);
		System.out.println("数组排完序"+r1+" "+r2);
		if(r1.equals(r2)) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}

		if(s1.length()!=s2.length()) {
			System.out.println("N");
			return;
		}
//				int []a1=new int[26];
//		int []a2=new int[26];
//		for(int i=0;i<s1.length();i++) {
//			char a=s1.charAt(i);
//			char b=s2.charAt(i);
//			a2[b-'a']++;
//			a1[a-'a']++;
//		}
//		for(int i=0;i<26;i++) {
//			if(a1[i]!=a2[i]) {
//				System.out.println("N");
//				return;
//			}
//			
//		}
//		System.out.println("Y");
	}

}
