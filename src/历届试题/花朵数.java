package 历届试题;

import java.math.BigInteger;

public class 花朵数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=100;i<=999;i++) {
			num=i*i;
			String string=String.valueOf(num);
			String rString=String.valueOf(i);
			if(rString.equals(string.substring(string.length()-3, string.length()))){
				System.out.println(i);
			}
		}
	}

}
