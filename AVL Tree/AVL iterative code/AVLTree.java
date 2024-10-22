import java.util.Stack;
public class AVLTree{
	private Node root;

	AVLTree(){
		this.root=null;
	}
	public int height(Node node){
		if(node==null){
			return 0;
		}
		else{
			return node.height;
		}
	}

	public int max(int a, int b){
		if(a>b){
			return a;
		}
		return b;
	}
	public int getBalance(Node node){
		if(node==null){
			return 0;
		}
		return height(node.left)-height(node.right);
	}

	public Node rotateLeft(Node x){
		Node y=x.right;
		Node T2=y.left;

		y.left=x;
		x.right=T2;

		x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

		return y;
	}
	public Node rotateRight(Node x){
		Node y=x.left;
		Node T2=y.right;
		x=y.right;
		T2=x.left;

		x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;

	}

	public Node insert(int key){
		Node newNode=new Node(key);
		if(root==null){
			root=newNode;
			return newNode;
		}
		
			Node parent=null;
			Node current=root;

			Stack<Node> stack=new Stack<>();

			while(current!=null){
				stack.push(current);
				parent=current;
				if(key<current.key){
					current=current.left;
				}
				else if(key>current.key){
					current=current.right;
				}
			}

			if(key<parent.key){
				parent.left=newNode;
			}
			else{
				parent.right=newNode;
			}

			
			while(!stack.isEmpty()){
				current=stack.pop();
				current.height=1+max(height(current.left),height(current.right));
				int balance=getBalance(current);

				if(balance>1 && key<current.left.key){
					current=rotateRight(current);
				}
				else if(balance<-1 && key>current.right.key){
					current=rotateLeft(current);
				}
				else if(balance>1 && key>current.left.key){
					current.left=rotateLeft(current.left);
					current=rotateRight(current);

				}
				else if(balance<-1 && key<current.right.key){
					current.right=rotateRight(current.right);
					current=rotateLeft(current);
				}

				if(stack.isEmpty()){
					root=current;
				}
				else{
					parent=stack.peek();
					if(current.key<parent.key){
						parent.left=current;
					}
					else{
						parent.right=current;
					}
				}
			}//while

		return newNode;
	}//insert

	public Node delete(Node root, int key) {
    Node current = root;
    Node parent = null;
    boolean isLeftChild = false;

    while (current != null && current.key != key) {
        parent = current;
        if (key < current.key) {
            current = current.left;
            isLeftChild = true;
        } else {
            current = current.right;
            isLeftChild = false;
        }
    }

    if (current == null) {
        return root; // Key not found, return the original root
    }

    // Case 1: Node to be deleted has no children
    if (current.left == null && current.right == null) {
        if (current == root) {
            root = null;
        } else if (isLeftChild) {
            parent.left = null;
        } else {
            parent.right = null;
        }
    }
    // Case 2: Node to be deleted has only one child
    else if (current.left == null) {
        if (current == root) {
            root = current.right;
        } else if (isLeftChild) {
            parent.left = current.right;
        } else {
            parent.right = current.right;
        }
    } else if (current.right == null) {
        if (current == root) {
            root = current.left;
        } else if (isLeftChild) {
            parent.left = current.left;
        } else {
            parent.right = current.left;
        }
    }
    // Case 3: Node to be deleted has two children
    else {
        Node successor = getSuccessor(current);

        if (current == root) {
            root = successor;
        } else if (isLeftChild) {
            parent.left = successor;
        } else {
            parent.right = successor;
        }

        successor.left = current.left;
    }

    // Update height and balance factors
    if (root != null) {
        root.height = max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0) {
            return rotateRight(root);
        }

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0) {
            return rotateLeft(root);
        }

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
    }

    return root;
}

public Node getSuccessor(Node node) {
    Node successorParent = node;
    Node successor = node;
    Node current = node.right;

    while (current != null) {
        successorParent = successor;
        successor = current;
        current = current.left;
    }

    if (successor != node.right) {
        successorParent.left = successor.right;
        successor.right = node.right;
    }

    return successor;
}


	public  void preOrder(Node node) {
        if (node != null) {
           
           
             System.out.print(node.key + " ");
              preOrder(node.left);
            preOrder(node.right);
        }
    }

	public static void main(String[] args) {
		AVLTree t1=new AVLTree();
		t1.insert(30);
		t1.insert(25);
		t1.insert(40);
		t1.insert(15);
		t1.insert(28);
		t1.insert(38);
		t1.insert(46);
		t1.insert(10);
		t1.insert(17);
		t1.insert(26);
		t1.insert(29);
		t1.insert(50);
		t1.insert(55);
		t1.insert(18);

		System.out.println("Preorder traversal" +
                " of constructed tree is : ");
        t1.preOrder(t1.root);
        System.out.println();

        t1.delete(t1.root,28);
        t1.preOrder(t1.root);
	}
}//class