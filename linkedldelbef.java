public class linkedldelbef {
    Node tail,head;

    public linkedldelbef(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int value){
        Node n = new Node(value);
        if(head == null)
           tail = head = n;
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void print(Node head){
        if(head==null)
           System.out.println("list is empty");
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void delbefore(int posele){
        if(head==null)
           System.out.println("deletion not possible");
        else{
            Node temp = head;
            Node prev = null;
            Node ptemp = null;
            while (temp!=null) {
                if(temp.data==posele)
                    break;
                prev = ptemp;
                ptemp = temp;
                temp = temp.next;
            }
            if(temp==null)
                System.out.println("element not found");
            else if(temp==head)
                System.out.println("deletion not possible");
            else if(temp == head.next)
                head = head.next;
            else
                prev.next = temp;
        }
    }
    public static void main(String args[]){
        linkedldelbef l = new linkedldelbef();
        l.create(1);
        l.create(2);
        l.create(3);
        l.print(l.head);
        System.out.println();
        l.delbefore(1);
        l.print(l.head);
    }
}
