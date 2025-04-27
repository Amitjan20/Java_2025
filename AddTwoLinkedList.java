package interview;

//2 non-empty linked list, add nodes of each and put  results on the other linked list
//l1 = [2,4,3]
//l2 = [5,6,4]
//op = [7,0,8]

public class AddTwoLinkedList {

	public static void main(String[] args) {

		Node headb = new Node(3, null);
		Node heada = new Node(4, headb);
		Node head1 = new Node(2, heada);

		Node headm = new Node(4, null);
		Node headl = new Node(6, headm);
		Node head2 = new Node(5, headl);

		Node result = addTwoList(head1, head2);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

	public static Node addTwoList(Node n1, Node n2) {

		int carry = 0;
		Node dummy = new Node();
		Node result = dummy;

		while (n1 != null || n2 != null) {
			int sum = carry;

			if (n1 != null) {
				sum += n1.val;
				n1 = n1.next;
			}

			if (n2 != null) {
				sum += n2.val;
				n2 = n2.next;
			}

			carry = sum / 10;
			Node addNode = new Node();
			addNode.setVal(sum % 10);
			result.setNext(addNode);
			result = result.next;

		}
		return dummy.next;
	}

}

class Node {
	int val;
	Node next;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int val, Node next) {
		super();
		this.val = val;
		this.next = next;
	}

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

}
