package Binary;

public class NewClass {
    public static class Node {
        int data;
        Node next;
    }

    public static class CreateNode {
        Node head;
        Node tail;
        int size;

        public void addLast(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (size == 0) {
                tail = head = node;
            } else {
                tail.next = node;
                tail = node;

            }
            size++;
        }

        public void addFirst(int data) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            if (size == 0) {
                tail = node;
            } else {

                head = node;
            }
            size++;
        }
        public void display(){
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.println(temp.data);
            }
        }
    }
}
