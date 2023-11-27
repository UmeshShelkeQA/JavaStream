package collections;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Iterator;

// Custom class to represent tasks with priorities
class Task {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class QueueUse {
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator
        PriorityQueue<Task> taskQueue = new PriorityQueue<>((task1, task2) ->{
                return Integer.compare(task1.getPriority(), task2.getPriority());
            }
        );
       
        Task tsk = new Task("Task 1", 3);
        // Add tasks to the priority queue
        taskQueue.offer(new Task("Task 1", 3));
        taskQueue.offer(new Task("Task 2", 1));
        taskQueue.offer(new Task("Task 3", 2));
        taskQueue.offer(new Task("Task 4", 5));
        taskQueue.offer(new Task("Task 5", 4));
        taskQueue.offer(tsk);
        taskQueue.offer(tsk);
//        taskQueue.add(null); --> NullPointerException
        taskQueue.offer(null);
        
       
        System.out.println("Peek of the Queue: " + taskQueue.peek());
        System.out.println("Poll of the Queue: " + taskQueue.poll());
        System.out.println("Peek of the Queue: " + taskQueue.peek());
        
        
        //iterating Queue using Iterator
        Iterator<Task> it = taskQueue.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        // Poll and process tasks in priority order
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing: " + task);
        }
        
    }
}
