public class FanHandler extends Handler {
    public void handleRequest(String emailType) {
        if (emailType.equalsIgnoreCase("fan")) {
            System.out.println("FanHandler: This is fan mail. Forwarding to the marketing team.");
        } else if (successor != null) {
            successor.handleRequest(emailType);
        }
    }

}
 