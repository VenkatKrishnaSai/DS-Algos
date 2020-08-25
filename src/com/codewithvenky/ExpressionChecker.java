package com.codewithvenky;

import java.util.Stack;

public class ExpressionChecker {

    private Stack<Character> stack;

    public ExpressionChecker(){
        stack =  new Stack<Character>();
    }

    public boolean isBalanced(String exp){
        for(char ch : exp.toCharArray()){
            if(ch == '['|| ch == '{'|| ch == '<'|| ch == '('){
                stack.push(ch);
            }
            else if( ch == ']'){
                if(stack.empty()) return false;
                char item = stack.pop();
                if(item != '['){
                    return false;
                }
            }
            else if( ch == '}'){
                if(stack.empty()) return false;
                char item = stack.pop();
                if(item != '{'){
                    return false;
                }
            }
            else if( ch == '>'){
                if(stack.empty()) return false;
                char item = stack.pop();
                if(item != '<'){
                    return false;
                }
            }
            else if( ch == ')'){
                if(stack.empty()) return false;
                char item = stack.pop();
                if(item != '('){
                    return false;
                }
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}
