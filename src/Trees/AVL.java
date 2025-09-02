package Trees;

public class AVL {
    ;

    public AVL() {
    }

    public class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    /*inserting a element*/
    private Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }


    public void insert(int value){
        root=insert(value,root);
    }

    private Node insert(int value,Node node){
        if (node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }

        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
//            left heavy
            if(height(node.left.left)-height(node.left.right)<0){
//                left left case
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)>0){
//                right left case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }



        if(height(node.left)-height(node.right)<-1){
//           right heavy
            if(height(node.right.left)-height(node.right.right)>0){
//                right right case
                return rightRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)<0){
//             left right case
                node.right=rightRotate(node.left);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);
        return c;
    }

    public Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;


         p.left=c;
         c.right=t;

        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);
        return p;
    }


    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)- height(node.right))<=1 && balanced(node.left )&balanced(node.right);
    }

    public void populate(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            this.insert(nums[i]);
        }
    }

    public void populatedsorted(int[]nums){
        populatedsorted(nums,0,nums.length);
    }
    private void populatedsorted(int[]nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(nums[mid]);
        populatedsorted(nums,start,end);
        populatedsorted(nums,mid+1,end);
    }
    public void display(){
        display(root ,"Root Node");
    }
    private void display(Node node,String details){
        if (node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left child of" + node.getValue() + " : ");
        display(node.right,"right child of" + node.getValue() + " : ");
    }

    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }

    private void Inorder(Node node){
        if (node==null){
            return;
        }

        Inorder(node.left);
        System.out.println(node.value+" ");
        Inorder(node.right);
    }
    private void postorder(Node node){
        if (node==null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value+" ");
    }
}
