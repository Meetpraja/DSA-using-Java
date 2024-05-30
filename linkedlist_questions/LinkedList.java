package linkedlist_questions;

public class LinkedList {
   private Node head;
   private Node tail;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print("-->"+temp.value);
            temp = temp.next;
        }
    }

    public void printAll(){
        System.out.println();
        if (head == null){
            System.out.println("Head: null");
            System.out.println("Tail: null");
        }
        else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.print("LinkedList : ");
        if (head == null){
            System.out.println("empty");
        }else {
            printList();
        }
    }

    Node findMiddle(){
        Node fast = head;
        Node slow = head;
        if(head == null)return null;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
