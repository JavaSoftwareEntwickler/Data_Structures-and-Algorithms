package src;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(18);
        linkedList.insert(12);
        linkedList.insert(5);
        linkedList.insert(8);
        linkedList.printList();
        linkedList.insertAtStart(1);
        linkedList.printList();
        linkedList.insertAt( 90, 999);
        linkedList.printList();
        linkedList.deleteAt(0);
        linkedList.printList();
    }

}
