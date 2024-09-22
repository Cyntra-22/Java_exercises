public interface EmailHandlerTest {
    public static void main(String[] args) {

        Handler spamHandler = new SpamHandler();
        Handler fanHandler = new FanHandler();
        Handler complaintHandler = new ComplaintHandler();
        Handler newLocationHandler = new NewLocationHandler();

        
        spamHandler.setSuccessor(fanHandler);
        fanHandler.setSuccessor(complaintHandler);
        complaintHandler.setSuccessor(newLocationHandler);

        
        String[] emails = {"fan", "spam", "complaint", "new request", "random"};

        
        for (String email : emails) {
            System.out.println("Processing email: " + email);
            spamHandler.handleRequest(email);
            System.out.println();
        }
    }
}
