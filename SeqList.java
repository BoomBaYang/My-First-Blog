package list;

public class SeqList<T> extends Object {
	protected Object[] elements;// 对象数组存储顺序表的数据元素，保护成员
	protected int n;// 顺序表的元素个数

	public SeqList(int length) {
		this.elements = new Object[length];// 申请数组的存储空间，元素为null
		this.n = 0;
	}

	public SeqList() {
		this(64);
	}

	public boolean isEmpty() {
		return this.n == 0;
	}

	public int size() {
		return this.n;
	}

	public T get(int i) {
		if (i >= 0 && i < this.n) {
			return (T) this.elements[i];
		}
		return null;
	}

	// set方法，设置第i个元素为x1
	public void set(int i, T x1) {
		if (x1 == null) {
			throw new NullPointerException("x1=null");
		}
		if (i >= 0 && i < this.n) {
			this.elements[i] = x1;
		} else
			throw new java.lang.IndexOutOfBoundsException(i + "");
	}

	// insert方法
	public int insert(int i, T x1) {
		if (x1 == null) {
			throw new NullPointerException("x1=null");
		}
		if (i < 0)
			i = 0;// 插入位置i容错，插入在最前
		if (i > this.n)
			i = this.n;// 插入在最后
		Object[] source = this.elements;
		if (this.n == elements.length) {
			this.elements = new Object[source.length * 2];
			for (int j = 0; j < i; j++) {
				this.elements[j] = source[j];
			}
		}
		for (int j = this.n - 1; j >= i; j--) {
			this.elements[j + 1] = source[j];// 从i开始至表尾的元素向后移，次序从后向前
		}
		this.elements[i] = x1;
		this.n++;
		return i;
	}

	public int insert(T x1) {
		return this.insert(this.n, x1);
	}

	// remove方法
	public T remove(int i) {
		if (this.n > 0 && i >= 0 && i < this.n) {
			T old = (T) this.elements[i];
			for (int j = i; j < this.n - 1; j++) {
				this.elements[j] = this.elements[j + 1];
			}
			this.elements[this.n - 1] = null;
			this.n--;
			return old;
		}
		return null;
	}

	// clear方法 清空顺序表
	public void clear() {
		this.n = 0;
	}
}
