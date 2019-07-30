package _04_队列;

import _01_动态数组.ArrayList;
import _01_动态数组.List;

public class Queue<E> {
	
	List<E> list=new ArrayList<E>();
	
	 int size() {
		 return list.size();
	 } // 元素的数量 
	 
	//判断是否为空
	 boolean isEmpty() {
		 return list.isEmpty();
	 }
	 //清空
	 void clear() {
		 list.clear();
	 } 
	 //入队
	 void enQueue(E element){
		 list.add(element);
	 }
	 
	 //出队
	 E deQueue(){
		 return  list.remove(0);
	 }
	 E front(){
		 return list.get(0);
	 }
	 
	 

}
