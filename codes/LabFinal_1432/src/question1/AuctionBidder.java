package question1;

// Concrete Observer
class AuctionBidder implements Bidder {
    private String name;
    private int paddleNumber;

    public AuctionBidder(String name, int paddleNumber) {
        this.name = name;
        this.paddleNumber = paddleNumber;
    }

    @Override
    public void update(String product, double newBid, int bidderId) {
        System.out.println(name + " received update: New bid on " + product + " is $" + newBid
                + " by bidder #" + bidderId);
    }

    public int getPaddleNumber() {
        return paddleNumber;
    }
}