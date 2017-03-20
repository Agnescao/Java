class Node {
	int key;
	String name;
	Node left;
	Node right;

	Node(int k, String nm, Node ll, Node rr) {
		key = k;
		name = nm;
		left = ll;
		right = rr;
	}
}

public class BSTree {
	private Node head;
	private Node tail;

	public BSTree() {
		tail = new Node(0, null, null, null);
		head = new Node(-1, null, null, tail);
	}

	void insert(int k, String nm) {
		Node p, x;
		p = head;
		x = head.right;
		while (x != tail) {
			p = x;
			x = (k < x.key) ? x.left : x.right;
		}
		x = new Node(k, nm, tail, tail);
		if (k < p.key)
			p.left = x;
		else
			p.right = x;
	}

	void display_tree() {
		System.out.println("\nComplete Tree : ");
		Node t = head.right;
		traverse(t);
	}

	void traverse(Node t) {
		if (t != tail) {
			traverse(t.left);
			visit(t);
			traverse(t.right);
		}
	}

	String search(int key) {
		Node x = head.right;
		tail.key = key;
		String res = "Not Found";
		boolean found = false;
		while (x != tail && found == false) {
			if (key == x.key)
				found = true;
			else if (key < x.key)
				x = x.left;
			else
				x = x.right;
		}
		if (x == tail)
			return res;
		else
			return x.name;

	}

	void visit(Node t) {
		System.out.println(" Node: " + t.key + "  " + t.name);
	}

	public static void main(String[] args) {
		BSTree t1 = new BSTree();
		t1.insert(5, "peter");
		t1.insert(2, "john");
		t1.insert(10, "martin");
		t1.insert(0, "sean");
		t1.insert(12, "liam");
		t1.insert(7, "mick");
		t1.insert(6, "brian");

		t1.display_tree();
		String res = t1.search(10);
		int n = Console.readInt("Enter Value:");
		System.out.println(" Name: " + res);
		System.out.println(" Name: " + t1.search(n));

	}
}