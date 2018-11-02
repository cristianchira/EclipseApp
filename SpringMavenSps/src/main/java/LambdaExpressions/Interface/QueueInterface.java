package LambdaExpressions.Interface;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
	 public static void main(String[] args) throws InterruptedException {
	        int time = 10;
	        Queue<Integer> queue = new ArrayDeque<Integer>();
	        //Queue<Integer> queue = new LinkedList<Integer>();

	        for (int i = time; i >= 0; i--)
	           
	            queue.add(i);

	        while (!queue.isEmpty()) {
	            System.out.println(queue.remove());
	            Thread.sleep(2000);
	        }
	    }
	 
	}

