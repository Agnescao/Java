package rmiServer;

public class BSTree {
	public Node root;
	
// method to add a node into the binary tree
	public void insert(int k, String nm, int b, String town, String city) {
		Node newNode=new Node(k,nm,b,town,city);
		if(root==null){
			root=newNode;
		}else{
			Node focusNode=root;
			Node parent;
			while(true){
				parent=focusNode;
				if(k<focusNode.key){
					focusNode=focusNode.left;
					if(focusNode==null){
						parent.left=newNode;
						return ;
					}
				}else{
					focusNode=focusNode.right;
					if(focusNode==null){
					parent.right=newNode;
					return ;
					}
				}
				
			}
		}
	}
    // display all data of customers
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode !=null){
			System.out.println(focusNode);
			
			if(focusNode.left!=null){
				inOrderTraverseTree(focusNode.left);}
			if(focusNode.right!=null){
				inOrderTraverseTree(focusNode.right);}
		}
	}
	// search customer by ID
	public Node findNodeByID(int key){
		Node focusNode=root;
		while(focusNode.key!=key){
			if(key<focusNode.key){
				focusNode=focusNode.left;
			}else focusNode=focusNode.right;
			
			if(focusNode==null)
				return null;
		}
		return focusNode;
	}
	void visit(Node t, String nm) {
		// TODO Auto-generated method stub
		System.out.println("Node:" + t.key + " " + t.name +"   Balance:"+t.balance +"  Town:"+t.m_address.getTown()+"  City:"+t.m_address.getCity());
		if (nm.equals(t.name)) {
			System.out.println("successfully !");
			
		} else {
			System.out.println("failed !");

		}
	}
	//search customer by customer's name
	void traverse(Node t, String nm) {
		// TODO Auto-generated method stub
		 
			if (t.left != null)
			traverse(t.left, nm);
			visit(t, nm);
			if (t.right != null)
			traverse(t.right, nm);
		
	}

	
	
	//delete a node by Id
	public boolean remove(int id){
	      
	        Node focusNode=root;
	        Node parent=root;
	        boolean isItALeftChild=true;
	        while(focusNode.key !=id){
	        	parent=focusNode;
	        	if(id<focusNode.key){
	        		isItALeftChild=true;
	        		focusNode=focusNode.left;
	        		
	        	}else{
	        		isItALeftChild=false;
	        		focusNode=focusNode.right;
	        	}
	        	if(focusNode==null)
	        		return false;
	        }
	        //if the focusNode has no children
			if(focusNode.left==null && focusNode.right==null){
				if(focusNode==root){
					root=null;
				}else if(isItALeftChild){
					parent.left=null;
				}else {
					parent.right=null;
				}
			}
			//if the focusNode has only left child
			else if(focusNode.left !=null && focusNode.right==null){
				if(focusNode==root)
					root=focusNode.left;
				else if(isItALeftChild)
					parent.left=focusNode.left;	
				else parent.right=focusNode.left;
			}
			// if the focusNode has only right child
			else if(focusNode.left==null && focusNode.right!=null){
				if(focusNode==root)
					root=focusNode.right;
				else if(isItALeftChild)
					parent.left=focusNode.right;
				
				else
					parent.right=focusNode.right;
				
				
			}
			else{//if the focusNode has two children 
				Node replacement=get(focusNode);
				if(focusNode==root)
				root=replacement;
				else if (isItALeftChild)
					parent.left=replacement;
				else
					parent.right=replacement;
				   replacement.left=focusNode.left;
				   
			}
			return true;
		}
	//if the node which we want to delete has two children ,we need to find out a node to replace it in its right children.
	  public Node get(Node replaced){
		  Node replacementParent=replaced;
		  Node replacement=replaced;
		  Node focusNode=replaced.right;
		  while(focusNode !=null){
			  replacementParent=replacement;
			  replacement=focusNode;
			  focusNode=focusNode.left;
			  
		  }
		  if(replacement !=replaced.right){
			  replacementParent.left=replacement.right;
			  replacement.right=replaced.right;
			  
		  }
		  
		  return replacement;
		  
		  
	  }
	  /**
	   * Count the nodes in the binary tree to which root points, and
	   * return the answer.  If root is null, the answer is zero.
	   */
	 public int countNodes( Node root ) {
		   if ( root == null )
		      return 0;  // The tree is empty.  It contains no nodes.
		   else {
		      int count = 1;   // Start by counting the root.
		      count += countNodes(root.left);  // Add the number of nodes
		                                       //     in the left subtree.
		      count += countNodes(root.right); // Add the number of nodes
		                                       //    in the right subtree.
		      return count;  // Return the total.
		   }
		} // end countNodes()
}