// import javax.swing.tree.TreeCellRenderer;

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

                
    preorder(stringRoot);
    postorder(root);
    printGreaterThan(root, 1);
  }
  public static void preorder(TreeNode<?> current) {
    if (current == null) return;
    System.out.println(current.value);

    preorder(current.left);
    preorder(current.right);
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
     
  
}

