
import java.util.LinkedList;
public class MyStack<E> implements Stack<E>{
    LinkedList<E> list;
    public MyStack(){
        list = new LinkedList<E>();
    }
    /**
	 *	Return the Object on the top of the Stack
	 *	If the Stack is empty, return null
	 */
	public E peek(){
	       
	    return list.size() == 0 ? null : list.get(0);
	}
	
	/**
	 *	Add item to the top of the Stack
	 */
	public void push(E item){
	    list.add(0, item);
	   }
	
	/**
	 *	Remove the Object from the top of the Stack and return it
	 *	If the Stack is empty, return null
	 */
	public E pop(){
	       
	       return list.size() == 0 ? null : list.remove(0);
	   }
	
	/**
	 *	Return true is this Stack is empty
	 */
	public  boolean isEmpty(){
	    return list.isEmpty();
	   }
	
	/**
	 *	Return the number of Objects that are in this Stack
	 */
	public int size(){
	    return list.size();
	   }
	   
}