package Trees;
//
//import com.sun.source.tree.Tree;
//
//import javax.swing.tree.TreeNode;
//import java.util.*;
//
//public class InterviewQuestions {
//
//////    ques1:Binary Tree Level Order Traversal
////        public List<List<Integer>> levelOrder(TreeNode root) {
////            List<List<Integer>> result=new ArrayList<>();
////            if (root==null){
////                return result;
////            }
////            Queue<TreeNode> queue=new LinkedList<>();
////            queue.offer(root);
////
////            while(!queue.isEmpty()){
////                int levelsize=queue.size();
////                List<Integer> currentlevel=new ArrayList<>(levelsize);
////                for (int i=0;i<levelsize;i++){
////
////                    TreeNode currentnode=queue.poll();
////                    currentlevel.add(currentnode.val);
////                    if(currentnode.left!=null){
////                        queue.offer(currentnode.left);
////
////                    }
////                    if (currentnode.right!=null){
////                        queue.offer(currentnode.right);
////                    }
////                }
////                result.add(currentlevel);
////            }
////            return result;
////        }
////
////
//////        ques2:
////public List<Double> averageOfLevels(TreeNode root) {
////    List<Double> result=new ArrayList<>();
////    if (root==null){
////        return result;
////    }
////    Queue<TreeNode> queue=new LinkedList<>();
////    queue.offer(root);
////
////    while(!queue.isEmpty()){
////        int levelsize=queue.size();
////        double averagelevel=0;
////        for (int i=0;i<levelsize;i++){
////
////            TreeNode currentnode=queue.poll();
////            averagelevel+=currentnode.val;
////            if(currentnode.left!=null){
////                queue.offer(currentnode.left);
////
////            }
////            if (currentnode.right!=null){
////                queue.offer(currentnode.right);
////            }
////        }
////        averagelevel=averagelevel/levelsize;
////        result.add(averagelevel);
////    }
////    return result;
////
////}
////
////    public TreeNode findSucessor(TreeNode root,int key){
////
////        if (root==null){
////            return null;
////        }
////        Queue<TreeNode> queue=new LinkedList<>();
////        queue.offer(root);
////
////        while(!queue.isEmpty()){
////            int levelsize=queue.size();
////            double averagelevel=0;
////            for (int i=0;i<levelsize;i++){
////
////                TreeNode currentnode=queue.poll();
////                averagelevel+=currentnode.val;
////                if(currentnode.left!=null){
////                    queue.offer(currentnode.left);
////
////                }
////                if (currentnode.right!=null){
////                    queue.offer(currentnode.right);
////                }
////                if (currentnode.val=key){
////                    break;
////                }
////            }
////
////        }
////        return queue.peek();
////    }
//////    ques4:Binary Tree ZigZag Traversal
////
////    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
////        List<List<Integer>> result=new ArrayList<>();
////        if (root==null){
////            return result;
////        }
////        Deque<TreeNode> queue=new LinkedList<>();
////        queue.offer(root);
////
////        boolean reverse=false;
////
////        while(!queue.isEmpty()){
////            int levelsize=queue.size();
////            List<Integer> currentlevel=new ArrayList<>(levelsize);
////            for (int i=0;i<levelsize;i++){
////
////                if (!reverse){
////                    TreeNode currentnode=queue.poll();
////                    currentlevel.add(currentnode.val);
////                    if(currentnode.left!=null){
////                        queue.addLast(currentnode.left);
////
////                    }
////
////                }
////
////                reverse=!reverse;
////
////            }
////            result.add(currentlevel);
////        }
////        return result;
////    }
//
//

//            List<Integer> result=new ArrayList<>() ;
//            if (root==null){
//                return result;
//            }
//
//            Queue<TreeNode> queue=new LinkedList<>();
//            queue.offer(root);
//
//            while(!queue.isEmpty()){
//                int levelsize=queue.size();
//                for (int i = 0; i <levelsize ; i++) {
//                    TreeNode currentnode= queue.poll();
//
//                    if(i==levelsize-1){
//                        result.add(currentnode.val);
//                    }
//
//                    if (currentnode.left!=null){
//                        queue.offer(currentnode.left);
//
//                    }
//
//                    if(currentnode.right!=null){
//                        queue.offer(currentnode.right);
//                    }
//                }
//
//            }
//            return result;
//
//
//
//
//
//    }
//
//}

//ques7:Cousins in a binary tree(993)
//public class InterviewQuestions {
//    public boolean isCousins(TreeNode root, int x, int y) {
//        TreeNode xx = findNode(root, x);
//        TreeNode yy = findNode(root, y);
//
//        return (
//                (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy))
//        );
//
//
//    }
//    TreeNode findNode(TreeNode node,int x){
//        if(node==null){
//            return null;
//        }
//        if (node.val==x){
//            return node;
//        }
//        TreeNode n=findNode(node.left,x);
//        if(n!=null){
//            return n;
//        }
//        return findNode(node.right,x);
//    }
//
//    boolean isSibling(TreeNode node,TreeNode x,TreeNode y){
//        if(node==null){
//            return false;
//        }
//        return (
//                (node.left==x && node.right==y)||(node.left==x && node.right==y)
//                ||isSibling(node.left,x,y)||isSibling(node.right,x,y));
//    }
//
//    int level(TreeNode node ,TreeNode x,int lev){
//        if (node==null){
//            return 0;
//        }
//        if (node==x){
//            return lev;
//
//        }
//        int l=level(node.left,x,lev+1);
//
//        if(l!=0){
//            return l;
//        }
//        return  level(node.right,x,lev+1);
//    }
//}




//DFS
//public class InterviewQuestions {
//    int diameter=0;
//    public int diameterOfBinaryTree(TreeNode root) {
//        height(root);
//        return diameter;
//
//    }
//    int height(TreeNode node){
//        if (node==null){
//            return 0;
//        }
//        int leftheight=height(node.left);
//        int rightheight=height(node.right);
//        int dia =leftheight=rightheight+1;
//        diameter=Math.max(diameter,dia);
//        return Math.max(leftheight,rightheight)+1;
//
//    }
//
//}
//



//
//public class InterviewQuestions {
//    public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {
//
//     }
//     TreeNode(int val) {
//         this.val = val;
//     }
//
//
//
//    }
//    public Node sortedArrayToBST(int[] nums) {
//        int start=0;
//        int end=nums.length;
//        int mid=(start+end)/2;
//
//
//
//    }
//
//
//}

//ques 5
//public class InterviewQuestions {
//
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root ==null){
//            return null;
//        }
//
//        if (root==p||root==q){
//            return root;
//        }
//        TreeNode left=lowestCommonAncestor(root.left,p,q);
//        TreeNode right=lowestCommonAncestor(root.right,p,q);
//
//        if(left!=null&& right !=null){
//            return root;
//        }
//
//        return left==null ? right:left;
//    }
//
//}


//ques 6
//public class InterviewQuestions{
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root==null){
//            return false;
//        }
//        if (root.val==sum&&root.left==null&&root.right==null){
//            return true;
//        }
//        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
//
//    }
//}

