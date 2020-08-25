package com.codewithvenky;


public class StringReverser {

    private java.util.Stack<Character> stack;

    public StringReverser(){
        stack =  new java.util.Stack<Character>();
    }

    public String reverse(String charString){

        if(charString == null)
            throw new IllegalArgumentException();

        for(int i=0;i<charString.length();i++){
            stack.push(charString.charAt(i));
        }
        StringBuffer returnString = new StringBuffer();

        for(int j=0;j<charString.length();j++){
            returnString.append(stack.pop());
        }
        return returnString.toString();
    }
}
