package 基础练习;

import java.util.Scanner;

public class 字符逆序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		StringBuilder sBuilder=new StringBuilder(string);
		System.out.println(sBuilder.reverse());
	}

}
