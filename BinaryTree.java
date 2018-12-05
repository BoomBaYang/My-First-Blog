package tree;

import java.util.Scanner;

import model.SeqStack;

public class BinaryTree<T> {
	public BinaryNode<T> root;

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTree(T[] prelist) {
		this.root = create(prelist);
	}

	// create方法
	private int i = 0;

	private BinaryNode<T> create(T[] testlist) {
		// TODO Auto-generated method stub
		BinaryNode<T> p = null;
		if (i < testlist.length) {
			T elem = testlist[i];
			i++;
			if (elem != null) {
				p = new BinaryNode<T>(elem);
				p.left = create(testlist);
				p.right = create(testlist);
			}
		}
		return p;
	}
	// ------------递归遍历开始------------

	// 先根遍历
	public void preOrder() {
		preOrder(this.root);
		System.out.println();
	}

	private void preOrder(BinaryNode<T> p) {
		if (p != null) {
			System.out.print(p.data.toString() + " ");
			preOrder(p.left);
			preOrder(p.right);
		}
	}

	// 中根遍历
	public void inOrder() {
		inOrder(this.root);
		System.out.println();
	}

	private void inOrder(BinaryNode<T> p) {
		if (p != null) {
			inOrder(p.left);
			System.out.print(p.data.toString() + " ");
			inOrder(p.right);
		}
	}

	// 后根遍历
	public void postOrder() {
		postOrder(this.root);
		System.out.println();
	}

	private void postOrder(BinaryNode<T> p) {
		if (p != null) {
			postOrder(p.left);
			postOrder(p.right);
			System.out.print(p.data.toString() + " ");
		}

	}

	// ------------递归遍历结束------------

	// ------------非递归遍历开始------------
	// 先根遍历
	public void preOrderT() {
		// 创建存储树节点类型的顺序栈
		SeqStack<BinaryNode<T>> stack = new SeqStack<BinaryNode<T>>();
		BinaryNode<T> p = this.root;
		while (p != null || !stack.isEmpty()) {
			if (p != null) {
				System.out.print(p.data.toString() + " ");
				stack.push(p);// p入栈，对p的左孩子进行同样操作
				p = p.left;
			} else {
				p = stack.pop();// 弹出栈顶元素，就是当前左孩子为空的节点，继续访问它的右孩子
				p = p.right;
			}
		}
		System.out.println();
	}

	// 中根遍历
	public void inOrderT() {
		SeqStack<BinaryNode<T>> stack = new SeqStack<BinaryNode<T>>();
		BinaryNode<T> p = this.root;
		while (p != null || !stack.isEmpty()) {
			if (p != null) {
				stack.push(p);// p入栈，对p的左孩子进行同样操作
				p = p.left;

			} else {
				p = stack.pop();// 弹出栈顶元素，就是当前左孩子为空的节点，继续访问它的右孩子
				System.out.print(p.data.toString() + " ");
				p = p.right;
			}
		}
		System.out.println();
	}

	public String toString() {

		return toString(this.root);

	}

	private String toString(BinaryNode<T> p) {
		if (p == null)
			return "^";
		return p.data.toString() + "" + toString(p.left) + toString(p.right);
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public BinaryNode<T> insert(T x) {
		return this.root = new BinaryNode<T>(x, this.root, null);
	}
}
