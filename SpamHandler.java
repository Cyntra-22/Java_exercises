public class SpamHandler extends Handler{
    public void handleRequest(String emailType) {
        if (emailType.equalsIgnoreCase("spam")) {
            System.out.println("SpamHandler: This email is spam. Deleting it.");
        } else if (successor != null) {
            successor.handleRequest(emailType);
        }
    }
}
