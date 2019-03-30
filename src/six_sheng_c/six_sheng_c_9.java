package six_sheng_c;

import java.util.Scanner;

public class six_sheng_c_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		n=in.nextInt();
		char[][]ch=new char[n][m+n-1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m+n-1;j++) {
				ch[i][j]='.';
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0,k=m+n-2;j<=k;j++,k--) {
					if(j<m) 
					ch[i][i+j]='*';
					if(k>=n-1) {
						ch[i][k-i]='*';
					}
					
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m+n-1;j++) {
				System.out.print(ch[i][j]+"");
			}
			System.out.println();
		}
	}

}
