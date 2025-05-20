public class Main {
    public static void main(String[] args) {
        Handler clerk = new ClerkHandler();
        Handler manager = new ManagerHandler();
        Handler director = new DirectorHandler();

        clerk.setNextHandler(manager);
        manager.setNextHandler(director);

        Request request1 = new Request(5000);  // Within clerk's limit
        Request request2 = new Request(30000); // Within manager's limit
        Request request3 = new Request(80000); // Within director's limit
        Request request4 = new Request(150000); // Exceeds maximum limit

        System.out.println("Processing request 1:");
        clerk.handleRequest(request1);
        System.out.println("\nProcessing request 2:");
        clerk.handleRequest(request2);
        System.out.println("\nProcessing request 3:");
        clerk.handleRequest(request3);
        System.out.println("\nProcessing request 4:");
        clerk.handleRequest(request4);
    }
}