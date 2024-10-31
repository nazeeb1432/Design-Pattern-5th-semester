class SecurityService {
    public boolean verifyPin(String cardNumber, String pin) {
        // Verify if the PIN is correct for the card
        System.out.println("SecurityService: Verifying PIN for card " + cardNumber);
        return "1234".equals(pin); // Hardcoded for simplicity
    }
}

