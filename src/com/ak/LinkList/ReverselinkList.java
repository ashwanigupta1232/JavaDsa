package com.ak.LinkList;


class Node {
    int data;
    Node next;

    Node(int data){
        this.data =  data;
        this.next =  null;
    }
}

class LinkedListReverse{
    Node head;

    public void insertdata(int data){
        Node newNode =  new Node(data);
        if (head ==null){
            head =  newNode;
        }
        else {
            Node cureentnode=  head;
            while (cureentnode.next!=null){
                cureentnode =  cureentnode.next;

            }
            cureentnode.next=newNode;
        }
    }

    public void reverse(){
        Node pre =  null;
        Node current = head;
        Node next =null;
        while (current!=null){
            next= current.next;
            current.next=pre;
            pre=current;
            current=next;

        }
        head= pre;
    }

    public void disPlay(){
        Node curerent =  head;
        while (curerent!=null){
            System.out.print(curerent.data+" ->");
            curerent=curerent.next;

        }
        System.out.println("null");
    }




}

public class ReverselinkList {

    public static void main(String[] args) {
        LinkedListReverse ls=  new LinkedListReverse();
        ls.insertdata(2);
        ls.insertdata(4);
        ls.insertdata(5);
        ls.insertdata(6);


        System.out.println("orginal link list");
        ls.disPlay();

        ls.reverse();
        System.out.println("reverse Link list")
        ;
    ls.disPlay();
    }

}


