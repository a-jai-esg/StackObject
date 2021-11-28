/*
*   - Manual Fixed Stack Implementation for Postfix to Infix evaluation - 
*   -- For String data type only --
* 
*   -Github Release-
*   Made for University of Cebu - Banilad, BSIT 2-A project
*/

package StackObject;

public class FixedStringStack{
    String[] stack = new String[5]; // the stack
    int top = 0; // index for the top of the stack

    // verify if the stack is empty
    boolean isEmpty(){
        return top < stack.length;
    }

    // push adds data into the stack
    public void push(String data){
        if(top < stack.length){
            stack[top] = data;
            top += 1;
        }
    }

    // remove the top of the stack
    public String pop(){
        String data = "nothing";
        if(top <= 0){
            System.out.println("The stack is empty!");
        }
        else{
            top -= 1;
            data = stack[top];
            stack[top] = "null"; //overwrite
            return data;
        }
        return data;
    }

    // view the top of the stack
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