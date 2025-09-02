package Trees;
import java.util.Scanner;
public class binaryTree {


    public binaryTree() {
    }

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {

            this.val = val;
        }
    }
    private Node root;

//    insert elements

    public void populate(Scanner scanner){
        System.out.println("Enter the root  Node:");

        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do You Want To Enter Left of"+node.val);
        boolean left=scanner.nextBoolean();
        if (left){
            System.out.println("Eneter the value  of the left of"+node.val);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do You Want To Enter Right of"+node.val);
        boolean right=scanner.nextBoolean();
        if (right){
            System.out.println("Eneter the value  of the right of"+node.val);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }
    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node,int level){
        if (node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if (level!=0){
            for (int i=0;i<level-1;i++){
                System.out.println("|\t\t");
            }
            System.out.println("|------>"+node.val);
        }else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        binaryTree tree=new binaryTree();
        tree.populate(sc);
        tree.prettyDisplay();

    }


}
