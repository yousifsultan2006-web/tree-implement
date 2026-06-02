public class TreeNode<T> {
 public TreeNode<T> left;
 public TreeNode<T> right;
 public T value;
    


//TreeNode of Integers (TreeNode<Integer>)
 public TreeNode (T value, TreeNode<T> left) {
   this.value = value;
   this.left = left;
    

 }


 public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
    
   this.left = left;
   this.right = right;
   this.value = value;
    
 }

 public TreeNode(T value) {
   this.value = value;
 }
}