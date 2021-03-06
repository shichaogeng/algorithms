package com.gengsc.algorithms.linked;

import com.gengsc.algorithms.stack.ResizingArrayStack;
import edu.princeton.cs.algs4.StdIn;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-30 11:48
 */
public class StackTest {
    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.println(stack.pop()+" ");
            }
        }
        System.out.println("("+stack.size()+" left on stack )");
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
