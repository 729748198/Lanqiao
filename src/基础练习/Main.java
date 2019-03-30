package 基础练习;

import java.util.Arrays;

public class Main implements Cloneable {
	
	public static void main(String[] args) {
		 int[]c=new int[] {1,2,3,4};
		 name(c);
		 System.out.println(c[0]);
	}
	public static void  name(int[]a) {
		int[] c=a.clone();
		
		c[0]=9;
	}
	@Override
	public Object clone() {
		int[]a=null;
		try {
			a=(int[])super.clone();
		}catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return a;
	}
	
	
}
