public class Main {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();

        // Client makes a payment to order pizza using the simplified interface
        String cardNumber = "123456789";
        String pin = "1234";
        double amount = 25.0;
        String operationType = "Pizza Order";

        boolean success = paymentFacade.makePayment(cardNumber, pin, amount, operationType);
        if (success) {
            System.out.println("Main: Payment successful! Pizza will be delivered soon.");
        } else {
            System.out.println("Main: Payment failed. Please check your card details.");
        }
    }
}
