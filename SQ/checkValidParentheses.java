package SQ;

import java.util.Stack;

public class checkValidParentheses {
    public boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch== '(' || ch== '{' || ch=='['){
                stack.push(ch);
            }else{
                if(ch==')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
                if(ch=='}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
                if(ch==']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        checkValidParentheses obj = new checkValidParentheses();

        String test1 = "()[]{}";
        String test2 = "(]";
        String test3 = "({[]})";
        String test4 = "(((";

        System.out.println(test1 + " -> " + obj.isValid(test1));
        System.out.println(test2 + " -> " + obj.isValid(test2));
        System.out.println(test3 + " -> " + obj.isValid(test3));
        System.out.println(test4 + " -> " + obj.isValid(test4));
    }
}