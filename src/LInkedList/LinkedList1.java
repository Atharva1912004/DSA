package LInkedList;

class LinkedList1{
    public static class Node{
        int data;
        Node next;
    }
    public static class CreateList{
        Node head;
        Node tail;
        int size;
        public void addLast(int data){
            Node node=new Node();
            node.data=data;
            node.next=null;
            if(size==0){
                tail=head=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
            size++;
        }
        public void addFirst(int data){
            Node node=new Node();
            node.data=data;
            node.next=head;
            if(size==0){
                tail=head=node;
            }
            else{
                node=head;
            }
            size++;
        }
        public void removeFirst(){
            if(size==0){
                System.out.println("List is empty");
            }
            else if(size==1){
                tail=head=null;
                size=0;

            }
            else{
                head=head.next;
                size--;
            }

        }
        public void removeLast(){

            if(size==0){
                System.out.println("List is empty");
            }
            else if(size==1){
                tail=head=null;
                size=0;
            }
            else{
               Node temp=head;
               for(int i=0;i<size-2;i++){
                   temp=temp.next;
               }
               tail=temp;
               tail.next=null;
               size--;
            }

        }
        public void display(){
             for(Node temp=head;temp!=null;temp=temp.next){
                 System.out.print(temp.data);
             }
        }

    }
    public static void main(String[] args){
        CreateList list=new CreateList();
        list.addFirst(2);
        list.addLast(5);
        list.addLast(6);
        list.removeLast();
        list.display();
    }
}