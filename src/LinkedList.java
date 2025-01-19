package src;

/**
    * LinkedList
    * - head: Node
    * + insert(int data): void
    * + insertAtStart(int data): void
    * + insertAt(int index, int data): void
    * + printList(): void

 */
public class LinkedList {
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = newNode;
    }

    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAt(int index, int data){
        if(index == 0) {
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        Node node = head;
        while (index - 1 > 0){
            // Se l'indice è maggiore della lunghezza della lista, inserisci in coda
            if(node.next == null){
               node.next = newNode;
               return;
            }
            node = node.next;
            index--;
        }
        newNode.next = node.next;
        node.next = newNode;
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
            return;
        }
        Node node = head;
        while (index -1 > 0){
            // Se l'indice è maggiore della lunghezza della lista, elimina l'ultimo elemento
            if(node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
            index--;
        }
        node.next = node.next.next;
    }

    public void printList(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println("");
    }

}
