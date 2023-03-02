package projects.collections;

import java.util.logging.Logger;

class LinkedListFunctions{

    Node head;
    int ind=0;
    StringBuilder dis= new StringBuilder("");
    String indx;

    private static final Logger log = Logger.getLogger("InfoLogging");
    class Node {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }

    }
    LinkedListFunctions()
    {
        head=null;

    }
    void insertElement(int val)
    {
        Node n1 = new Node(val);
        Node temp=head;

        if(head==null)
        {
            head=n1;
        }
        else
        {

            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n1;



        }
    }
    void insertElementBegining(int val)
    {
        Node n1 = new Node(val);
        if(head==null)
        {
            head=n1;
        }
        else
        {
            n1.next=head;
            head=n1;
        }
    }
    void insertElementIndex(int pos,int val)
    {
        if(pos==0)
        {
            insertElementBegining(val);
            return;
        }
        Node n1 = new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
        }
        n1.next=temp.next;
        temp.next=n1;

    }
    int  maximum()
    {
        Node temp=head;
        Node f=temp;
        while (temp!=null)
        {
            if(f.data< temp.data)
            {
                f.data= temp.data;
            }
            temp=temp.next;
        }
        return f.data;
    }
    int  minimum()
    {
        Node temp=head;
        Node f=temp;
        while (temp!=null)
        {
            if(f.data>temp.data)
            {
                f.data= temp.data;
            }
            temp=temp.next;
        }
        return f.data;
    }
    void valueFind(int val)
    {

        Node temp=head;
        ind=0;

        while (temp!=null)
        {
            if(temp.data==val)
            {
                break;
            }
            ind++;
            temp=temp.next;
        }
        indx="Index of "+val+" is "+ind;
        log.info(indx);

    }
    void deleteAtPos(int pos)
    {
        Node temp=head;
        Node previous=temp;
        for(int i=1;i<=pos;i++)
        {
            previous=temp;
            temp=temp.next;

        }
        previous.next=temp.next;

    }
    void remove()
    {
        Node temp=head;
        Node previous=temp;
        while (temp.next!=null)
        {
            previous=temp;
            temp=temp.next;
        }
        previous.next=temp.next;
    }
    void display()
    {

        Node temp=head;
        while (temp!=null)
        {
            dis.append(" "+temp.data+" ");
            temp=temp.next;
        }
        String r=dis.toString();

        log.info(r);
        dis.delete(0,r.length());
    }
}