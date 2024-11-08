//import java.util.*;

public class Linked {
    Node head;
    class Node{
        String data ="a";
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            
        }

        //add - first,last
        //function
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addLast(String data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode=head;
            while(currNode.next != null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }

        //print
        public void printList(String data){
            /*if(head==null){
                System.out.println("list is empty");
                return;
            }*/

            Node currNode=head;
            while(currNode != null){
                System.out.println(currNode.data +" -> ");
                currNode=currNode.next;
            }
            //currNode.next=newNode;
            System.out.println("Null");
        }
    }
    public static void main(String[] args) {
        Linked list=new Linked();
        list.addFirst("a");
        //list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();
    }
}
