package NotFinished;

public class N_876 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);


        listNode = middleNode(listNode);
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode middleNode(ListNode head) {
        int size = getSize(head);
        System.out.println("size = " + size);
        ListNode node = get(head, size / 2);
        ListNode result = new ListNode();
        while (node.next != null) {
            result.val = node.val;
            result.next = node.next;
            node = node.next;
        }
        return result;
    }

    public static ListNode get(ListNode head, int size) {
        while (size > 0) {
            head = head.next;
            size--;
        }
        return head;
    }

    private static int getSize(ListNode listNode) {
        int size = 0;
        while (listNode.next != null) {
            size++;
            listNode = listNode.next;
        }
        return size;
    }
}
