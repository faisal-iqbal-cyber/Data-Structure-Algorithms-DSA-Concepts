public class BinarySearchTree{
	Node root;
	
	BinarySearchTree(){
		root=null;
	}
	public void insert(int data){
		root=insertRecursive(root,data);
	}
	public Node insertRecursive(Node root, int data){
		if(root==null){
			root=new Node(data);
			return root;
		}
		if(data<root.data){
			root.left=insertRecursive(root.left,data);
		}else if(data>root.data){
			root.right=insertRecursive(root.right,data);
		}
		return root;

	}//insertRecursive
	public void delete(int data){
		root=deleteRecursive(root,data);
	}
	public Node deleteRecursive(Node root,int data){
		if(root==null){
			return root;
		}
		if(data<root.data){
			root.left=deleteRecursive(root.left,data);
		}else if(data>root.data){
			root.right=deleteRecursive(root.right,data);
		}else{
			if(root.left==null){
				return root.right;
			}else if(root.right==null){
				return root.left;
			}
			root.data=minValue(root.right);
			root.right=deleteRecursive(root.right,root.data);
		}
		return root;

	}
	public int minValue(Node root){
		int min=root.data;
		while(root.left!=null){
			min=root.left.data;
			root=root.left;
		}
		return min;
	}
	public boolean Search(int data){
		boolean result=searchRecursive(root,data);
		return result;
	}
	public boolean searchRecursive(Node root,int data){
		if(root==null){
			return false;
		}else if(data==root.data){
			return true;
		}
		if(data<root.data){
			return searchRecursive(root.left,data);
		}else{
			return searchRecursive(root.right,data); 
		}
		
	}
	public void InOrder(Node root){
		if(root!=null){
			InOrder(root.left);
			System.out.print(root.data+" ");
			InOrder(root.right);
		}

	}


}//class 