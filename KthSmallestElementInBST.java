package jan2025;

public class KthSmallestElementInBST {

	public static int kthSmallestRecur(Node root, int[] cnt, int k) {
		if (root == null)
			return -1;

		// Process left subtree.
		int left = kthSmallestRecur(root.left, cnt, k);

		// If kth smallest is found in left
		// subtree, then return it.
		if (left != -1)
			return left;

		// increment node count
		cnt[0]++;

		// If curr node is kth smallest,
		// return it.
		if (cnt[0] == k)
			return root.data;

		// Else process the right subtree
		// and return its value.
		int right = kthSmallestRecur(root.right, cnt, k);
		return right;
	}

	// Function to find kth smallest value in BST.
	public static int kthSmallest(Node root, int k) {
		int[] cnt = { 0 };
		return kthSmallestRecur(root, cnt, k);
	}

	public static void main(String[] args) {

		// Binary search tree
		// 20
		// / \
		// 8 22
		// / \
		// 4 12
		// / \
		// 10 14
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		int k = 3;

		System.out.println(KthSmallestElementInBST.kthSmallest(root, k));
	}

	
}
