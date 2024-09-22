public class NewLocationHandler extends Handler {
    public void handleRequest(String emailType) {
        if (emailType.equalsIgnoreCase("new request")) {
            System.out.println("NewLocationHandler: This is a request for a new machine. Forwarding to the sales team.");
        } else if (successor != null) {
            successor.handleRequest(emailType);
        } else {
            System.out.println("No handler found for this email. It falls off the end of the chain.");
        }
    }
}
