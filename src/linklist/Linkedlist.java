package src.linklist;

public class Linkedlist{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    // add item at first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add item at last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null ){ 
            current = current.next;
        }
        current.next = newNode;
    }

    // delete item at first
    public void delteFirst(){
        if(head == null){
            System.out.println("The list is empty");
        }
        head = head.next;
    }

    // delete iten at last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // print list
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addFirst(10);
        list.addFirst(20);
        list.printList();
        list.addLast(30);
        list.addLast(40);
        list.printList();
        list.delteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}