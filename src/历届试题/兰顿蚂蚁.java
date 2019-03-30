//输入数据的第一行是  m  n  两个整数（3  <   m,  n  <   100），表示正方形格子的行数和列数。 
//接下来是  m  行数据。 
//每行数据为  n  个被空格分开的数字。0  表示白格，1  表示黑格。 
//
//接下来是一行数据：x  y  s  k,  其中x  y为整数，表示蚂蚁所在行号和列号（行号从上到下增长，列号从左到右增长，都是从0开始编号）。s  是一个大写字母，表示蚂蚁头的朝向，我们约定：上下左右分别用：UDLR表示。k  表示蚂蚁走的步数。 
//输出
//输出数据为一个空格分开的整数  p  q,  分别表示蚂蚁在k步后，所处格子的行号和列号。
//样例输入
//5  6 
//0  0  0  0  0  0 
//0  0  0  0  0  0 
//0  0  1  0  0  0 
//0  0  0  0  0  0 
//0  0  0  0  0  0 
//2  3  L  5 
//样例输出
//1 3
package 历届试题;

import java.util.Scanner;

public class 兰顿蚂蚁 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int [][]num=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				num[i][j]=in.nextInt();
			}
		}
		int x=in.nextInt();
		int y=in.nextInt();
		String begin=in.next();
		int sum=in.nextInt();
		while (sum-->0) {
			//白格
			if(num[x][y]==0) {
				num[x][y]=1;
				 begin=left(begin);
				
				
			}
			//黑格
			else if (num[x][y]==1) {
				num[x][y]=0;
				begin=right(begin);				
				
			}
			switch (begin) {
			case "L":
				y-=1;
				break;
			case "R":
				y+=1;
				break;
			case "U":
				x-=1;
				break;
			case "D":
				x+=1;
				break;
			default:
				break;
			}
		}
		System.out.println(x+" "+y);
	}
	private static String right(String s) {
        if (s.equals("L")) {
            return "U";
        }
        if (s.equals("U")) {
            return "R";
        }
        if (s.equals("R")) {
            return "D";
        }
        if (s.equals("D")) {
            return "L";
        }
        return null;
    }
 
    private static String left(String s) {
        if (s.equals("L")) {
            return "D";
        }
        if (s.equals("D")) {
            return "R";
        }
        if (s.equals("R")) {
            return "U";
        }
        if (s.equals("U")) {
            return "L";
        }
        return null;
    }

}
