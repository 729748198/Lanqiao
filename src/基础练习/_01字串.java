//问题描述
//对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
//
//00000
//
//00001
//
//00010
//
//00011
//
//00100
//
//请按从小到大的顺序输出这32种01串。
//
//输入格式
//本试题没有输入。
//输出格式
//输出32行，按从小到大的顺序每行一个长度为5的01串。
//样例输出
//00000
//00001
//00010
//00011
//<以下部分省略>
package 基础练习;

public class _01字串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
				for(int k=0;k<2;k++) {
					
					for(int l=0;l<2;l++) {
						
						for(int p=0;p<2;p++) {
							System.out.println(String.valueOf(i)+String.valueOf(j)+String.valueOf(k)+String.valueOf(l)+String.valueOf(p));
						}
					}
				}
			}
		}
	}

}
