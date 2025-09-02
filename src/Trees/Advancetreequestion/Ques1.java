//package Trees.Advancetreequestion;
//
//import javax.swing.tree.TreeNode;
//import java.util.HashMap;
//
////conversions from preorder to inorder
//public class Ques1 {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int []index={0};
//        for (int i=0;i<inorder.length;i++){
//            map.put(inorder[i],i);
//        } 
//        return helper(preorder,inorder,0,preorder.length-1,map,index);
//    }
//    public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
//        if (left > right) {
//            return null;
//        }
//
//        int current = preOrder[index[0]];
//        index[0]++;
//
//        TreeNode node = new TreeNode(current);
//
//        if (left == right) {
//            return node;
//        }
//
//        node.left = helper(preOrder, inOrder, left, index - 1, map, index);
//        node.right = helper(preOrder, inOrder, index + 1, right, map, index);
//
//        return node;
//    }
//}
