

import java.util.LinkedList;
public class MyQueue<E> implements Queue<E>{
    LinkedList<E> list;
    public MyQueue(){
         list = new LinkedList<E>();
    }
    
    
    /**
	 *	Return the Object at the beginning of this Queue
	 *	If the Queue is empty, return null
	 */
	public E peek(){
	       return list.size() == 0 ? null : list.get(0);
	   }
	
	/**
	 *	Add obj to the end of this Queue
	 */
	public boolean add(E obj){
	       return list.add(obj);
	   }
	
	/**
	 *	Remove the Object from the front of this Queue and return it.
	 *	If the Queue is empty, return null
	 */
	public E remove(){  return  list.size() == 0 ? null : list.remove(0);}
	
	/**
	 *	Return true if this Queue is empty
	 */
	public boolean isEmpty(){
	    return list.isEmpty();
	   }
	
	/**
	 *	Return the number of Objects in this Queue
	 */
	public int size(){
	   return list.size();}
}