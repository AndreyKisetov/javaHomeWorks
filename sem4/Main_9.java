package sem4;

import java.util.*;

public class Main_9 {
    public static void main(String[] args) {
        // 0.1) Написать метод, который принимает массив элементов, 
        // помещает их в стэк и выводит на консоль содержимое стэка.
        LinkedList<String> stack = new LinkedList<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        
        System.out.println(stack);

        String poll = stack.poll();
        String peek = stack.peek();
        String remove = stack.remove();

        System.out.println("Poll = " + poll);
        System.out.println("Peek = " + peek);
        System.out.println("Remove = " + remove);

        System.out.println(stack + "\n");
        
        // 0.2) Написать метод, который принимает массив элементов, 
        // помещает их в очередь и выводит на консоль содержимое очереди.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);

        Integer poll_ = queue.poll();
        Integer peek_ = queue.peek();
        Integer remove_ = queue.remove();

        System.out.println("Poll = " + poll_);
        System.out.println("Peek = " + peek_);
        System.out.println("Remove = " + remove_);

        System.out.println(queue + "\n");

        // 1) Пусть дан LinkedList с несколькими элементами. 
        // Реализуйте метод, который вернет “перевернутый” список.
        Collections.reverse(stack);
        System.out.println("ReverseLinkedList = " + stack + "\n");
    }
}
