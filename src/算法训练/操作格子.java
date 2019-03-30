//问题描述
//有n个格子，从左到右放成一排，编号为1-n。
//
//共有m次操作，有3种操作类型：
//
//1.修改一个格子的权值，
//
//2.求连续一段格子权值和，
//
//3.求连续一段格子的最大值。
//
//对于每个2、3操作输出你所求出的结果。
//
//输入格式
//第一行2个整数n，m。
//
//接下来一行n个整数表示n个格子的初始权值。
//
//接下来m行，每行3个整数p,x,y，p表示操作类型，p=1时表示修改格子x的权值为y，p=2时表示求区间[x,y]内格子权值和，p=3时表示求区间[x,y]内格子最大的权值。
//
//输出格式
//有若干行，行数等于p=2或3的操作总数。
//
//每行1个整数，对应了每个p=2或3操作的结果。
//
//样例输入
//4 3
//1 2 3 4
//2 1 3
//1 4 3
//3 1 4
//样例输出
//6
//3
//数据规模与约定
//对于20%的数据n <= 100，m <= 200。
//
//对于50%的数据n <= 5000，m <= 5000。
//
//对于100%的数据1 <= n <= 100000，m <= 100000，0 <= 格子权值 <= 10000。
package 算法训练;

import java.util.Scanner;

public class 操作格子 {
//	
//	普通方法
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n,m;
//		
//		Scanner in=new Scanner(System.in);
//		n=in.nextInt();
//		m=in.nextInt();
//		int []zu=new int [n+1];
//		zu=new int[n+1];
//		for(int i=1;i<=n;i++) {
//			zu[i]=in.nextInt();
//		}
//		for(int i=0;i<m;i++) {
//			switch (in.nextInt()) {
//			case 1:
//				int index=in.nextInt();
//				int value=in.nextInt();
//
//				zu[index]=value;
//				
//				break;
//			case 2:
//				int sum=0;
//				int left=in.nextInt();
//				int right=in.nextInt();
//				for(int j=left;j<=right;j++) {
//					sum+=zu[j];
//				}
//				System.out.println(sum);
//				break;
//			case 3:
//				int max=Integer.MIN_VALUE;
//				int left1=in.nextInt();
//				int right1=in.nextInt();
//				for(int j=left1;j<=right1;j++) {
//					if(max<zu[j])
//					{
//						max=zu[j];
//					}
//				}
//				System.out.println(max);
//				break;
//			default:
//
//				break;
//			}
//		}
//	}
	//线段树
	
    //创建树，并且赋最小值
    public static void buildTree(int[] arr,TreeNode[] segTree,int node,int begin,int end) {
        if(begin == end) {
            segTree[node].max = arr[begin];//只有一个元素，节点记录该单元素
            segTree[node].sum = arr[begin];
        }else {
            //递归构造左右子树
            buildTree(arr,segTree,2 * node, begin ,(begin + end) / 2);
            buildTree(arr,segTree,2 * node + 1,(begin + end) / 2 + 1,end);
            //回溯时得到当前node结点的线段信(最大值)
            if(segTree[2 * node].max >= segTree[2 * node + 1].max) {
                segTree[node].max = segTree[2 * node].max;
            }else {
                segTree[node].max = segTree[2 * node + 1].max;
            }
            //回溯得到当前node结点的线段信息(和)
            segTree[node].sum = segTree[2 * node].sum + segTree[2 * node + 1].sum;
        }
    }

    //查询区间最大值
    public static int queryMax(TreeNode[] segTree,int node,int begin,int end,int left,int right) {
        int p1,p2;
        //查询区间和要求的区间有没有交集
        if(left > end || right < begin) {
            return -1;
        }
        if(begin >= left && end <= right)
            return segTree[node].max;

        p1 = queryMax(segTree,2 * node,begin,(begin + end) / 2,left,right);
        p2 = queryMax(segTree,2 * node + 1,(begin + end) / 2 + 1,end,left,right);
//      System.out.println(p1+"  "+p2);
        if(p1 == -1)
            return p2;
        if(p2 == -1)  
            return p1;
        if(p1 >= p2)
            return p1;
        return p2;
    }   

    //查询区间最大值
    public static int querySum(TreeNode[] segTree,int node,int begin,int end,int left,int right) {
        int p1,p2;
        //查询区间和要求的区间有没有交集
        if(left > end || right < begin) {
            return -1;
        }
        if(begin >= left && end <= right)
            return segTree[node].sum;
        p1 = querySum(segTree,2 * node,begin,(begin + end) / 2,left,right);
        p2 = querySum(segTree,2 * node + 1,(begin + end) / 2 + 1,end,left,right);
        if(p1 == -1)
            return p2;
        if(p2 == -1)  
            return p1;
        if(p1 != -1 && p2 != -1)
            return p1 + p2;
        return p2;
    }

    public static void choice1(int[] arr,TreeNode[] segTree,int i,int newNum) {
        arr[i] = newNum;
        buildTree(arr,segTree,1,0,arr.length - 1);   
    }

    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();
          int[] arr = new int[n];
          TreeNode[] segTree = new TreeNode[n * 4 + 10];
          for(int i = 0;i < segTree.length;i++) {
              segTree[i] = new TreeNode();
          }
          for(int i = 0;i < n;i ++) {
              arr[i] = sc.nextInt();
          }
          buildTree(arr,segTree,1,0,n - 1);   
          while(m > 0) {
              int choice = sc.nextInt();
              if(choice == 1) {
                    int i = sc.nextInt();
                    int newNum = sc.nextInt();
                    choice1(arr,segTree,i - 1,newNum);
              }else if(choice == 2) {
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    System.out.println(querySum(segTree,1,0,n - 1,left - 1,right -1)); 
              }else if(choice == 3) {
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    System.out.println(queryMax(segTree,1,0,n - 1,left - 1,right - 1)); 
              }  
              m --;
          }
    }

}
class TreeNode{
	public	int max;
	public	int sum;

}
