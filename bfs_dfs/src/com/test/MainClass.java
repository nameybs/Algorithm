package com.test;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("==== бс BFS Sample ====");
		Sample sample = new Sample();
		TreeNode node_sample = new TreeNode(1, 
				new TreeNode(2, new TreeNode(3), new TreeNode(4)), 
				new TreeNode(2, new TreeNode(4), new TreeNode(3)));
		sample.BFS(node_sample);
		
		System.out.println("==== бс Solution94 ====");
		Solution_94 solution_94 = new Solution_94();
		TreeNode node_94_1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
		System.out.println(solution_94.inorderTraversal(node_94_1));
		
		System.out.println("==== бс Solution98 ====");
		Solution_98 solution_98 = new Solution_98();
		TreeNode node_98_1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		TreeNode node_98_2 = new TreeNode(5,
				new TreeNode(1, null, null),
				new TreeNode(4, new TreeNode(3), new TreeNode(6)));
		TreeNode node_98_3 = new TreeNode(2, new TreeNode(2), new TreeNode(2));
		TreeNode node_98_4 = new TreeNode(5,
				new TreeNode(4, null, null),
				new TreeNode(6, new TreeNode(3), new TreeNode(7)));
		TreeNode node_98_5 = new TreeNode(0, new TreeNode(-1), null);

		System.out.println(solution_98.isValidBST(node_98_1));
		System.out.println(solution_98.isValidBST(node_98_2));
		System.out.println(solution_98.isValidBST(node_98_3));
		System.out.println(solution_98.isValidBST(node_98_4));
		System.out.println(solution_98.isValidBST(node_98_5));

		System.out.println("==== бс Solution99 ====");
		Solution_99 solution_99 = new Solution_99();
		TreeNode node_99_1 = new TreeNode(1, new TreeNode(3, null, new TreeNode(2)), null);
		TreeNode node_99_2 = new TreeNode(3,
				new TreeNode(1, null, null),
				new TreeNode(4, new TreeNode(2), null));

		solution_99.recoverTree(node_99_1);
		solution_99.recoverTree(node_99_2);
		
		System.out.println("==== бс Solution100 ====");
		Solution_100 solution_100 = new Solution_100();
		TreeNode node_100_1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		TreeNode node_100_2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		TreeNode node_100_3 = new TreeNode(1, null, new TreeNode(2));
		TreeNode node_100_4 = new TreeNode(1, new TreeNode(2), null);
		TreeNode node_100_5 = new TreeNode(5,
				new TreeNode(3, null, null),
				new TreeNode(6, new TreeNode(4), new TreeNode(7)));
		TreeNode node_100_6 = new TreeNode(5,
				new TreeNode(4, null, null),
				new TreeNode(6, new TreeNode(4), new TreeNode(7)));
		System.out.println(solution_100.isSameTree(node_100_1, node_100_2));
		System.out.println(solution_100.isSameTree(node_100_3, node_100_4));
		System.out.println(solution_100.isSameTree(node_100_5, node_100_6));
		
		System.out.println("==== бс Solution101 ====");
		Solution_101 solution_101 = new Solution_101();
		TreeNode node_101_1 = new TreeNode(1, 
				new TreeNode(2, new TreeNode(3), new TreeNode(4)), 
				new TreeNode(2, new TreeNode(4), new TreeNode(3)));
		TreeNode node_101_2 = new TreeNode(1, 
				new TreeNode(2, null, new TreeNode(3)), 
				new TreeNode(2, null, new TreeNode(3)));
		System.out.println(solution_101.isSymmetric(node_101_1));
		System.out.println(solution_101.isSymmetric(node_101_2));
		
		System.out.println("==== бс Solution104 ====");
		Solution_104 solution_104 = new Solution_104();
		TreeNode node_104_1 = new TreeNode(3, 
				new TreeNode(9, null, null), 
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		
		TreeNode node_104_2 = new TreeNode(1, null, new TreeNode(2));
		System.out.println(solution_104.maxDepth(node_104_1));
		System.out.println(solution_104.maxDepth(node_104_2));
		
		System.out.println("==== бс Solution110 ====");
		Solution_110 solution_110 = new Solution_110();
		TreeNode node_110_1 = new TreeNode(1, 
				new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), 
				new TreeNode(2, null, null));
		
		TreeNode node_110_2 = new TreeNode(3, 
				new TreeNode(9, null, null), 
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		TreeNode node_110_3 = new TreeNode(1);
		TreeNode node_110_4 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		
		TreeNode node_110_5 = new TreeNode(1, 
				new TreeNode(2, new TreeNode(3, null, null), new TreeNode(3, null, new TreeNode(4))), 
				new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null));
		
		TreeNode node_110_6 = new TreeNode(0, new TreeNode(1), null);
		System.out.println(solution_110.isBalanced(node_110_1));
		System.out.println(solution_110.isBalanced(node_110_2));
		System.out.println(solution_110.isBalanced(node_110_3));
		System.out.println(solution_110.isBalanced(node_110_4));
		System.out.println(solution_110.isBalanced(node_110_5));
		System.out.println(solution_110.isBalanced(node_110_6));

		System.out.println("==== бс Solution111 ====");
		Solution_111 solution_111 = new Solution_111();
		TreeNode node_111_1 = new TreeNode(3, 
				new TreeNode(9, null, null), 
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		TreeNode node_111_2 = new TreeNode(1, null, new TreeNode(2));
		System.out.println(solution_111.minDepth(node_111_1));
		System.out.println(solution_111.minDepth(node_111_2));
		
		System.out.println("==== бс Solution112 ====");
		Solution_112 solution_112 = new Solution_112();
		TreeNode node_112_1 = new TreeNode(5, 
				new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), 
				new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
		
		TreeNode node_112_2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		System.out.println(solution_112.hasPathSum(node_112_1, 22));
		System.out.println(solution_112.hasPathSum(node_112_2, 5));
		
		System.out.println("==== бс Solution113 ====");
		Solution_113 solution_113 = new Solution_113();
		TreeNode node_113_1 = new TreeNode(5, 
				new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), 
				new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
		
		TreeNode node_113_2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		System.out.println(solution_113.pathSum(node_113_1, 22).toString());
		System.out.println(solution_113.pathSum(node_113_2, 5).toString());
	}
}
