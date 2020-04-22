import java.util.*;

public class nodeChain {


	public class Node1 {
	    
	    public final int value {
	        get {
	        }
	        set {
	        }
	    }
	    
	    public final Node1 next {
	        get {
	        }
	        set {
	        }
	    }
	}
	class Node {
	    
	    static void Main(string[] args) {
	        nodeChain first = new Node1[] {
	                value=3};
	        Node1 middle = new Node1[] {
	                value=5};
	        first.next = middle;
	        Node1 last = new Node1[] {
	                value=10};
	        middle.next = last;
	        Node.printList(first);
	    }
	    
	    private static void printList(Node1 node) {
	        while ((node != null)) {
	            Console.WriteLine(node.value);
	            node = node.Next;
	        }
	        
	    }
	}
	
	        
	  
