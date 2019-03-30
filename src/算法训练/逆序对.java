package 算法训练;
import java.util.ArrayList;
import java.util.Scanner;


public class 逆序对 {

    /**
假设：
（1）f(root)表示以root为根的二叉树的最少逆序对
（2）revPair(list1, list2)表示链表list1和链表list2的逆序对个数，例如
list1 = 2->1->4, list2 = 1->2->3，则list1和list2的逆序对有(2,1),(4,1),(4,2)和(4,3)，则此时revPair(list1, list2) = 4
（3）list(root)表示以root为根的二叉树的叶子节点从左到右连接所形成的链表，并且已经过排序
则有：
（1）如果root是叶子节点，则f(root) = 0，显然没有逆序对
（2）如果root不是叶子节点，则有如下状态转移方程
f(root) = f(root->left) + f(root->right) + 
          min(revPair(list(root->left), list(root->right)),//不交换左右子树 
              revPair(list(root->right), list(root->left)))//交换左右子树
     */
    private static int leafNum;
    private static int[] weightArr;
    private static Point tree;
    private static int i=0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        init();
        int minRev=f(tree);
        System.out.println(minRev);
    }

    private static int f(Point root){
        if(root.weight!=0){//该节点为叶子节点
            return 0;
        }else{//该节点不是叶子节点
            ArrayList<Integer> listLeft=new ArrayList<Integer>();
            ArrayList<Integer> listRight=new ArrayList<Integer>();
            list(root.left,listLeft);
            list(root.right,listRight);
            return f(root.left) + f(root.right)+Math.min(revPair(listLeft, listRight),//不交换左右子树 
                      revPair(listRight, listLeft));//交换左右子树
        }
    }

    private static int revPair(ArrayList<Integer> list1,ArrayList<Integer> list2){
        list1.addAll(list2);
        int count=0;
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(i)>list1.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    private static void list(Point p,ArrayList<Integer> li){
        if(p.weight!=0){//该节点为叶子节点
            li.add(p.weight);
        }else{
            list(p.left,li);
            list(p.right,li);
        }
    }

    private static void init(){
        Scanner sc=new Scanner(System.in);
        leafNum=sc.nextInt();
        weightArr=new int[2*leafNum-1];
        for(int i=0;i<2*leafNum-1;i++){
            weightArr[i]=sc.nextInt();
        }
        tree=new Point();
        tree.weight=weightArr[i++];
        getTree(tree);
        sc.close();
    }

    private static void getTree(Point p){
        if(weightArr[i]==0){
            p.left=new Point();
            p.right=new Point();
            p.weight=weightArr[i++];
            getTree(p.left);
            getTree(p.right);
        }else{
            p.weight=weightArr[i++];
            p.left=null;
            p.right=null;
        }
    }
}

class Point{
    Point left;
    Point right;
    int weight;
}
