// Linked list implementation in Java

class LinkedList1 {
    // Creating a node
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();

        // Assign value values
        linkedList1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connect nodess
        linkedList1.head.next = second;
        second.next = third;

        // printing node-value
        while (linkedList1.head != null) {
            System.out.print(linkedList1.head.value + " ");
            linkedList1.head = linkedList1.head.next;
        }
    }
}
