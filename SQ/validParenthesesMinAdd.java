package SQ;

import java.util.Stack;

public class validParenthesesMinAdd {

    public int isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            } else { 
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.size(); 
    }

    public static void main(String[] args) {
        validParenthesesMinAdd obj = new validParenthesesMinAdd();

        String test1 = "())";
        String test2 = "(((";
        String test3 = "()";
        String test4 = "()))((";

        System.out.println(test1 + " -> " + obj.isValid(test1));
        System.out.println(test2 + " -> " + obj.isValid(test2));
        System.out.println(test3 + " -> " + obj.isValid(test3));
        System.out.println(test4 + " -> " + obj.isValid(test4));
    }
}