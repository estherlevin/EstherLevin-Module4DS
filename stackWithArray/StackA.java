package stackWithArray;

public class StackA<T> {
	private T items[];
    private int top;
    
    public StackA() {
      //instantiate the array so that it can hold at most 5 references
      //initialize top so that it doesn't reference any element within 'items'
    	items = (T[])new Object[5];      //an array of Object references is allocated and typecasted to an array of references to T
        top = -1;
    }
    
    public void push(T item) {
        //if the array, 'items' isn't filled to capacity , insert a reference to 'item' into the array, 'items'
        //modify 'top' to reflect this change
        //otherwise, throw StackOverFlowException
    	if((top + 1) == items.length) {   		
    		throw new StackOverFlowException();
    	}
    	else { 
    		items[++top] = item;
    	}
    }
    
    public void pop() {
       //if the stack is empty , throw StackUnderFlowException
        //otherwise, modify top, to reflect that the top value has been "removed"
    	if(top == -1) {
    		throw new StackUnderFlowException();
    	}
    	
    	items[top] = null;
	    top--;  
    }
    
    public T top() {
        //if the stack is empty throw StackUnderFlowException
        //otherwise return a shallow copy of the value that has been inserted most recently onto the stack
    	if(top == -1) {
    		throw new StackUnderFlowException();
    	}
    	return items[top];
    }
    
    public boolean isEmpty() {
        //return true if the stack is empty, otherwise return false
    	return top == -1;
    }
    
    public boolean isFull() {
        //return true if the stack is filled to capacity (has 5 data references) 
        //otherwise return false
    	return (top + 1) == items.length;
}
    
    public String toString() {
      //return contents of the array 'items' is Stack related order
      //Example:  if the values :  100,  500,  600 , 700 were pushed onto the stack
      //   return [700, 600, 500, 100]
    	StringBuilder str = new StringBuilder("[");
        for(int ctr = top; ctr > -1; ctr--) {
        	if(ctr != 0) {
        		str.append(items[ctr] + ", ");
        	}
        	else
        		str.append(items[ctr]);
        }
    	str.append("]");
        return str.toString();  
    }
}
