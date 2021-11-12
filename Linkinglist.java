package com.assignment14;

public class Linkinglist {
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void display(){
        Node current=head;

        if(head==null){
            System.out.println("list is empty");
            return;
        }

        System.out.println("--link list-- ");
        while(current!=null){
            System.out.println(current.data+"-->");
            current=current.next;
        }
        System.out.println();
    }
}
