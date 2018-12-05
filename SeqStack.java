package model;

import list.SeqList;

public final class SeqStack<T> implements Stack<T> {
	private SeqList<T> list;

	public SeqStack(int length) {
		this.list = new SeqList<T>(length);
	}

	public SeqStack() {
		this(64);
	}
	//判断是否为空栈
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.list.isEmpty();
	}
	//入栈
	@Override
	public void push(T x) {
		// TODO Auto-generated method stub
		this.list.insert(x);
	}
	//返回栈顶元素（未出栈）
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return this.list.get(list.size()-1);
	}
	//出栈，返回栈顶元素
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return list.remove(list.size()-1);
	}

}
