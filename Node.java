

public class Node {


	Node parent, leftChild, rightChild;
	//using int data type here cause I'm too lazy to do Generic 
	int data;
	
	//assign nodes BST position later in 'add' function
	Node(int data)
	{
		this.data = data;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
			
	}

	


}
