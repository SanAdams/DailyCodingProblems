// Add Two Numbers leetcode problem: https://leetcode.com/problems/add-two-numbers/

import java.util.ArrayList;

public class AddTwoNumbers{

  // Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ArrayList<Integer> L1Reversed = new ArrayList<Integer>();
      ArrayList<Integer> L2Reversed = new ArrayList<Integer>();
      ListNode res = new ListNode();

      // appending vals in linkedlist to arraylist
      ListNode head = l1;
      while(head != null){
        L1Reversed.add(head.val);
        head = head.next;
      }

      head = l2;
      while(head != null){
        L2Reversed.add(head.val);
        head = head.next;
      }

      // Convert each arraylist to an integer
      int size = L1Reversed.size();
      String l1String = "";
      int L1ReversedInteger;
      for(int i = size - 1; i >= 0; i--){
        l1String = l1String + String.valueOf(L1Reversed.get(i));
      }
      L1ReversedInteger = Integer.valueOf(l1String);
      
      size = L2Reversed.size();
      String l2String = "";
      int L2ReversedInteger;
      for(int i = size - 1; i >= 0; i--){
        l2String = l2String + String.valueOf(L1Reversed.get(i));
      }
      L2ReversedInteger = Integer.valueOf(l2String);

      int sum = L1ReversedInteger + L2ReversedInteger;

      // Get the digits from the sum add to linked list 

      //Seed the head
      head = new ListNode(sum % 10);
      ListNode ptr;
      head.next = new ListNode();
      ptr = head.next;
      sum /= 10;
      while (sum > 0) {
        int lastDigit = sum % 10;
        ptr.val = lastDigit;
        ptr.next = new ListNode();
        ptr = ptr.next;
        sum = sum / 10;
    }

      res = head;
      return res;        
    }

  static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

  public static void main (String [] args){
    AddTwoNumbers test = new AddTwoNumbers();
    ListNode l1 = test.new ListNode();
    ListNode l2 = test.new ListNode();

    l1.val = 2;
    l1.next = test.new ListNode(3);
    l1.next.next = test.new ListNode(4);
    
    l2.val = 5;
    l2.next = test.new ListNode(6);
    l2.next.next = test.new ListNode(4);

    ListNode sol = test.addTwoNumbers(l1,l2);

    printList(sol);
  }
} 



  

