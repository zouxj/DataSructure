package _04_����;

import _01_��̬����.ArrayList;
import _01_��̬����.List;

public class Queue<E> {
	
	List<E> list=new ArrayList<E>();
	
	 int size() {
		 return list.size();
	 } // Ԫ�ص����� 
	 
	//�ж��Ƿ�Ϊ��
	 boolean isEmpty() {
		 return list.isEmpty();
	 }
	 //���
	 void clear() {
		 list.clear();
	 } 
	 //���
	 void enQueue(E element){
		 list.add(element);
	 }
	 
	 //����
	 E deQueue(){
		 return  list.remove(0);
	 }
	 E front(){
		 return list.get(0);
	 }
	 
	 

}
