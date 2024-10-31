class PaymentFacade {
    private AccountService accountService;
    private SecurityService securityService;
    private BalanceService balanceService;
    private LedgerService ledgerService;
    private NotificationService notificationService;

    public PaymentFacade() {
        accountService = new AccountService();
        securityService = new SecurityService();
        balanceService = new BalanceService();
        ledgerService = new LedgerService();
        notificationService = new NotificationService();
    }

    public boolean makePayment(String cardNumber, String pin, double amount, String operationType) {
        System.out.println("PaymentFacade: Initiating " + operationType + " payment process...");

        if (!accountService.checkAccount(cardNumber)) {
            System.out.println("PaymentFacade: Invalid account.");
            return false;
        }

        if (!securityService.verifyPin(cardNumber, pin)) {
            System.out.println("PaymentFacade: Incorrect PIN.");
            return false;
        }

        if (!balanceService.checkBalance(cardNumber, amount)) {
            System.out.println("PaymentFacade: Insufficient balance.");
            return false;
        }

        ledgerService.makeEntry(cardNumber, amount);
        notificationService.sendNotification(cardNumber, "Payment of $" + amount + " for " + operationType + " was successful.");

        System.out.println("PaymentFacade: Payment completed successfully.");
        return true;
    }
}
