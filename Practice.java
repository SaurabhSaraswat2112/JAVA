// 1 . Append Data to a linked list

// public class Practice{
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class LinkedList{
//         Node head;

//         public void append(int newData){
//             Node newNode = new Node(newData);

//             if(head == null){
//                 head = newNode;
//                 return;
//             }
//             Node last = head;
//             while(last.next != null){
//                 last = last.next;
//             }
//             last.next = newNode;
//         }
//         public void printList(){
//             Node curr = head;
//             while(curr != null){
//                 System.out.print(curr.data + " -> ");
//                 curr = curr.next;
//             }
//             System.out.println("null");
//         }
//     }
//     public static void main(String[] args){
//         LinkedList list = new LinkedList();
//         list.append(10);
//         list.append(20);
//         list.printList();
//     }
// }







// 2 . Iterate all elements in a linked list from specified Index


// import java.util.LinkedList;
// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the starting index: ");
//         int n = sc.nextInt();
//         LinkedList<Integer> list = new LinkedList<Integer>();

//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);
//         list.add(60);
//         list.add(70);
//         list.add(80);

//         for(int i = n; i < list.size(); i++){
//             System.out.print(list.get(i)+" -> ");
//         }
//         System.out.println("null");
//        }
// }




// 3 . Iterate linked list from reverse order


// import java.util.LinkedList;
// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<Integer>();

//         System.out.println("No of elements to add in Linked List: ");

//         int n = sc.nextInt();

//         for(int i = 0; i < n; i++){
//             System.out.println("Add data to LinkedList: ");
//             list.add(sc.nextInt());
//         }

//         for(int i = list.size() - 1; i >=0; i--){
//             System.out.print(list.get(i)+" -> ");
//         }
//         System.out.println("null");

//     }
// }



// 4 . Insert element at the specified position in the linked list

// import java.util.LinkedList;

// public class Practice{
//     public static void main(String[] args){
//         LinkedList<String> list = new LinkedList<>();

//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");
//         list.add("Grapes");

//         System.out.println("Original Linked List: " + list);

//         System.out.println("After inserting new value at perticular index: ");
//         list.add(1, "Mango");

//         System.out.println("Updated Linked List: " + list);
//     }
// }



    public class Practice{
        static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
       }
       static class LinkedList{
        Node head;

        public void append(int newData){
            Node newNode = new Node(newData);

            if(head == null){
                head = newNode;
                return;
            }
            Node last = head;

            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;

        }
        public void printList(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
        public void addSpecifiedPosition(int index, int newData){
            Node newNode = new Node(newData);
            if(index == 0){
                newNode.next = head;
                head = newNode;
                return;
            }
            Node curr = head;
            for(int i = 0; i < index-1  && curr != null; i++){
                curr = curr.next;

            }

            newNode.next = curr.next;
            curr.next = newNode;
        }
       }

       public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.printList();
        list.addSpecifiedPosition(1, 15);
        list.printList();
       }
    }