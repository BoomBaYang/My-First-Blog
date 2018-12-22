package tree;

public class BinaryNode<T> {
	public T data;
	public BinaryNode<T> left, right;

	public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public BinaryNode(T data) {
		this(data, null, null);
	}

	public String toString() {
		return this.data.toString();
	}

	public boolean isLeaf() {
		return this.left == null && this.right == null;
	}

	public BinaryNode<T> insert(BinaryNode<T> parent, T x, boolean leftChild) {
		if (x == null)
			return null;
		if (leftChild) {
			return parent.left = new BinaryNode<T>(x, parent.left, null);
		}
		return parent.right = new BinaryNode<T>(x, null, parent.right);
	}
}
