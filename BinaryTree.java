//simple binary tree for Software Engineering Assignment
//Note to myself: Nothing elegant at all, mostly spahgetti code 


public class BinaryTree 
{

	 Node root;
	
	BinaryTree()
	{
		
	}
	 

	
	public void add(Node newNode)
	{
		root = add_Method(root, newNode.data);
	}
	
	public Node add_Method(Node root, int data)
	{
			
		if(root == null)
		{
			
			root = new Node(data);
			return root;
		}
		
		if(data > root.data)
		{
			root.rightChild = add_Method(root.rightChild, data);
		}
		else
		{
			root.leftChild = add_Method(root.leftChild, data);
		}
		return root;

	}
	
	//this makes more sense. I was going to try and put everything into an array and 
	//calculate the parents into another list, repeat for b and search for the closest match
	//which would have worked but this is infinity times better.
	public static Node LCA (Node root, int a, int b)
	{
		while(root != null)
		{
			if(root.data > a && root.data > b) root = root.leftChild;
			else if(root.data < a && root.data < b) root = root.rightChild;
			else break;
		}
		
		return root;
	}
	
/*	See this as the idiotic attempt trying it blind and forgetting that I didn't do 
 * parents or having a function to put everything into an array
 * 
	public static Node lowestCommonAncestor(Node A, Node B)
	{
		ArrayList<Integer> A_list = new ArrayList<Integer>();
		A_list = getAncestors(A);
		ArrayList<Integer> B_list = new ArrayList<Integer>();
		B_list = getAncestors(B);
		
		for(int index = 0; index < A_list.size(); index++)
		{
			int a = A_list.get(index);
			for(int j = 0; j < B_list.size(); j++)
			{
				int b = B_list.get(j);
				
				if(a == b) return getNode(a);
			}
		}
		
		return null;
	}
	
	public static ArrayList<Integer> getAncestors(Node child)
	{
		ArrayList<Integer> ancestorList = new ArrayList<Integer>();
		
		if(child == root)
		{
			return null;
		}
		
		System.out.println(child.data);
		for(Node currentNode = child; currentNode != root; currentNode = currentNode.parent)
		{
			ancestorList.add(currentNode.parent.data);
		}
		
		return ancestorList;
	}
*/	
	
						//I thought I needed this but didn't need it
/*
	public Node getNode(int key)
	{
		Node foundNode = searchTree(root, key);
		return foundNode;
	}
	
	public static Node searchTree(Node parent, int data)
	{
		if(parent == null)
		{
			System.out.println("Node not found");
		}
		
		
		if(data > parent.data) return searchTree(parent.rightChild, data);
		else if(data < parent.data ) return searchTree(parent.leftChild, data );
		
		//found match
		return parent;
		
	}
*/
}

