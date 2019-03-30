package 历届试题;


import java.util.Scanner;

public class 剪格子 {
	
	private static int n;
	private static int m;
	private static int[][] num=new int[11][11];
	private static int Sum=0,sum=0;
	private static int k=1;
	private static int ji=0;
	private static int []rs=new int[11*11];
	private static boolean [][]vis=new boolean[11][11];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		n=in.nextInt();//n列
		m=in.nextInt();//m行
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				num[i][j]=in.nextInt();
				Sum+=num[i][j];
			}
		}
		sum=num[1][1];
		dfs(1,1);
		int min=Integer.MAX_VALUE;
		for(int i=0;i<ji;i++) {
			min=Math.min(min, rs[i]);
		}
		System.out.println(min);
		
	}
	public static void dfs(int x,int y) {
		if(sum==Sum-sum) {
			rs[ji]=k;
			ji++;
			return;
		}
		if(sum>Sum-sum) {
			return;
		}
		
		if(x<m&&vis[x+1][y]==false) {
			sum+=num[x+1][y];
			vis[x+1][y]=true;
			k++;
			dfs(x+1, y);
			k--;
			sum-=num[x+1][y];
			vis[x+1][y]=false;
		}
		if(x>1&&vis[x-1][y]==false) {
			sum+=num[x-1][y];
			vis[x-1][y]=true;
			k++;
			dfs(x-1, y);
			k--;
			sum-=num[x-1][y];
			vis[x-1][y]=false;
		}
		if(y<n&&vis[x][y+1]==false) {
			sum+=num[x][y+1];
			vis[x][y+1]=true;
			k++;
			dfs(x, y+1);
			k--;
			sum-=num[x][y+1];
			vis[x][y+1]=false;
		}
		if(y>1&&vis[x][y-1]==false) {
			sum+=num[x][y-1];
			vis[x][y-1]=true;
			k++;
			dfs(x, y-1);
			k--;
			sum-=num[x][y-1];
			vis[x][y-1]=false;
			
		}
		
		    
	}

}
