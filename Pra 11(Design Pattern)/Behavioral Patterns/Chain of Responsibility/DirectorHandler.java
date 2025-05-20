public class DirectorHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() <= 100000) {
            System.out.println("Director approved loan of $" + request.getAmount());
        } else {
            System.out.println("Loan request of $" + request.getAmount() + " exceeds maximum limit");
        }
    }
}