package _04_����;

import _01_��̬����.ArrayList;
import _01_��̬����.List;

public class Deque<E> {

	List<E> list=new ArrayList<E>();
	//����
	int size() {
		return list.size();
	}
	//�ж�Ϊ��
	boolean isEmpty() {
		return list.isEmpty();
	}
	// �Ӷ�β��� 
	void enQueueRear(E element) {
		list.add(element);
	}
	// �Ӷ�ͷ��� 
	void enQueueFront(E element) {
		list.add(0,element);
	}
	//�Ӷ�β����
	E deQueueRear() {
		return list.remove(list.size() - 1);
	}
	//��ȡ���е�ͷԪ�� 
	E front() {
		return list.get(0);
	}
	//��ȡ���е�βԪ��
	E rear() {
		return list.get(list.size() - 1);
	}
}
