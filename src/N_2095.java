import NotFinished.ListNode;

/*
* Level: 🟡🟡🟡
* Status: DONE
* Time Complexity: O(n)
* Runtime: 3 ms -> Beats 99.66%
* */
void main() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    System.out.println(deleteMiddle(head));
}

public ListNode deleteMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    slow.next = slow.next.next;
    return head;
}