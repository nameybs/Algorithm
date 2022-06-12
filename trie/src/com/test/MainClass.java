package com.test;

import java.util.LinkedList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("==== бс Solution120 ====");
		//Solution_120_TimeLimit solution_120_time = new Solution_120_TimeLimit();
		Solution_120 solution_120 = new Solution_120();
		// [[2],[3,4],[6,5,7],[4,1,8,3]]
		List<List<Integer>> list_120_1 = new LinkedList<List<Integer>>();
		List<Integer> triangle_120_1 = new LinkedList<Integer>();
		triangle_120_1.add(2);
		List<Integer> triangle_120_2 = new LinkedList<Integer>();
		triangle_120_2.add(3);
		triangle_120_2.add(4);
		List<Integer> triangle_120_3 = new LinkedList<Integer>();
		triangle_120_3.add(6);
		triangle_120_3.add(5);
		triangle_120_3.add(7);
		List<Integer> triangle_120_4 = new LinkedList<Integer>();
		triangle_120_4.add(4);
		triangle_120_4.add(1);
		triangle_120_4.add(8);
		triangle_120_4.add(3);
		list_120_1.add(triangle_120_1);
		list_120_1.add(triangle_120_2);
		list_120_1.add(triangle_120_3);
		list_120_1.add(triangle_120_4);
		
		List<List<Integer>> list_120_2 = new LinkedList<List<Integer>>();
		List<Integer> triangle_5 = new LinkedList<Integer>();
		triangle_5.add(-10);
		list_120_2.add(triangle_5);
		
		List<List<Integer>> list_120_3 = new LinkedList<List<Integer>>();
		List<Integer> triangle_120_6 = new LinkedList<Integer>();
		triangle_120_1.add(-1);
		List<Integer> triangle_120_7 = new LinkedList<Integer>();
		triangle_120_2.add(2);
		triangle_120_2.add(3);
		List<Integer> triangle_120_8 = new LinkedList<Integer>();
		triangle_120_3.add(1);
		triangle_120_3.add(-1);
		triangle_120_3.add(-3);
		list_120_3.add(triangle_120_6);
		list_120_3.add(triangle_120_7);
		list_120_3.add(triangle_120_8);
		
		System.out.println(solution_120.minimumTotal(list_120_1));
		System.out.println(solution_120.minimumTotal(list_120_2));
		System.out.println(solution_120.minimumTotal(list_120_3));

		System.out.println("==== бс Solution208 ====");
		Solution_208 solution_208 = new Solution_208();
		solution_208.insert("apple");
		System.out.println(solution_208.search("apple"));
		System.out.println(solution_208.search("app"));
		System.out.println(solution_208.startsWith("app"));
		solution_208.insert("app");
		System.out.println(solution_208.search("app"));
		
		System.out.println("==== бс Solution212 ====");
		Solution_212 solution_212 = new Solution_212();
		char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
		String[] words = {"oath","pea","eat","rain"};
		System.out.println(solution_212.findWords(board, words));
	}
}
