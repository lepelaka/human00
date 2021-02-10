package chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionEx4 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println(stack);
		System.out.println(queue);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(stack);
		System.out.println(queue);
		
	}
}
