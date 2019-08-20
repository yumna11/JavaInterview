import java.util.Stack;

public class ParanthesisProblem {

    //declare a character stack

    public static void main(String[] args) {

        char exp[] = {'{','(',')','}','[',']'};
        if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

    }

    private static boolean areParenthesisBalanced(char exp[]) {
        Stack stack = new Stack();

        for (int i=0;i<exp.length;i++){
            if (exp[i]=='[' || exp[i]=='{' || exp[i]=='(')
                stack.push(exp[i]);
            if (exp[i]==']' || exp[i]=='}' || exp[i]==')'){
                if (stack.isEmpty())
                    return false;
                else if ( ! isMatchingPair(stack.pop(),exp[i]))
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    private static boolean isMatchingPair(char char1, char char2){
        if (char1=='[' && char2==']')
            return true;
        else  if (char1=='{' && char2=='}')
            return true;
        else  if (char1=='(' && char2==')')
            return true;
        else
            return false;
    }


    static class Stack{
        int top = -1;
        char[] items = new char[100];

        void push(char x){
            if (top == 99){
                System.out.println("Stack is full");
            }else {
                items[++top] = x;
            }
        }

        char pop(){
            if (top==-1){
                System.out.println("Stack is underflow");
                return '\0';
            }else {
                char element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty(){
            return (top==-1) ? true : false;
        }

    }
}
