import java.util.Stack;

import javax.swing.Popup;

public class QueueUsingStack {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.stack1 = new Stack<Integer>();
		queue.stack2 = new Stack<Integer>();
		enqueue(queue, 1);
		enqueue(queue, 2);
		enqueue(queue, 3);
		
		 System.out.print(deQueue(queue)+" ");
	     System.out.print(deQueue(queue)+" ");
	     System.out.println(deQueue(queue)+" ");
	}

	static int deQueue(Queue queue) {
	   int x;
	   /* If both stacks are empty then error */
       if(queue.stack1.isEmpty() && queue.stack2.isEmpty() )
       {
           System.out.println("Q is empty");
           System.exit(0);
       }
	   if(queue.stack2.isEmpty()){
		   while(!queue.stack1.isEmpty()){
			   x = queue.stack1.pop();
			   push(queue.stack2, x);
		   }
		   
	   }
	    x = pop(queue.stack2);
		return x;
	}

	static void enqueue(Queue queue, int i) {
		push(queue.stack1, i);
	}

	/* class of queue having two stacks */
	static class Queue {
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}
	 /* Function to push an item to stack*/
    static void push(Stack<Integer> top_ref, int new_data)
    {
        //Push the data onto the stack
        top_ref.push(new_data);
    }
    static int pop(Stack<Integer> top_ref)
    {
        /*If stack is empty then error */
        if(top_ref.isEmpty())
        {
            System.out.println("Stack Overflow");
            System.exit(0);    
        }
        //pop the data from the stack
        return top_ref.pop(); 
    }

}
