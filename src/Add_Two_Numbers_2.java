import org.w3c.dom.Node;

public class Add_Two_Numbers_2 {

    public static void main(String[] args) {
    }

    public Node addTwoNumbers(ListNode l1, ListNode l2) {
        int result = 0;
        int q = 0;
        while (l1.next == null && l2.next == null) {
            result = l1.val + l2.val;
            q = result / 10;
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}