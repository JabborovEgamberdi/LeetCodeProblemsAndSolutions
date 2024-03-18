package NotFinished;

public class N_83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode listNode = new N_83().deleteDuplicates(head);
        System.out.println("ListNode");
        new N_83().deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));
        System.out.println("ListNode");
        System.out.println(new N_83().deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2))))));
        System.out.println("ListNode");
        System.out.println(new N_83().deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3))))))));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode();
        while (head.next != null) {
            if (head.val != head.next.val) {
                result.val = head.val;
                result.next = new ListNode();
            }
            head = head.next;
        }
        while (result.next != null) {
            System.out.println("result.val = " + result.val);;
            result = result.next;
        }
        return result;
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        while (head.next != null) {
            if (head.val != head.next.val) {
                current.val = head.val;
                current.next = new ListNode();
            }
            head = head.next;
        }
        while (current.next != null) {
            System.out.println("current.val = " + current.val);;
            current = current.next;
        }
        return current;
    }

}