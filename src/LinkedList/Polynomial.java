package linkedlist;

public class Polynomial {
    Node head;
    class Node{
        int coef;
        Node next;
        int power;

        Node(int coef,int power){
            this.coef=coef;
            this.power=power;
            this.next=null;
        }
    }
    public void polypush(int coef, int power){
        Node poly= new Node(coef,power);

        if(this.head==null){
            this.head=poly;
            return;
        }
        Node start= this.head;
        while (start.next!=null){
            start=start.next;
        }
        start.next=poly;
    }
    public void polyadd(Polynomial list2){
        Node start1= this.head;
        Node start2= list2.head;
        Polynomial list= new Polynomial();

        while (start1!=null && start2!=null){
            if(start1.power>start2.power){
                list.polypush(start1.coef,start1.power);
                start1=start1.next;
            }
            else if (start1.power<start2.power) {
                list.polypush(start2.coef,start2.power);
                start2=start2.next;
            }
            if(start1.power==start2.power){
                int data=start1.coef+start2.coef;
                if(data!=0) {
                    list.polypush(data, start1.power);
                }
                start1 = start1.next;
                start2 = start2.next;
            }
        }
        while(start1!=null){
            list.polypush(start1.coef,start1.power);
            start1=start1.next;
        }
        while(start2!=null){
            list.polypush(start2.coef,start2.power);
            start2=start2.next;
        }
        Node start= list.head;
        while(start!=null){
            System.out.print("("+start.coef+", "+start.power+")"+"->");
            start=start.next;
        }
    }

    public static void main(String[] args) {
        Polynomial list1= new Polynomial();
        Polynomial list2= new Polynomial();

        list1.polypush(5,3);
        list1.polypush(3,2);
        list1.polypush(4,1);
        list1.polypush(7,0);

        list2.polypush(2,3);
        list2.polypush(9,2);
        list2.polypush(-4,1);
        list2.polypush(-9,0);

        list1.polyadd(list2);

    }
}
