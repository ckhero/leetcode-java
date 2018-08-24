class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Leetcode_2 {
    public static void main(String []args)
    {
        Leetcode_2 leetcode_2 = new Leetcode_2();
        ListNode l1 = leetcode_2.getListNode(new int[] {1,8});
        ListNode l2 = leetcode_2.getListNode(new int[] {0});
        ListNode aa = leetcode_2.addTwoNumbers(l1, l2);
        System.out.println(aa.val);
        System.out.println(aa.next.val);
        System.out.println(aa.next.next.val);
        System.out.println(aa.next.next.next.val);
    }

    public ListNode getListNode(int[] nums) {
        ListNode curr = new ListNode(0);
        ListNode res = curr;
        for (int i = 0; i < nums.length; i++) {
            res.next = new ListNode(nums[i]);
            res = res.next;
        }
        return curr.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode res = new ListNode(0);
        ListNode q = l1, p = l2, curr = res;
        int carry = 0;
        while (q != null || p != null) {
            int x = (q != null) ? q.val: 0;
            int y = (p != null) ? p.val: 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (q != null) q = q.next;
            if (p != null) p = p.next;
        }
        if (carry > 0) {
            curr .next = new ListNode(carry);
        }
        return  res.next;
    }
}
