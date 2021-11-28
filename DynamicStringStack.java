/*
*   - Manual Fixed Stack Implementation for Postfix to Infix evaluation - 
*   -- For String data type only --
* 
*   -Github Release-
*   Made for University of Cebu - Banilad, BSIT 2-A project
*
*/

package StackObject;

public class DynamicStringStack{
    int size = 5, // initial size of the stack
        top = 0; //  index for the top of the stack

    String[] stack = new String[size]; // the stack

    // verify if the stack is empty
    boolean isEmpty(){
        return top <= 0;
    }

    // push adds data into the stack
    public void push(String data){
        stack[top] = data;
        top += 1;

        if(top == size)
            expand();
    }

    // expand if the array is full
    private void expand(){
        String[] new_stack = new String[top + 1];

        for(int i = 0; i < new_stack.length; i++){
            if(i != stack.length)
                new_stack[i] = stack[i];
            else
                new_stack[i] = "\0";
        }
        stack = new_stack;
        size += 1;
    }
    
    // removes data from the top stack
    public String pop(){
        String data = "nothing";
        if(isEmpty()){
            System.out.println("The stack is empty!");
        }
        else{
            data = stack[top - 1];
            shrink();
            top -= 1;
            return data;
        }
        return data;
    }

    // shrink the array to save memory 
    private void shrink(){
        String[] new_stack = new String[top - 1];

        for(int i = 0; i < new_stack.length; i++){
            if(i == stack.length)
                break;
            else
                new_stack[i] = stack[i];
        }
        
        stack = new_stack;
        size -= 1;
    }

    // view the top element
    public String peek(){
        return stack[top - 1];
    }

    // display every element in the stack
    public void show(){
        for(String s: stack){
            System.out.printf("%s\t", s);
        }
        System.out.println();
    }
}