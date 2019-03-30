package 基础练习;

import java.util.Scanner;

public class 字符串的输入输出处理 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=1;
		in.nextLine();
		while (in.hasNext()) {
			if (i<=n) {
				System.out.println(in.nextLine());
				i++;
			}else {
				String string=in.next();				
				System.out.println(string);
			}
			System.out.println();
		
			
		}
	}

}
