package linkedlist;

public class LinkedList {
    private  Node head;
    private Node tail;
    private int length;

    //creating a Node
     static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    //initializing linkedlist with constructor
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //printing all node's values
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(" --> "+temp.value);
            temp = temp.next;
        }
    }

    //getting head of linkedlist
    public void getHead() {
        System.out.println("\nHead : "+head.value);
    }
    //getting tail of linkedlist
    public void getTail() {
        System.out.println("Tail : "+tail.value);
    }
    //getting length of linkedlist
    public void  getLength(){
        System.out.println("length : "+length);
    }

    //append node at the end of the list
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    //remove last node from the list
    Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //adding node on the beginning of the list
    public void prepend(int value){
         Node newNode = new Node(value);
         if (length == 0){
             head = newNode;
             tail = newNode;
         }
         else {
             newNode.next = head;
             head = newNode;
         }
         length++;
    }

    //remove first node 
    Node removeFirst(){
         if (length == 0) return null;
         Node temp = head;
         head = head.next;
         temp.next = null;
         length--;
         if (length==0){
             tail = null;
         }
         return temp;
    }

    //getting node from the given index
    Node get(int index){
         if (index < 0 || index >= length){
             return null;
         }
         Node temp = head;
         for (int i = 0;i<index;i++){
             temp = temp.next;
         }
         return temp;
    }

    //setting node to the given index
    public boolean set(int index,int value){
         Node temp = get(index);
         if (temp != null){
             temp.value = value;
             return true;
         }
         return false;
    }

    //inserting node to the given index
    public boolean insert(int index,int value){
         if (index < 0 || index > length) return false;
         if (index == 0){
             prepend(value);
             return true;
         }
         if (index == length){
             append(value);
             return true;
         }
         Node newNode = new Node(value);
         Node temp = get(index-1);
         newNode.next = temp.next;
         temp.next = newNode;
         length++;
         return true;
    }
    //remove node from the given index
    Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length-1) return removeLast();

        Node pre = get(index-1);
        Node temp = pre.next;

        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
   }

    //reverse whole linkedlist
    public void reverse(){
         Node temp = head;
         head = tail;
         tail = temp;
         Node after;
         Node before = null;

         for(int i=0;i<length;i++){
             after = temp.next;
             temp.next = before;
             before = temp;
             temp = after;
         }
    }
}
