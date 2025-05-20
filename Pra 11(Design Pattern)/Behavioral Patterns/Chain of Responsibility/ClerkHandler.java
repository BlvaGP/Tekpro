public class ClerkHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Clerk approved loan of $" + request.getAmount());
        } else if (nextHandler != null) {
            System.out.println("Clerk forwarded loan request of $" + request.getAmount() + " to next level");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for loan of $" + request.getAmount());
        }
    }
}