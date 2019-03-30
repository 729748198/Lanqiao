package 基础练习;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
			int a=in.nextInt();
		while (in.hasNext()) {
			System.out.print((char)a);
			a=in.nextInt();
		}
		
	}

}
