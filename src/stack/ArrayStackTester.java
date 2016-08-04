
package stack;

public class ArrayStackTester {

    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayStack<String> myStack = new ArrayStack<String>(); 
        //instead of the T : now we are defining what kind of object we are using here
        try{
        myStack.push("NYiT");
        myStack.push("NYU");
        myStack.push("PACE");
        myStack.push("MIT");
        myStack.push("Harvard");
        } 
        catch(StackOverflowException e) 
        {
            System.out.println("Catch stack overflow");
        }
        try {
            System.out.println("peek: "+ myStack.peek());
             }
        catch(StackUnderflowException e)
                {
                    System.out.println("Caught stack undeflow.. ");
                }

        /**
         * to catch an exception
         * try 
         * {
         * System.out.println("peek: " + myStack.peek());
         * } catch(e StackUnderflowException) 
         * {
         * System.out.println("Caught stack underflow...");
         */
    }
    
}
