class NotificationService {
    public void sendNotification(String cardNumber, String message) {
        // Send notification for the transaction
        System.out.println("NotificationService: Sending notification to " + cardNumber + ": " + message);
    }
}

