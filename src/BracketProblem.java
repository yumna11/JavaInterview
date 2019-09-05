import java.util.Stack;

public class BracketProblem {

    //Given an expression string exp ,
    // write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.

    public static void main(String[] args) {

        char exp[] = {'{','(',')','}','[',']'};
        if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

    }

    private static boolean areParenthesisBalanced(char exp[]) {
        //make a variable of Stack class
        //convert string expression to char array
        //traverse each element of array,
        //if the element is opening bracket (,{,[ then push it
        //else check if it's matching pair and call pop method
        Stack stack = new Stack();

        for (int i=0;i<exp.length;i++){
            if (exp[i]=='[' || exp[i]=='{' || exp[i]=='(')
                stack.push(exp[i]);
            if (exp[i]==']' || exp[i]=='}' || exp[i]==')'){
                if (stack.isEmpty())
                    return false;
                else if ( ! isMatchingPair((Character) stack.pop(),exp[i]))
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


}
