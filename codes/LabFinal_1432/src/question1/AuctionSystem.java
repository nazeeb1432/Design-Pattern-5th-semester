package question1;

public class AuctionSystem {
    public static void main(String[] args) {
        Auction auction = new Auction("Antique Vase", 100);

        AuctionBidder bidder1 = new AuctionBidder("Alice", 1);
        AuctionBidder bidder2 = new AuctionBidder("Bob", 2);
        AuctionBidder bidder3 = new AuctionBidder("Charlie", 3);

        auction.registerBidder(bidder1);
        auction.registerBidder(bidder2);
        auction.registerBidder(bidder3);

        auction.newBid(1, 120);
        auction.newBid(2, 150);
        auction.newBid(3, 200);
        auction.newBid(1, 180);
    }
}