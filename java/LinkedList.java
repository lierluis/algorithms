class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }
    public LinkedList(Node head) {
        this.head = head;
    }

    /**
     * This method adds a new node to the linked list.
     * <p>
     * Time complexity: O(n) | Space complexity: O(1)
     *
     * @param newNode the new node to add to the linked list
     */
    public void add(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.print();
    }

    /**
     * This method adds a node to the front of a linked list.
     * <p>
     * Time complexity: O(1) | Space complexity: O(1)
     *
     * @param newNode the new node to add to the beginning of the linked list
     */
    public void addToHead(Node newNode) {
        newNode.next = head;
        head = newNode;
        this.print();
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(new Node(1));
        ll.add(new Node(2));
        ll.add(new Node(3));
        ll.addToHead(new Node(0));
        ll.add(new Node(4));
    }
}
