import java.util.*;

public class node {

	
	static int val;
	node left;
	node right;
	node(int val)
	{
		node.val = val;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		node tree1 = new node(val:5);
		tree1.left = new node(val:3);
		tree1.left.left = new node(val:1);
		tree1.right = new node(val:7);
		tree1.right.left = new node(val:6);
		
		node tree2 = new node(val:3);
		tree2.left = new node(val:1);
		tree2.right = new node(val:6);
		tree2.right.left = new node(val:5);
		tree2.right.right = new node(val:7);
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		inorder(tree1,list1);
		inorder(tree2, list2);
		
		System.out.println(list1.equals(list2));
		
	}
	
	private static void inorder(node root, List<Integer> list)
	{
		if(root = null) return;
		
		inorder(root.left,list)
		list.add(node.val);
		inorder(root.right,list);
		
	}

}
