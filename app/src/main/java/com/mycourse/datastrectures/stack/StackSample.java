package com.mycourse.datastrectures.stack;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        Stack<Integer> items = new Stack<>();
        items.push(1);
        items.push(2);
        items.push(3);
        items.push(4);
        items.push(5);

        System.out.println("Initial stack "+items);
        System.out.println("pop stack "+items.pop());
        System.out.println("remaining stack "+items);
        System.out.println("search stack "+items.search(3));

        /*Stack are used in real world like recursion , undo and redo operation of recent changes */
    }
}
