package six_sheng_c;

import java.util.Arrays;

public class six_sheng_c_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int two=0;
		int three=0;
		String f1="";
		String f2="";
		for(int num=0;num<100000;num++ ) {
			two=num*num;
			three=num*two;
			StringBuffer fBuffer=new StringBuffer();
			fBuffer.append(String.valueOf(two));
			fBuffer.append(String.valueOf(three));
			char []a=fBuffer.toString().toCharArray();
			Arrays.sort(a);
			String temp=new String(a);
			if(temp.equals("0123456789")==true) {
				System.out.println(num);
				break;
			}
		}
	}
}
