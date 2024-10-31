class BalanceService {
    public boolean checkBalance(String cardNumber, double amount) {
        // Check if the card has sufficient balance
        System.out.println("BalanceService: Checking balance for card " + cardNumber);
        return amount <= 1000; // Hardcoded balance limit for simplicity
    }
}
