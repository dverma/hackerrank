package challenges;

import java.util.HashSet;
import java.util.Set;

import challenges.FirstCommonAncestor.Node;

interface FirstCommonAncestor
{
	class Node
	{
		Node	parent;
		final Node	left;
		final Node	right;
		final String label;

		public Node(Node parent, Node left, Node right, String label)
		{
			this.parent = parent;
			this.left = left;
			this.right = right;
			this.label = label;
		}

		boolean isRoot()
		{
			return parent == null;
		}
		
		@Override
		public String toString()
		{
			// TODO Auto-generated method stub
			return this.label;
		}
	}
	//IMPLEMENT THIS FUNCTION
	/**
     * Given two nodes of a tree,
     * method should return the deepest common ancestor of those nodes.
     *
     *          A        
     *         / \        
     *        B   C     
     *       / \
     *      D   E
     *         / \
     *        G   F
     *
     *  commonAncestor(D, F) = B
     *  commonAncestor(C, G) = A
     *  commonAncestor(E, B) = B
     */
    Node commonAncestor(Node one, Node two);
}

class CA implements FirstCommonAncestor
{

	@Override
	public Node commonAncestor(Node one, Node two)
	{
		Set<Node> parents = new HashSet<Node>();
		Node temp1 = one;
		while(!temp1.isRoot())
		{
			parents.add(temp1);
			temp1 = temp1.parent;
		}
		
		Node temp2 = two;
		while(!temp2.isRoot())
		{
			if(parents.contains(temp2))
				return temp2;
			temp2 = temp2.parent;
		}
		return temp1.equals(temp2)?temp1: null;
	}
	
}

public class CommonAncestor
{
	public static void main(String[] args)
	{
		Node G = new Node(null, null, null, "G");
        Node F = new Node(null, null, null, "F");
        
        Node E = new Node(null, G, F, "E");
        G.parent = E; F.parent = E;
        
        Node D = new Node(null, null, null, "D"); 
     
        Node B = new Node(null, D, E, "B"); D.parent = B; E.parent = B;
        
        Node C = new Node(null, null, null, "C"); 
        
        Node A = new Node(null, B, C, "A"); B.parent = A; C.parent = A;
        
        Node H = new Node(null,null,null,"H");
        
        CA ca = new CA();
        System.out.println(ca.commonAncestor(D, H));
        System.out.println(ca.commonAncestor(C, G));
        System.out.println(ca.commonAncestor(E, B));
	}
}