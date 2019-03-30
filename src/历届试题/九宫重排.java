package 历届试题;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class 九宫重排 {
    public static void main(String[] args) {
    Scanner in=new Scanner (System.in);
    String s=in.nextLine();//开始字符串
    String l=in.nextLine();//结束字符串
    HashMap<String,Integer> map=new HashMap<String,Integer>(); 
     //用于保存之前状态，key代表状态字符串，value代表到key状态所用的最小步数 
    Queue<String> process = new LinkedList<String>();//bfs用到的队列  
    map.put(s,0);
    process.offer(s);
    int result=-1;
     
    while(result==-1){
    String cur=process.poll();
    int temp=cur.indexOf(".");
    int d[]={-3,3,-1,1};//代表上下左右
    for(int i=0;i<=3;i++){
         
        int p=temp+d[i];
 
        if(p<=8&&p>=0&&(p%3==temp%3||p/3==temp/3)){
        //012345678九宫格上2和3不能交换，要排除
            String change=cur.replace('.','*');//交换String中的两个字符，借助中间字符‘*’  
            change =change.replace(cur.charAt(p),'.');
            change =change.replace('*',cur.charAt(p));
            if(change.equals(l)){
                result=map.get(cur)+1;
            }
            if(!map.containsKey(change)){//如果之前没有这种状态  
                map.put(change,map.get(cur)+1);
                process.add(change);//存入队列 ，先进先出 
            }
        }
    }
         
    }
    System.out.println(map.get(l));
    }  
     
 
}  