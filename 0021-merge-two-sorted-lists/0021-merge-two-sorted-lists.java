/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode mergedSorted;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return mergeLists(list1, list2);
        
    }

    private ListNode mergeLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        }
        if(list1 == null || list2 == null) {
            if(list1 == null ) return list2;
            else return list1;
        }
        
        if (list1.val <= list2.val) {
            list1.next = mergeLists(list1.next, list2);
            return list1;
        } 
        else {
            list2.next = mergeLists(list1, list2.next);
            return list2;
        }
    }
}