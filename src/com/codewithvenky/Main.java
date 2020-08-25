package com.codewithvenky;

public class Main {

    public static void main(String[] args) {
        StringReverser stack =  new StringReverser();
        ExpressionChecker expChecker = new ExpressionChecker();

        System.out.println(stack.reverse("abcd"));
        System.out.println(expChecker.isBalanced("(abcd(1+2"));
    }
}
