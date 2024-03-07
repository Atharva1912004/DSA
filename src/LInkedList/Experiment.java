package LInkedList;

class Experiment{
    public static class Node{
        int data;
        Node next;

    }
    public static class Createclass{
        Node head;
        Node tail;
        int size;

        public void adFirst(int data){
            Node node=new Node();
            node.data=data;
            node.next=head;
            head = node;
        }

    }
}