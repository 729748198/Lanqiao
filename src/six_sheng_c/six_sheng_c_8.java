package six_sheng_c;

import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class six_sheng_c_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int w,m,n;
		w=in.nextInt();
		m=in.nextInt();
		n=in.nextInt();
		
		int firstRow=0,secondRow=0,firstCol=0,seconeCol=0;
		
	
			firstRow=m/w;
			if(m%w==0&&firstRow%2==0) {
				firstRow=firstRow-1;
				firstCol=0;
			}
			else if (m%w==0&&firstRow%2!=0) {
				firstRow=firstRow-1;
				firstCol=w-1;
				
			}
			else if (firstRow%2==0) {
			
				firstCol=m%w-1;
			}
			else {
			
				firstCol=w-m%w;
			}
		
		
			secondRow=n/w;
			if(n%w==0&&secondRow%2==0) {
				secondRow=secondRow-1;
				seconeCol=0;
			}
			else if (n%w==0&&secondRow%2!=0) {
				secondRow=secondRow-1;
				seconeCol=w-1;
				
			}else if (secondRow%2==0) {
				seconeCol=n%w-1;
			}
			else {
				seconeCol=w-n%w;
			}
	
		int result=Math.abs(firstRow-secondRow)+Math.abs(seconeCol-firstCol);
		System.out.println(result);
	}

}
