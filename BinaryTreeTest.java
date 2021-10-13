import static org.junit.Assert.*;

import org.junit.*;

public class BinaryTreeTest {

	//just here temp so that I have something to come back to



	@Test
	public void testAddtoEmpty() 
	{
		//add_method is inherently tied to add() so I've decided not to write a sepearate test case for it.
		
		//creation of empty Binary Tree 
		BinaryTree myTree = new BinaryTree();
		//creation of Nodes 
		Node N = new Node(10);
		
		//testing add works for adding to an empty BST 
		myTree.add(N);
		assertEquals("1:data !=", 10, myTree.root.data);
		
	}
	
	@Test
	public void testAddMultiple()
	{
		//testing add method for general use. 
		BinaryTree myTree2 = new BinaryTree();
		Node A, B, C, D, E; 
		A = new Node(10);
		B = new Node(5);
		C = new Node(15);
		D = new Node(7);
		E = new Node(20);
		
		myTree2.add(A);
		myTree2.add(B);
		myTree2.add(C);
		myTree2.add(D);
		myTree2.add(E); 
		
		//for reference the tree should look like 
		//				A
		//		B				C
		//	0		D		0		E
		
		int test = myTree2.root.leftChild.data;
		System.out.println(myTree2.root.leftChild.data);
		assertEquals("1: testing left child", test, B.data);
		
		Node testNode = myTree2.root.rightChild.leftChild;
		assertEquals("2: testing right left leaft(Null)", null, testNode);
		
		test = myTree2.root.leftChild.rightChild.data;
		assertEquals("3: testing leaf", D.data, test);
	
	}


	//testing method relies on adding method being valid.
	@Test
	public void testLCAThree() 
	{
		BinaryTree myTree = new BinaryTree(); 
		Node A, B, C;
		
		A = new Node(10);
		B = new Node(5);
		C = new Node(15);

		
		myTree.add(A);
		myTree.add(B);
		myTree.add(C);


	 
		//tree should look like this 
		//					A
		//		B						C
		//	F		D				G		E
		
	
		int test = myTree.LCA(myTree.root, B.data, C.data).data;
		assertEquals("testing Lca with direct ancestor", myTree.root.data, test);
	}
	@Test
	public void testLCANonRoot()
	{
		BinaryTree myTree = new BinaryTree(); 
		Node A, B, C, D, E, F, G;
		
		A = new Node(10);
		B = new Node(5);
		C = new Node(15);
		D = new Node(7);
		E = new Node(20);
		F = new Node(1);
		G = new Node(13);
		
		myTree.add(A);
		myTree.add(B);
		myTree.add(C);
		myTree.add(D);
		myTree.add(E);
		myTree.add(F);
		myTree.add(G);
	 
		//tree should look like this 
		//					A
		//		B						C
		//	F		D				G		E
		
		int test = myTree.LCA(myTree.root, F.data, D.data).data;
		assertEquals("testing LCA using non-root", B.data, test);
		
	}
	
	@Test
	public void testLCAGrandad()
	{
		BinaryTree myTree = new BinaryTree(); 
		Node A, B, C, D, E, F, G;
		
		A = new Node(10);
		B = new Node(5);
		C = new Node(15);
		D = new Node(7);
		E = new Node(20);
		F = new Node(1);
		G = new Node(13);
		
		myTree.add(A);
		myTree.add(B);
		myTree.add(C);
		myTree.add(D);
		myTree.add(E);
		myTree.add(F);
		myTree.add(G);
	 
		//tree should look like this 
		//					A
		//		B						C
		//	F		D				G		E
		
		int test = myTree.LCA(myTree.root, F.data, G.data).data;
		assertEquals("testing LCA with ancestor above parent", myTree.root.data, test);
	}
	
	


}
