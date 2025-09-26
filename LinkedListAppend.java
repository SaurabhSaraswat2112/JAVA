// Append the element to the linked list

public class LinkedListAppend {

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

        // Function to append a new node at the end of the linked list
        public void append(int new_data) {
            Node new_node = new Node(new_data);

            if (head == null) {
                head = new_node;
                return;
            }

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        // Function to print the linked list
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

        list.append(10);
        list.append(20);
        list.append(30);

        list.printList(); // Output: 10 -> 20 -> 30 -> null
    }
}
