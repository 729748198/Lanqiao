package 历届试题;

import java.util.Scanner;

//求图的割点 危险系数
//蓝桥杯
public class 危险系数 {
	
	private static int[][]map; 
	private static int []vis;
	private static int n;
	private static int []way;
	private static int []sum;
	private static int ji=0;//记录共有多少条路线
  public static void main(String[] args) {
	  Scanner in=new Scanner(System.in);
	  
	  n=in.nextInt();//图中的点数
	  int m=in.nextInt();//图中的边数

	  map=new int[n+1][n+1]; //邻接矩阵表示图
	  
	  for(int i=0;i<m;i++) {
		  //构图,无向图
		  int p1=in.nextInt();
		  int p2=in.nextInt();
		  map[p1][p2]=1;
		  map[p2][p1]=1;
		  
	  }
	  vis=new int[n+1];//遍历时判断是否访问过
	  way=new int[n+1];//从首到尾的路线
	  sum=new int[n+1];//记录每个点在所有路线上总共经过多少次
	 
	  int s=in.nextInt();//出发点
	  int e=in.nextInt();//终点
	  
	  dfs(s, e, 0);
	  
	  int rs=0;
	  for(int i=0;i<n;i++) {
		  //如果每条路线都经过，那这个点就是割点
		  if(sum[i]==ji) {
			  rs++;
		  }
	  }
	  //去掉必经过的起点和终点
	  System.out.println(rs-2);
  }
  /**
   * DFS来遍历图，从起始点到终点的每条路线
   * @param s 当前的点
   * @param e 目标点
   * @param temp 从初始点开始的深度
   */
  public static void dfs(int s,int e,int temp) {
	  
	  way[temp]=s;//记录每个深度的点，整个数组就是一条路线
	  if (s==e) {
		  ji++;//路线条数+1
		for(int i=0;i<=temp;i++) {
			sum[way[i]]++;//点权+1
		}
	}
	  //从0开始遍历s可能经过的路线
	  for(int i=0;i<n;i++) {
		  
		  //s和i连通且之前这个点没有经过，则记录到路线中
		if(map[s][i]==1&&vis[i]==0) {
			vis[i]=1;
			dfs(i, e, temp+1);
			vis[i]=0;
		}
	  }
  }
}
