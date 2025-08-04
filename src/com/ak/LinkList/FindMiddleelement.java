package com.ak.LinkList;

class Node1 {
    int data;
    Node next;

    Node1(int data){
        this.data =  data;
        this.next =  null;
    }
}

class LinkedList {
    Node head;

    public void insertdata(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node cureentnode = head;
            while (cureentnode.next != null) {
                cureentnode = cureentnode.next;

            }
            cureentnode.next = newNode;
        }
    }

    public int findMiddleelemnt(){
        if (head==null){
            throw new IllegalArgumentException("list is empty");
        }

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;

        }
        return slow.data;

    }
}

public class FindMiddleelement {

    public static void main(String[] args) {
        LinkedList ls= new LinkedList();
        ls.insertdata(2);
        ls.insertdata(5);
        ls.insertdata(6);
        ls.insertdata(8);
        ls.insertdata(11);

        int middlelement =  ls.findMiddleelemnt();
        System.out.println("the middle eleemnt "+ middlelement);

 // insert new element
        ls.insertdata(78);
         middlelement =  ls.findMiddleelemnt();
        System.out.println("the middle eleemnt "+ middlelement);

    }
}

