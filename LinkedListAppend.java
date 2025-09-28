public class LinkedListAppend{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Method to append a new node at the end of the list
        public void append(int newData) {
            Node newNode = new Node(newData);
            if (head == null) {
                head = newNode;
                return;
            }
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList(); // Output: 1 -> 2 -> 3 -> null
    }
}
