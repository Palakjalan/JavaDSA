package Linked List;
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MergeList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(-1);
        ListNode curr = head;

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            }
            else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if(list1 != null) {
            curr.next = list1;
        }

        if(list2 != null) {
            curr.next = list2;
        }

        return head.next;
    }
}

public class Main {

    public static ListNode createList(int n, Scanner sc) {

        if(n == 0) return null;

        int val = sc.nextInt();

        ListNode head = new ListNode(val);
        ListNode curr = head;

        for(int i = 1; i < n; i++) {

            val = sc.nextInt();

            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return head;
    }

    // Function to print linked list
    public static void printList(ListNode head) {

        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first linked list: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of first sorted list:");
        ListNode list1 = createList(n1, sc);

        System.out.print("Enter size of second linked list: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of second sorted list:");
        ListNode list2 = createList(n2, sc);

        MergeList obj = new MergeList();

        ListNode merged = obj.mergeTwoLists(list1, list2);

        System.out.println("Merged Linked List:");
        printList(merged);

        sc.close();
    }
}