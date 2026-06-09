// import javax.swing.tree.TreeCellRenderer;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
  public static void main(String[] args) {

    TreeNode<Integer> root = new TreeNode<>(10);

    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);
  

    TreeNode<String> stringRoot = new TreeNode<>("Hello");

    stringRoot.left = new TreeNode<>("hi");
    stringRoot.left.left = new TreeNode<>("yo");
    stringRoot.left.right = new TreeNode<>("wasgood");

    stringRoot.right = new TreeNode<>("sfd");

    TreeNode<Integer> megaRoot = new TreeNode<>(1);

TreeNode<Integer> current = megaRoot;
    for(int i = 1; i < 100_001; i++) {
      current.right = new TreeNode<Integer>(1);
      current = current.right;

    }


                
    //preorder(root);
    //postorder(root);
    //printGreaterThan(root, 1);
    preorderIterative(root);
  }
  public static void preorder(TreeNode<?> current) {
    if (current == null) return;
    System.out.println(current.value);

    preorder(current.left);
    preorder(current.right);
  }

  public static void preorderIterative(TreeNode<?> root) {
    Stack<TreeNode<?>> stack = new Stack<>();
  stack.push(root);
    while(!stack.isEmpty()) {
      //do something
      TreeNode<?> current = stack.pop();
      if(current == null) continue;
      System.out.println(current.value);
      stack.push(current.right);
      stack.push(current.left);
    }

    
  }

  public static void levelOrder(TreeNode<?> root) {

    Queue<TreeNode<?>> queue = new LinkedList<>(); 
      queue.offer(root);

      while(!queue.isEmpty()) {
        TreeNode<?> current =  queue.remove();
        if(current==null) continue;
        System.out.println(current.value);
        queue.offer(current.left);
        queue.offer(current.right);
      }

      
    };
  }

  public static <E> void postorder(TreeNode<E> current) {
    if(current==null) return;
    postorder(current.left);
    postorder(current.right);
    E myValue = current.value;
    System.out.println(myValue);
  }

  public static void inOrder(TreeNode<?> current) {
    if(current==null) return;
    inOrder(current.left);
    System.out.println(current.value);
    inOrder(current.right);
  }


   public static void printGreaterThan(TreeNode<Integer> current, int threshold) {
        if (current == null) {return;}

        if (current.value > threshold) {
            System.out.println(current.value );

        }
        printGreaterThan(current.left, threshold);
        printGreaterThan(current.right, threshold);
     }

     public static int countNodes(TreeNode<?> current) {
      //bool? if true:else
      return current == null ? 0 : 1 + countNodes(current.left) + countNodes(current.right);
      // if (current == null) return 0;
      // //count of all nodes in the left subtree

      // int leftCount = countNodes(current.left);
      // int rightCount = countNodes(current.right);
      // int totalCount = leftCount + rightCount + 1;
      // return totalCount;

     }
     
  
}

