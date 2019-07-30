package _04_队列;

import _01_动态数组.ArrayList;
import _01_动态数组.List;

public class Deque<E> {

	List<E> list=new ArrayList<E>();
	//长度
	int size() {
		return list.size();
	}
	//判断为空
	boolean isEmpty() {
		return list.isEmpty();
	}
	// 从队尾入队 
	void enQueueRear(E element) {
		list.add(element);
	}
	// 从队头入队 
	void enQueueFront(E element) {
		list.add(0,element);
	}
	//从队尾出队
	E deQueueRear() {
		return list.remove(list.size() - 1);
	}
	//获取队列的头元素 
	E front() {
		return list.get(0);
	}
	//获取队列的尾元素
	E rear() {
		return list.get(list.size() - 1);
	}
}
