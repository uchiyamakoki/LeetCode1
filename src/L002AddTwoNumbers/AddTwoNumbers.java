package L002AddTwoNumbers;

public class AddTwoNumbers {

    public static void main(String[] args) {
        /*ListNode l1=new ListNode(2);
       ListNode l2=new ListNode(5);
      ListNode o=addTwoNumbers(l1,l2);
      System.out.println(o);*/
        int[] a=new int[]{2,4,3};
        int[] b=new int[]{5,6,7};

        ListNode l1=buildListNode(a);
        ListNode l2=buildListNode(b);

        ListNode listNode;

        listNode=l1;
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        System.out.println();
        listNode=l2;
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        System.out.println();
        listNode=addTwoNumbers(l1,l2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }

        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        int carry=0;
        ListNode newhead=new ListNode(-1);
        ListNode l3=newhead;

        while (l1!=null||l2!=null){

            if (l1!=null){
                carry+=l1.val;
                l1=l1.next;
            }

            if (l2!=null){
                carry+=l2.val;
                l2=l2.next;
            }

            l3.next=new ListNode(carry%10);
            carry=carry/10;
            l3=l3.next;
        }
        if (carry==1){
            l3.next=new ListNode(1);
        }
        return newhead.next;
    }
    public static ListNode buildListNode(int[] list){
        ListNode first=null;
        ListNode last=null;
        ListNode newNode;
        for (int i=0;i<list.length;i++){
            newNode=new ListNode(list[i]);
            if (first==null){
                first=newNode;
                last=newNode;
            }else {
                last.next=newNode;
                last=newNode;
            }
        }
        return first;
    }
 }

