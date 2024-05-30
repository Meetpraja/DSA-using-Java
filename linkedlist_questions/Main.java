package linkedlist_questions;

public class Main {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList(1);

        for (int i = 2;i<=10;i++){
            linkedList.append(i);
        }
        linkedList.printAll();

        System.out.println("\nmiddle node : "+linkedList.findMiddle().value);

        LinkedList linkedList1 = new LinkedList(1);
        for (int i = 2;i<10;i++){
            linkedList1.append(i);
        }
        linkedList1.printAll();

        System.out.println("\nmiddle node : "+linkedList.findMiddle().value);

    }
}
