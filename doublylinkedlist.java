import java.util.*;

public class doublylinkedlist {
    static class node{
        int data;
        node prev;
        node next;
        public node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public doublylinkedlist(){
        head=null;
        tail=null;
        size=0;
    }

    //add first function
    public void addFirst(int data){
        if(head==null){
            node newnode=new node(data);
            head=tail=newnode;
            size++;
            return;
        }
        node newnode=new node(data);
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
        size++;
    }

    //add last function
    public void addLast(int data){
        if(head==null){
            node newnode=new node(data);
            head=tail=newnode;
            size++;
            return;
        }
        node newnode=new node(data);
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
        size++;
    }

    //remove from first function
    public int removeFirst(){
        if(head==null){
            System.out.println("empty doubly linkedlist");
            return Integer.MIN_VALUE;
        }
        int value=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return value;
    }

    //remove from last function
    public int removeLast(){
        if(head==null){
            System.out.println("empty doubly linkedlist");
            return Integer.MIN_VALUE;
        }
        int value=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return value;
    }
    //print function
    public void printdll(node first){
        System.out.print("null<- ");
        while(first.next!=null){
            System.out.print(first.data+" <-> ");
            first=first.next;
        }
        System.out.print(first.data+" ->null");
        System.out.println();
    }

    //reverse a doubly linkedlist
    public void reverse(){
        if(head==null || size==1){
            return;
        }
        node prev=null;
        node curr=tail=head;
        node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            curr.prev=Next;
            prev=curr;
            curr=Next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        doublylinkedlist dll=new doublylinkedlist();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        // dll.printdll(head);
        // System.out.println(dll.removeFirst());
        // dll.printdll(head);
        // System.out.println(dll.removeLast());
        // dll.printdll(head);
        // dll.printdll(head);
        // dll.reverse();
        // dll.printdll(head);
        tail.next=head;
        head.prev=tail;
        dll.printdll(head);
    }
}
