package org.sunbeam.dac.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Program {
	public static void main(String[] args) {
		Deque<Integer> que = new ArrayDeque<Integer>();
		//TODO
	}
	public static void main2(String[] args) {
		Queue<Integer> que = new ArrayDeque<>();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		que.offer(50);
		
		Integer ele = null;
		while( !que.isEmpty( ) ) {
			ele = que.peek();
			System.out.print(ele+"	");
			que.poll();
		}
	}
	public static void main1(String[] args) {
		Queue<Integer> que = new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		
		Integer ele = null;
		while( !que.isEmpty()) {
			ele = que.element();
			System.out.print(ele+"	");
			que.remove();
		}
	}
}
