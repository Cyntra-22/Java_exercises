public class ComplaintHandler extends Handler {
    public void handleRequest(String emailType) {
        if (emailType.equalsIgnoreCase("complaint")) {
            System.out.println("ComplaintHandler: This is a complaint. Forwarding to the support team.");
        } else if (successor != null) {
            successor.handleRequest(emailType);
        }
    }
}
