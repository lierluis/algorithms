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

    /**
     * This method removes the head from the linked list.
     * <p>
     * Time complexity: O(1) | Space complexity: O(1)
     */
    public void removeHead() {
        if (head != null) {
            head = head.next;
        }
        this.print();
    }

    /**
     * This method removes the last node from the linked list.
     * <p>
     * Time complexity: O(n) | Space complexity: O(1)
     */
    public void removeTail() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node current = head;
            Node next = current.next;
            while (next.next != null) {
                current = next;
                next = next.next;
            }
            current.next = null;
        }
        this.print();
    }

    /**
     * This method finds the middle node of a linked list (naive approach).
     * <p>
     * Time complexity: O(n) | Space complexity: O(1)
     *
     * @return the middle node
     */
    public Node findMiddleNode() {
        if (head == null || head.next == null) {
            return head;
        }

        // count nodes in linked list
        Node current = head;
        int count = 1;
        while (current.next != null) {
            current = current.next;
            count++;
        }

        // move to middle node
        current = head;
        for (int i = 0; i < (count-1)/2; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * This method finds the middle node of a linked list in a single pass.
     * <p>
     * Time complexity: O(n) | Space complexity: O(1)
     *
     * @return the middle node
     */
    public Node findMiddleNodeV2() {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && (fast.next).next != null) {
            slow = slow.next;
            fast = (fast.next).next;
        }
        return slow;
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
        ll.removeHead();
        ll.removeTail();
        System.out.printf("Middle node: %d%n", ll.findMiddleNodeV2().data);
    }
}
