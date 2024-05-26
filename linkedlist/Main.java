package linkedlist;

public class Main {
    public static void main(String[] args) {

        // creating linkedlist
        LinkedList myLinkedList = new LinkedList(12);

        // appending values
        myLinkedList.append(15);
        myLinkedList.append(10);
        myLinkedList.append(26);
        myLinkedList.append(56);

        // printing linkedlist and INFO
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        // removing last node
        System.out.println(myLinkedList.removeLast().value);
        myLinkedList.printList();
        System.out.println("\n" + myLinkedList.removeLast().value);
        myLinkedList.printList();
        System.out.println("\n" + myLinkedList.removeLast().value);
        myLinkedList.printList();
        System.out.println("\n" + myLinkedList.removeLast().value);
        myLinkedList.printList();
        System.out.println("\n" + myLinkedList.removeLast().value);
        myLinkedList.printList();
        System.out.println("\n" + myLinkedList.removeLast());
        myLinkedList.printList();

        // adding node to the front
        myLinkedList.prepend(10);
        myLinkedList.prepend(25);
        myLinkedList.prepend(35);
        myLinkedList.prepend(60);
        myLinkedList.printList();

        // removing first node
        System.out.println("\n" + myLinkedList.removeFirst().value);
        myLinkedList.printList();

        // getting node according to index
        System.out.println("\n" + myLinkedList.get(0).value);

        // setting node according to index
        System.out.println("\n" + myLinkedList.set(0, 15));
        myLinkedList.printList();

        // inserting node at the index
        System.out.println("\n" + myLinkedList.insert(1, 56));
        myLinkedList.printList();

        // removing node from the index
        System.out.println("\n" + myLinkedList.remove(2).value);
        myLinkedList.printList();

        // reversing LinkedList
        myLinkedList.reverse();
        System.out.println();
        myLinkedList.printList();

    }
}
