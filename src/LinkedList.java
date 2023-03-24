public class LinkedList {
    private Node head;

    // constructor
    public LinkedList() {
        head = null;
    }

    // method untuk menambahkan node ke linked list
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            // mencari posisi untuk menyisipkan node baru agar tetap terurut
            Node prev = null;
            Node curr = head;
            while (curr != null && value > curr.getValue()) {
                prev = curr;
                curr = curr.getNext();
            }
            if (prev == null) {
                // node baru menjadi head
                newNode.setNext(head);
                head = newNode;
            } else {
                // menyisipkan node baru
                prev.setNext(newNode);
                newNode.setNext(curr);
            }
        }
    }

    // method untuk mencetak isi linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getValue() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    // inner class untuk merepresentasikan node
    private class Node {
        private int value;
        private Node next;

        // constructor node
        public Node(int value) {
            this.value = value;
            next = null;
        }

        // getter dan setter
        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
