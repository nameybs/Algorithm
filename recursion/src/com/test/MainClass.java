package com.test;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("==== бс Solution344 ====");
		Solution_344 solution_344 = new Solution_344();
		char[] char_344 = {'h','e','l','l','o'};
		UtilClass.printCharArray(solution_344.reverseString(char_344));
		
		System.out.println("==== бс Solution24 ====");
		Solution_24 solution_24 = new Solution_24();
		ListNode node_24 = new ListNode(1);
		node_24.next = new ListNode(2);
		node_24.next.next = new ListNode(3);
		node_24.next.next.next = new ListNode(4);
		UtilClass.printList(node_24);
		UtilClass.printList(solution_24.swapPairs(node_24));
		
		System.out.println("==== бс Solution206 ====");
		Solution_206 solution_206 = new Solution_206();
		ListNode node_206 = new ListNode(1);
		node_206.next = new ListNode(2);
		node_206.next.next = new ListNode(3);
		node_206.next.next.next = new ListNode(4);
		node_206.next.next.next.next = new ListNode(5);
		UtilClass.printList(node_206);
		UtilClass.printList(solution_206.swapPairs(node_206));
		
		System.out.println("==== бс Solution119 ====");
		Solution_119 solution_119 = new Solution_119();
		UtilClass.printList(solution_119.getRow(5));
		UtilClass.printList(solution_119.getRow(3));
		UtilClass.printList(solution_119.getRow(6));
		UtilClass.printList(solution_119.getRow(0));
		UtilClass.printList(solution_119.getRow(1));
		
		System.out.println("==== бс Solution509 ====");
		Solution_509 solution_509 = new Solution_509();
		System.out.println(solution_509.fib(2));
		System.out.println(solution_509.fib(10));
		System.out.println(solution_509.fib(6));
		System.out.println(solution_509.fib(4));
		System.out.println(solution_509.fib(2));
		
		System.out.println("==== бс Solution70 ====");
		Solution_70 solution_70 = new Solution_70();
		System.out.println(solution_70.climbStairs(3));
		System.out.println(solution_70.climbStairs(5));
		System.out.println(solution_70.climbStairs(2));
		System.out.println(solution_70.climbStairs(1));
		
		Solution_21 solution_21 = new Solution_21();
		ListNode node_21_1 = new ListNode(1);
		node_21_1.next = new ListNode(2);
		node_21_1.next.next = new ListNode(4);
		node_21_1.next.next.next = new ListNode(8);
		node_21_1.next.next.next.next = new ListNode(9);

		System.out.println("==== бс Solution21 ====");
		ListNode node_21_2 = new ListNode(1);
		node_21_2.next = new ListNode(3);
		node_21_2.next.next = new ListNode(4);
		node_21_2.next.next.next = new ListNode(7);
		node_21_2.next.next.next.next = new ListNode(9);
		
		ListNode node_21_3 = new ListNode(0);
		
		UtilClass.printList(solution_21.mergeTwoLists(node_21_1, node_21_2));
		UtilClass.printList(solution_21.mergeTwoLists(null, null));
		UtilClass.printList(solution_21.mergeTwoLists(null, node_21_3));
	}
}
