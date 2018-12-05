package action;

import java.util.Scanner;

import tree.BinaryTree;

public class testTree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] prelist = { "A", "B", "C", null, null, "D", "E", null, "G", null, null, "F", null, null, null };
		BinaryTree<String> bitree = new BinaryTree<String>(prelist);
		System.out.println("递归方法：");
		System.out.println("先根遍历：");
		bitree.preOrder();
		System.out.println("中根遍历：");
		bitree.inOrder();
		System.out.println("后根遍历：");
		bitree.postOrder();
		System.out.println();
		System.out.println("非递归方法：");
		System.out.println("先根遍历：");
		bitree.preOrderT();
		System.out.println("中根遍历：");
		bitree.inOrderT();
	}

}
