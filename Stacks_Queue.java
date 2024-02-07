// Programmed by: FAGELA, LUCCI ANIA LUISSE J.
// Activity: Stacks and Queues Algorithm 
// Date of Submission: February 08,2024 

import java.util.*;

public class Stacks_Queue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Stacks or Queue Menu
        System.out.println("Select Algorithm:");
        System.out.println("1. Stacks");
        System.out.println("2. Queue");
        System.out.print("Enter input: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Stacks1
            performStackOperations(scanner);
        } else if (choice == 2) {
            // Queue
            performQueueOperations(scanner);
        } else {
            System.out.println("Invalid choice. Please choose 1 for Stacks or 2 for Queue.");
        }
    }

    private static void performStackOperations(Scanner scanner) {
        Stack<Integer> stack = new Stack<>();
        int operation = 0;

        System.out.print("Enter upper bound: "); 
        int upperBound = scanner.nextInt(); 

        while (operation != 3) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Finish");
            System.out.print("Enter input: ");
            operation = scanner.nextInt();

            if (operation == 1){
                if (stack.size() < upperBound){
                    System.out.println("Enter input: "); 
                    int input = scanner.nextInt(); 

                    stack.push(input);
                    System.out.println("Pushed " + input + " into the stack");
                } else{
                    System.out.println("The stack is FULL!");
                }
            }

            else if (operation == 2){
                if(!stack.isEmpty()) {
                    System.out.println("Popped " + stack.pop() + " from the stack");
                } else {
                    System.out.println("The Stack is EMPTY!");
                }
            }
        }
        System.out.println("Stack: " + stack);
    }

    private static void performQueueOperations(Scanner scanner) {
        Queue<Integer> queue = new LinkedList<>();

        int operation = 0;

        System.out.print("Enter upper bound: "); 
        int top = scanner.nextInt(); 

        while (operation != 3) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Finish");
            System.out.print("Enter input: ");
            operation = scanner.nextInt();

            if (operation == 1){
                if (queue.size() < top){
                    System.out.println("Enter value: "); 
                    int input = scanner.nextInt(); 

                    queue.add(input);
                    System.out.println("Enqueued " + input + " into the queue");
                } else{
                    System.out.println("The queue is FULL!");
                }
            }

            else if (operation == 2){
                if(!queue.isEmpty()) {
                    System.out.println("Dequeued " + queue.remove() + " from the queue");
                } else {
                    System.out.println("The queuep is EMPTY!");
                }
            }
        }
        System.out.println("Queue:" + queue);
    } 
}
