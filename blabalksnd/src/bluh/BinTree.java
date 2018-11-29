package bluh;

public class BinTree {
 private Node root;

 public void insertNode(Node node)
 {
	 root = insert(root, node);
 }
 /*
 * 1. Pass the exsisting node into BinTree
 * 2. Return Tree with new Node.
 */
 private Node insert(Node tree, Node node)
   {
	 System.out.println("Node was successfully added");
     Node temp = tree;
     if(root == null)
         return node;
     
     while(true)
     {
         if(node.key <= temp.key)
             if(temp.left == null)
             {
             	temp.left = node;
                 return tree;
             }
             else
                 temp = temp.left;
         else
             if(temp.right == null)
             {
             	temp.right = node;
                 return tree;
             }
             else
                 temp = temp.right;
     } 
   }
 /*
  * 1. Tree will be printed in order
  */

 private void inOrder(Node tree)
   {
	 if (tree != null)
	 {
		 inOrder(tree.left);
		 System.out.println(tree.key);
		 inOrder(tree.right);
	 }
	 
   }
	public void treeWalk() 
	{
		inOrder(root);
	}

}
 
 
 
 
 
 
 

