package day15;

class TreeNode{
    TreeNode lchild;
    TreeNode rchild;
    int date;
    TreeNode(){}
    TreeNode(int date){
        this.date = date;
    }
}

public class d3 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        int[] out = new int[pre.length];
        root = rebuild(pre,0,pre.length-1,in,0,in.length-1);

        pppre(root);


    }
    public static void pppre(TreeNode root){
        if(root == null)
            return;
        System.out.println(root.date);
        pppre(root.lchild);
        pppre(root.rchild);

    }
    public static TreeNode rebuild(int[] pre, int s1, int e1, int[] in, int s2, int e2){
        if(e1<s1||e2<s2){
            return null;
        }
        TreeNode root = new TreeNode();
        int i = s2;
        for(;i <=e2 ;i++){
            if(in[i]==pre[s1]){
                break;
            }
        }
        int k1 = i - s2;
        int k2 = e2 - i;
        root.date = pre[s1];
        root.lchild = rebuild(pre,s1+1 , s1+k1 ,in ,s2 ,s2+k1-1);
        root.rchild = rebuild(pre,e1-k2+1, e1,in ,e2-k2+1, e2);
        return root;
    }

}
