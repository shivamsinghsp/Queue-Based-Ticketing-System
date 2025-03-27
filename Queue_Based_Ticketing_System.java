import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TicketingSystem {
    private Queue<String> ticketQueue = new LinkedList<>();

    // Add a customer to the queue
    public void addCustomer(String name) {
        ticketQueue.offer(name);
        System.out.println("✅ " + name + " has taken a ticket and is added to the queue.");
    }

    // Serve the next customer in line
    public void serveCustomer() {
        if (!ticketQueue.isEmpty()) {
            String servedCustomer = ticketQueue.poll();
            System.out.println("🎟️ Serving customer: " + servedCustomer);
        } else {
            System.out.println("🚫 No customers in the queue!");
        }
    }

    // Display the queue status
    public void displayQueue() {
        if (!ticketQueue.isEmpty()) {
            System.out.println("\n📋 Current Queue: " + ticketQueue);
        } else {
            System.out.println("\n🚫 The queue is empty.");
        }
    }

    // Check if the queue is empty
    public boolean isQueueEmpty() {
        return ticketQueue.isEmpty();
    }
}

public class Queue_Based_Ticketing_System {
    public static void main(String[] args) {
        TicketingSystem ticketSystem = new TicketingSystem();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== 🎟️ Queue-Based Ticketing System ===");
            System.out.println("1️⃣ Add Customer to Queue");
            System.out.println("2️⃣ Serve Next Customer");
            System.out.println("3️⃣ Display Queue");
            System.out.println("4️⃣ Exit");
            System.out.print("👉 Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    ticketSystem.addCustomer(name);
                    break;
                case 2:
                    ticketSystem.serveCustomer();
                    break;
                case 3:
                    ticketSystem.displayQueue();
                    break;
                case 4:
                    System.out.println("🚀 Exiting Ticketing System. Have a great day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice! Please enter a valid option.");
            }
        }
    }
}
